Feature: : Login no sistema
  Como um usuário do sistema
  Eu quero poder realizar login
  Para acessar as funcionalidades do sistema

  Scenario: Login bem-sucedido
    Given que estou na página de login
    When eu preencho o campo de usuário com "Admin"
    And eu preencho o campo de senha com 'admin123'
    And eu clico no botão login
    Then eu devo ver a página inicial com a url contendo a palavra 'dashboard'