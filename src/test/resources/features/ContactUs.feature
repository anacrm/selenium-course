#mapping out test requirements
@contact-us @regression

Feature: WebDriver University - Contact Us Page

  Background:
    Given I access the webdriver university contact us page

  Scenario: Validate Successful Submission - Unique Data

    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on submit button
    Then I should be presented a successful contact us submission massage

  Scenario: Validate Successful Submission - Specific Data

    When I enter a specific first name Joe
    And I enter a specific last name Reis
    And I enter a specific email address jj@gmail.com
    And I enter a specific comment "Hello world"
    And I click on submit button
    Then I should be presented a successful contact us submission massage
