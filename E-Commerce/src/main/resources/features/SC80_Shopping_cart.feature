@Runner

Feature: Shopping Cart | user could add different products to shopping cart

  Scenario: user could add different products to shopping cart
    Given user navigate to The_home_page
    When user add Apple MacBook to the cart
    And user click on add to the cart button
    Then success message appear
    When user add Laptop Samsung to the cart
    And user click on add to the cart button_2
    Then success message appear_2
    When user add gift card to the cart
    And user fills the mandatory fields
    And user click on add to tha cart button_3
    Then success message appear_3
