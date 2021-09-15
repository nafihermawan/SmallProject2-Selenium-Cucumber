@CreateAccount
Feature: Create new account

  @NegativeCase
  Scenario: User create account
    Given User open Web Page and click SignIn
    When User input "user1@mailnesia.com" as email address and click button Create Account
    Then The User see error message

  @PositiveCase
  Scenario: User create account
    Given User open Web Page and click SignIn
    When User input "user221@mailnesia.com" as email address and click button Create Account
    And User input "userdua" as first name, User input "dua" as last name and "sekolahqa" as password
    And User select "5" as day, "1" as january and "2000" as year
    Then User already created