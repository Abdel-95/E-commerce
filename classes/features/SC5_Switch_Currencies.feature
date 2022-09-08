@Runner
Feature: Switch currencies | logged user could switch between currencies US-Euro

  Background:user could log in with valid credentials
    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
    Then user logged in successfully

  Scenario:logged user could switch between currencies
    Given user navigate to home

    And logged user choose Euro from dropdown menu
   Then user choose Euro successfully
    And user choose US Dollar from dropdown menu
   Then user choose US Dollar successfully