@Runner

Feature: using Filter |user could filter with color

  Scenario: user could filter with color
    Given logged user navigate to the home page
    When user select a Apparel category then hover to Shoes subcategory
    And filter by Red color