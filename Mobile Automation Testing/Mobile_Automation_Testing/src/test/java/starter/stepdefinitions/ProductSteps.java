package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;
import starter.screen.ProductScreen;

public class ProductSteps {
    @Steps
    ProductScreen productScreen;

    @Steps
    LoginScreen loginScreen;

    @Given("user on product screen")
    public void userOnProductScreen() {
        productScreen.onProductScreen();
    }

    @When("user click beli button")
    public void userClickBeliButton() {
        productScreen.clickBeliButton();
    }

    @Then("user see product in cart")
    public void userSeeProductInCart() {
        productScreen.seeProductInCart();
    }

    @Given("user are login")
    public void userAreLogin() {
        loginScreen.OnLoginScreen();
        loginScreen.clickEmailField();
        loginScreen.inputValidEmail("riza@gmail.com");
        loginScreen.clickPasswordField();
        loginScreen.inputValidPassword("riza123");
        loginScreen.clickLoginButton();
        productScreen.onProductScreen();
    }
}
