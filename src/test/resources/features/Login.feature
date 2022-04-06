#mapping out test requirements
#Cucumber

@login @regression
Feature: WebDriver University - Login Page

  Background:
    Given I access the webdriver university login page

  @login1
  Scenario: Validate successful login
    When I enter username webdriver
    And I enter a password webdriver123
    And I click on login button
    Then I should be presented with the successful login message

  Scenario:  Validate unsuccessful login - invalid username
    When I enter username webdriver1
    And I enter a password webdriver123
    And I click on login button
    Then I should be presented with the unsuccessful login message

  Scenario:  Validate unsuccessful login - invalid password
    When I enter username webdriver
    And I enter a password webdriver1234
    And I click on login button
    Then I should be presented with the unsuccessful login message

  Scenario:  Validate unsuccessful login - invalid password and username
    When I enter username webdriver1
    And I enter a password webdriver1234
    And I click on login button
    Then I should be presented with the unsuccessful login message

  #@ignore
  Scenario Outline: Validate - successful & unsuccessful login
    When I enter username <username>
    And I enter a password <password>
    And I click on login button
    Then I should be presented with the following login validation message <loginValidationMessage>

    Examples:
      | username   | password      | loginValidationMessage |
      | webdriver  | webdriver123  | validation succeeded   |
      | webdriver1 | webdriver123  | validation failed      |
      | webdriver  | webdriver1234 | validation failed      |
      | webdriver1 | webdriver1234 | validation failed      |

