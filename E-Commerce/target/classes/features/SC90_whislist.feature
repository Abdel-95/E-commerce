@Runner

Feature: Wishlist | user could add different products to wishlist

  Scenario: user could add different products to wishlist
    Given user navigate to home_page
    When user add Apple MacBook to wishlist
    And user click on add to wishlist button
    Then success message_1
    When user add Laptop Samsung to wishlist
    And user click on add to wishlist button_2
    Then success message_2
    When user add HP laptop to wishlist
    And user click on add to tha wishlist button_3
    Then success message_3