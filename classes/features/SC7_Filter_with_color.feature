@Runner

Feature: using Filter |user could filter with color

  Background:user could log in with valid credentials
    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could filter with color
    Given logged user navigate to the home page
    When user select a Apparel category then hover to Shoes subcategory
    And user select shoes subCategory
    Then filter by Red color