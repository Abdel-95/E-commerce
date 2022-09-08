@Runner

Feature: make an order | user create a successful Order

  Scenario: user create a successful Order
    Given user navigate to homepage.com
    And user add  MacBook to the cart
    And user click on add to_cart_button
    And user click on shopping cart link
    And user choose to wrapped his order as a gift
    And user check on the agreement checkBox
    When user click on checkout button
    And user fills all mandatory fields
    Then user click on continue button
    And user select ground option and click continue button
    And user select money option and click continue
    Then user click continue button4
    Then user click confirm button
