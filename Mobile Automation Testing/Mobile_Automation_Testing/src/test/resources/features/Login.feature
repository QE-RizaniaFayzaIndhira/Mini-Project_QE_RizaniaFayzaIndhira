Feature: As a user i want to login so that i can see product screen

  Background:
    Given user on login screen

  @TCL2.1
  Scenario: As a user i want to login with input valid email and valid password
    When user click email field
    And user input valid email
    And user click password field
    And user input valid password
    And user click login button
    Then user on product screen successfully

  @TCL2.2
  Scenario: As a user i want to login with input valid email and empty password
    When user click email field
    And user input valid email
    And user click password field
    And user input empty password
    And user click login button
    Then user see error message "password can not empty"

  @TCL2.3
  Scenario: As a user i want to login with input empty email and valid password
    When user click email field
    And user input empty email
    And user click password field
    And user input valid password
    And user click login button
    Then user view error message "email can not empty"

  @TCL2.4
  Scenario: As a user i want to login with input empty email and empty password
    When user click email field
    And user input empty email
    And user click password field
    And user input empty password
    And user click login button
    Then user view error message "email can not empty" and "password can not empty"

  @TCL2.5
  Scenario: As a user i want to login with input invalid email and valid password
    When user click email field
    And user input invalid email
    And user click password field
    And user input valid password
    And user click login button
    Then user can see error message "Email atau password tidak valid."

  @TCL2.6
  Scenario: As a user i want to login with input valid email and invalid password
    When user click email field
    And user input valid email
    And user click password field
    And user input invalid password
    And user click login button
    Then user can see error message "Email atau password tidak valid."

  @TCL2.7
  Scenario: As a user i want to login with input invalid email and invalid password
    When user click email field
    And user input invalid email
    And user click password field
    And user input invalid password
    And user click login button
    Then user can see error message "Email atau password tidak valid."