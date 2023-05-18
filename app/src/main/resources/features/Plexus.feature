@PlexusNewsletter
Feature: Subscribing to the jobs newsletter

  Background: Navigate to user login page
    Given that I am on the subscription page

  Scenario Outline: Sucessful subscription
    When I enter my work email '<email>'
    And I enter my name '<name>'
    And I click on subscribirse
    Then I should get an error message

    Examples:
      | email | name |
      |       |      |
