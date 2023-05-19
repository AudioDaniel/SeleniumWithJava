@Orange
Feature: Worker profile management

  Background: Navigate to dashboard page
    Given that I am on the login page
    When I enter my credentials
    And I click login
    Then I should see my name in a badge


  Scenario Outline: Creating a new employee
    When I click on PIM button
    And I add a new employee
    And I input the new employee first name: <firstname>
    And I input the new employee middle name: <middlename>
    And I input the new employee last name: <lastname>
    Then I save the employee's profile

    Examples:
      | firstname | middlename | lastname |
      | Jose      | Toledo     | Toledo   |
      | Miguel    | Angel      | Perez    |

  Scenario Outline: Creating new candidate
    When I click on <section> button
    And I add a new employee
    And I input the new employee first name: <firstname>
    And I input the new employee middle name: <middlename>
    And I input the new employee last name: <lastname>
    And I input the new employee mail : <mail>


    Examples:
      | section     | firstname | middlename | lastname | mail                 |
      | Recruitment | Jose      | Toledo     | Toledo   | josetoledo@gmail.com |


  Scenario Outline: Editing profile
    And I click on <section> button
    And I change my nationality to Afghan
    Examples:
      | section |
      | My Info |


  Scenario Outline: Creating new Admin
    When I click on <section> button
    And I add a new employee
    And I select the users role
    And I write the employee's name <name>
    And I select the status as enabled
    And I enter the username <username>
    And I enter the password <password>
    And I click the save button


    Examples:
      | section | username   | password | name               |
      | Admin   | josetoledo | abc123.. | Jose Toledo Toledo |

  Scenario Outline: Navigating through sections
    When I click on <section> button
    Then I should be redirected to the <section> page

    Examples:
      | section     |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Buzz        |
      | Maintenance |
