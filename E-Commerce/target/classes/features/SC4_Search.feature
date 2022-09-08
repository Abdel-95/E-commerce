@Runner
Feature: Search | Logged user could search for any products

  Scenario: user could search for any product

    And user navigate to home page
    When user clicks on search field
    And user search with name of product
    Then user could find relative results
