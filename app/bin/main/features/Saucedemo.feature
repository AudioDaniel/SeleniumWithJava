@Saucedemo
Feature: sauceDemoTest

  Background: Navigate to user login page
    Given the user visits SauceDemo page

  Scenario Outline: Successful login
    When I enter my valid email "<email>"
    And I enter my password "<password>"
    When I click on the login button
    Then I should be redirected to the home page

    Examples:
      | email         | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Unsucessful login
    When I click on the login button
    Then an error message is displayed with text: <message>

    Examples:
      | message                 |
      | @PROPERTY_LOGIN_NO_USER |


