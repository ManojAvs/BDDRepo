Feature: Login

	@RegressionTest
  Scenario: Login Validation with valid UserName and Password
    Given Open Chrome browser
    Then Go to Application Home Page
    Then click on Login button
    Then Enter Valid User name and Valid Password
    Then click on login button
    And User redirects to user home page

  
