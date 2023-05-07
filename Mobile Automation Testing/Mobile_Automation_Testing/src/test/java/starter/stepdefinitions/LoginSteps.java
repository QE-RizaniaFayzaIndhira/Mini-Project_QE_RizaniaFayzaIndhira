package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;
import starter.screen.ProductScreen;

public class LoginSteps {
    @Steps
    ProductScreen productScreen;

    @Steps
    LoginScreen loginScreen;

    @Given("user on product screen")
    public void userOnProductScreen() {
        productScreen.onProductScreen();
    }

    @And("user click logout button")
    public void userClickLogoutButton() {
        productScreen.clickLogoutButton();
    }

    @And("user on login screen")
    public void userOnLoginScreen() {
        loginScreen.onLoginScreen();
    }

    @When("user input valid email")
    public void userInputValidEmail() {
        loginScreen.inputValidEmail("riza@gmail.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        loginScreen.inputValidPassword("riza123");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("user on product screen successfully")
    public void userOnProductScreenSuccessfully() {
        productScreen.onProductPageSuccessfully();
    }


}
