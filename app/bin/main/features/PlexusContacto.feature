@PlexusContacto
Feature: Contacting Plexus

  Background: Navigate to contact page
    Given that I am on the contact page

  @Contact
  Scenario: Empty fields
    When I click on the send button
    Then The following fields are highlighted in color.
      | field   | color            |
      | email   |rgb(224, 40, 79)|
      | mensaje |rgb(224, 40, 79)|