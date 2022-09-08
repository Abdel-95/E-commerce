@Runner

Feature: Wishlist | user could add different products to compare list

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