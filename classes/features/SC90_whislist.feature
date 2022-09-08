@Runner

Feature: Wishlist | user could add different products to wishlist

  Background:user could log in with valid credentials
    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could add different products to wishlist
    Given user navigate to home_page
    When user add Apple MacBook to wishlist
    And user click on add to wishlist button
    Then success message_1
    When user add Laptop Samsung to wishlist
    And user click on add to wishlist button_2
    Then success message_2
    When user add HP laptop to wishlist
    And user click on add to tha wishlist button_3
    Then success message_3