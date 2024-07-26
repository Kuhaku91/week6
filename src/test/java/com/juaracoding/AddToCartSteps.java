package com.juaracoding;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AddToCartSteps {

    @Given("I am logged in")
    public void i_am_logged_in() {
        // Code to ensure user is logged in
    }

    @When("I add a product to the cart")
    public void i_add_a_product_to_the_cart() {
        // Code to add product to the cart
    }

    @Then("the product should be in my cart")
    public void the_product_should_be_in_my_cart() {
        // Code to verify product is in cart
    }
}
