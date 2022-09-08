@Runner

Feature: Different categories | user could select different categories

  Background:user could log in with valid credentials
    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could select different categories

    Given logged user navigate to home page
    When user select Computer categories
    And user select a Electronics categories then hover to camera and photo subcategory
    And  user choose Gift Cards categories
