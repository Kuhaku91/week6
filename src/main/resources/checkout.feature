Feature: Checkout

  Scenario: Checkout with items in the cart
    Given I have items in my cart
    When I proceed to checkout
    Then the checkout should be successful
