Feature: As a user i want to register so that i can see product screen

  Background:
    Given user on register screen

  @TCR1.1
  Scenario: As a user i want to register with input valid fullname, valid email, and valid password
    When user click fullname field for register
    And user input valid fullname for register
    And user click email field for register
    And user input valid email for register
    And user click password field for register
    And user input valid password for register
    And user click register button
    Then user on product screen successfully

  @TCR1.2
  Scenario: As a user i want to register with input valid fullname, empty email, and valid password
    When user click fullname field for register
    And user input valid fullname for register
    And user click email field for register
    And user input empty email for register
    And user click password field for register
    And user input valid password for register
    And user click register button
    Then user see "email can not empty" error message

  @TCR1.3
  Scenario: As a user i want to register with input valid fullname, valid email, and empty password
    When user click fullname field for register
    And user input valid fullname for register
    And user click email field for register
    And user input valid email for register
    And user click password field for register
    And user input empty password for register
    And user click register button
    Then user view "password can not empty" error message

  @TCR1.4
  Scenario: As a user i want to register with input empty fullname, valid email, and valid password
    When user click fullname field for register
    And user input empty fullname for register
    And user click email field for register
    And user input valid email for register
    And user click password field for register
    And user input valid password for register
    And user click register button
    Then user can see "fullname can not empty" error message

  @TCR1.5
  Scenario: As a user i want to register with input empty all fields
    When user click fullname field for register
    And user input empty fullname for register
    And user click email field for register
    And user input empty email for register
    And user click password field for register
    And user input empty password for register
    And user click register button
    Then user can view "fullname can not empty", "email can not empty", and "password can not empty" error message

  @TCR1.6
  Scenario: As a user i want to register with input fullname, email, and password that have been registered
    When user click fullname field for register
    And user input fullname
    And user click email field for register
    And user input email
    And user click password field for register
    And user input password
    And user click register button
    Then user get error message "Gagal :("