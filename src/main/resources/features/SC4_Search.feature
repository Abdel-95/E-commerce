@Runner
Feature: Search | Logged user could search for any products

  Background:user could log in with valid credentials
    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could search for any product

    And user navigate to home page
    When user clicks on search field
    And user search with name of product
    Then user could find relative results
