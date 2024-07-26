package com.juaracoding;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Code to navigate to login page
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        // Code to enter username and password
    }

    @When("I enter invalid username and password")
    public void i_enter_invalid_username_and_password() {
        // Code to enter invalid username and password
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        // Code to verify redirection
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        // Code to verify error message
    }
}
