@Runner

Feature: Different categories | user could select different categories

  Scenario: user could select different categories

    Given logged user navigate to home page
    When user select Computer categories
    And user select a Electronics categories then hover to camera and photo subcategory
    And  user choose Gift Cards categories
