@Runner

Feature: Shopping Cart | user could add different products to shopping cart
  Background:user could log in with valid credentials
    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could add different products to shopping cart
    Given user navigate to The_home_page
    When user add Apple MacBook to the cart
    And user click on add to the cart button
    Then success message appear
    When user add Laptop Samsung to the cart
    And user click on add to the cart button_2
    Then success message appear_2
    When user add gift card to the cart
    And user fills the mandatory fields
    And user click on add to tha cart button_3
    Then success message appear_3
