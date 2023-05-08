Feature: As a user i want to login so that i can see product screen

  Background:
    Given user on product screen
    And user click logout button

  @TCL2.1
  Scenario: As a user i want to login with input valid email and valid password
    When user click email field
    And user input valid email
    And user click password field
    And user input valid password
    And user click login button
    Then user on product screen successfully