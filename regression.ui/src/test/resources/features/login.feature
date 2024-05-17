
@login
Feature: Login
 Como ususario
 Quero realizar o login
 Para acessar a conta 
 
 Background: Acessar a tela de login
  Given que esteja na tela de login

  @loginPositivo
  Scenario: Login valido
   And preencher o ususario
   And preencher a senha 
   When realizar o login
   Then login realizado com sucesso

   Scenario: user bloqueado 
   But preencher o ususario bloqueado
   And preencher a senha 
   When realizar o login
   Then sistema apresenta mensagem de ususario bloqueado
   
   Scenario: Login com dados invalidos 
   But preencher com ususario invalido
   But preencher a senha invalido
   When realizar o login
   Then sistema apresenta mensagem de ususario e senha invalida
   
   Scenario: Login com dados em branco
   But nao preencher nenhum dado
   When realizar o login
   Then sistema apresenta mensagem de ususario em branco
    