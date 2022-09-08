@Runner
Feature: Switch currencies | logged user could switch between currencies US-Euro

  Scenario:logged user could switch between currencies
    Given user navigate to home

    And logged user choose Euro from dropdown menu
    Then user choose Euro successfully
    And user choose US Dollar from dropdown menu
    Then user choose US Dollar successfully