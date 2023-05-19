@Orange
Feature: Worker profile management

  Background: Navigate to dashboard page
    Given that I am on the login page
    Then I enter my credentials
    And I click login

    Scenario: Editing profile
      And I click on profile button
      And I change my nationality to Afghan