Feature: Login Validation

  @sanity @smoke
  Scenario: Login Validation with in valid UserName and Password
    Given Open Chrome
    Then enter Username and Password
      | Username | password |
      | userrrr  | pwdddd   |
    Then close Chrome

  @RegressionTest @sanity
  Scenario Outline: login with multple details
    Then i enter <username> and <password>

    Examples: 
      | username | password |
      | user1    | pwd1     |
      | user2    | pwd2     |
