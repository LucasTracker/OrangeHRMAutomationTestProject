# Usa Alpine como base
FROM alpine:latest

# Define o diretório de trabalho
WORKDIR /app

# Instala Java 21, Maven e dependências necessárias
RUN apk update && apk add --no-cache \
    openjdk21 \
    maven \
    wget \
    unzip \
    chromium \
    chromium-chromedriver \
    bash \
    fontconfig \
    ttf-dejavu

# Define a variável de ambiente para o Java
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk
ENV PATH="$JAVA_HOME/bin:$PATH"

# Copia os arquivos do projeto para o container
COPY pom.xml .
COPY src ./src

# Garante que o diretório do ChromeDriver existe (APÓS copiar os arquivos do projeto)
RUN mkdir -p src/test/resources/webdriver/linux

# Move o ChromeDriver para o local esperado
RUN cp /usr/bin/chromedriver ./src/test/resources/webdriver/linux/chromedriver && \
    chmod +x ./src/test/resources/webdriver/linux/chromedriver && \
    ls -la ./src/test/resources/webdriver/linux/

# Adiciona variáveis de ambiente para apontar para o ChromeDriver em vários locais possíveis
ENV CHROMEDRIVER_PATH=/app/src/test/resources/webdriver/linux/chromedriver
ENV PATH="${PATH}:/app/src/test/resources/webdriver/linux:/usr/bin"

# Baixa dependências e compila o projeto (sem rodar testes)
RUN mvn clean compile -DskipTests

# Configura Chromium e ChromeDriver para rodar no modo headless
ENV CHROME_BIN=/usr/bin/chromium-browser
ENV CHROMEDRIVER_BIN=/app/src/test/resources/webdriver/linux/chromedriver
ENV DISPLAY=:9do9

# Define propriedades do sistema para o WebDriver
ENV JAVA_OPTS="-Dwebdriver.chrome.driver=/app/src/test/resources/webdriver/linux/chromedriver"

# Comando para iniciar os testes (modo headless)
CMD ["sh", "-c", "mvn verify -Dwebdriver.chrome.driver=/app/src/test/resources/webdriver/linux/chromedriver -Dchrome.options=--headless,--no-sandbox,--disable-dev-shm-usage"]