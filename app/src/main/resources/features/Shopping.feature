@SaucedemoShop
Feature: Saucedemo shopping

  Background: Navigate to user login page
    Given the user visits SauceDemo page

  Scenario Outline: Successful login
    When I enter my valid email "<email>"
    And I enter my password "<password>"
    When I make a click on the login button
    And the user add the product '<product>'
    Examples:
      | email         | password     | product             |
      | standard_user | secret_sauce | Sauce Labs Backpack |

  Scenario Outline: Successful login
    When I enter my valid email "<email>"
    And I enter my password "<password>"
    When I make a click on the login button
    And the user add the product '<product>'
    Examples:
      | email         | password     | product             |
      | standard_user | secret_sauce | Sauce Labs Backpack |