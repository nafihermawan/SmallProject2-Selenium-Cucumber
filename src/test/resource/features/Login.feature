@Login
Feature: Login

  @LoginNegative
  Scenario: User input invalid credential
    Given User open the web page and User click SignIn
    When User input "user1@mailnesia.com" as username and "sekolah" as password
    Then User see error message

  @LoginPositive
  Scenario: Username and password match
    Given User open the web page and User click SignIn
    When User input "user1@mailnesia.com" as username and "sekolahqa" as password
    Then User see MyAccount page