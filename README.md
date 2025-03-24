# OrangeHRMAutomationTestProject

Este é um projeto de automação de testes para o sistema OrangeHRM, desenvolvido utilizando Serenity BDD, Cucumber e Selenium. O objetivo do projeto é automatizar cenários de teste relacionados ao fluxo básico de login e funcionalidades principais da plataforma.

---

## **Índice**
1. [Sobre o Projeto](#sobre-o-projeto)
2. [Principais Funcionalidades](#principais-funcionalidades)
3. [Requisitos](#requisitos)
4. [Como Clonar e Executar o Projeto](#como-clonar-e-executar-o-projeto)
5. [Dependências](#dependências)
6. [Como Rodar os Testes](#como-rodar-os-testes)

---

## **Sobre o Projeto**

O OrangeHRM é uma solução de software de gestão de RH amplamente utilizada. Este projeto automatiza cenários de teste para garantir que funcionalidades básicas, como login e navegação, estejam funcionando corretamente. O projeto utiliza o framework Serenity BDD para geração de relatórios detalhados e o Cucumber para escrever casos de teste em linguagem natural.

---

## **Principais Funcionalidades**

- Automatização de fluxos de login e logout.
- Testes para navegação básica entre páginas.
- Relatórios gerados pelo Serenity BDD com detalhes sobre os cenários executados.

---

## **Requisitos**

Antes de executar o projeto, você precisará ter instalado os seguintes softwares:

- **Java**: Versão 21.
- **Maven**: Para gerenciamento de dependências e execução dos testes.
- **Git**: Para clonar o repositório.
- **ChromeDriver**: Versão compatível com o Google Chrome instalado no sistema.

---

## **Como Clonar e Executar o Projeto**

1. Clone o repositório:
   ```bash
   git clone https://github.com/LucasTracker/OrangeHRMAutomationTestProject.git
   cd OrangeHRMAutomationTestProject

## **Dependências**
2. Instale as dependências do Maven:
    ```bash
   mvn clean install

## **Como Rodar os Testes**
3. Execute os testes:
    ```bash
   mvn clean verify