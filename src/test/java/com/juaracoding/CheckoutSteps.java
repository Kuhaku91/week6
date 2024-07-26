package com.juaracoding;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CheckoutSteps {

    @Given("I have items in my cart")
    public void i_have_items_in_my_cart() {
        // Code to ensure there are items in the cart
    }

    @When("I proceed to checkout")
    public void i_proceed_to_checkout() {
        // Code to proceed to checkout
    }

    @Then("the checkout should be successful")
    public void the_checkout_should_be_successful() {
        // Code to verify checkout was successful
    }
}
