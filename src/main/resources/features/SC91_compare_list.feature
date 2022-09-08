@Runner

Feature: Wishlist | user could add different products to compare list

  Background:user could log in with valid credentials
    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could add different products to compare list
    Given user navigate to homepage
    When user add Apple MacBook to compare list
    And user click on add to compare list button
    Then success message1
    When user add Laptop Samsung to compare list
    And user click on add to compare list button_2
    Then success message2
    When user add HP laptop to compare list
    And user click on add to compare list button_3
    Then success message3