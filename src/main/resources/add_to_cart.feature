Feature: Add to Cart

  Scenario: Add a product to the cart
    Given I am logged in
    When I add a product to the cart
    Then the product should be in my cart
