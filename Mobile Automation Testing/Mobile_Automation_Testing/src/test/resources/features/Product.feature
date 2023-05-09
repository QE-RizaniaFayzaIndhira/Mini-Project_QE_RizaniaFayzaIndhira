Feature: As a user i want add product to cart so that i can buy the product

  @TCP3.1
  Scenario: As a user i want add product to cart but not login
    Given user on product screen
    When user click beli button
    Then user see product in cart

  @TCP3.2
  Scenario: As a user i want add product to cart
    Given user are login
    When user click beli button
    Then user see product in cart