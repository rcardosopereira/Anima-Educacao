@Test
Feature: Criar um novo usu�rio

Ao acessar a aplica��o 
Eu preciso registrar um novo usu�rio e ter sucesso ao registrar este usu�rio.

# Scenario Example
@Test1
Scenario: Create Account Successful

Given Accessing the application
When I register my data
Then I should be successful in registering a user
And The page should be finished
