@Runner

Feature: make an order | user create a successful Order
  Background: user could add different products to shopping cart
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

  Scenario: user create a successful Order
    Given user navigate to homepage.com
    And user click on shopping cart link
    And user choose to wrapped his order as a gift
    And user check on the agreement checkBox
    When user click on checkout button
    And user log in
    And user enter his password
    Then user log in successfully
    And user check on the agreement checkBox2
    And user click on checkout button2
    And user fills all mandatory fields
    Then user click on continue button
    And user select ground option and click continue button
    And user select money option and click continue
    And user click continue button4
    And user click confirm button
# Then user completed the order
