@All
Feature: OrangeHRM basic functionality validation
  This feature validates login functionality of OrangeHRM application

  @Login
  Scenario: Validate Login with valid Credentials
    When user enters valid username and password
    And user clicks loginButton
    Then user should be logged into OrangeHRM successfully
    And user should be naviagte to homepage
