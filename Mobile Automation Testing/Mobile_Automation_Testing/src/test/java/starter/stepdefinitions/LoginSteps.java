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
    LoginScreen loginScreen;

    @Steps
    ProductScreen productScreen;

    @Given("user on login screen")
    public void userOnLoginScreen() {
        loginScreen.OnLoginScreen();
    }

    @When("user click email field")
    public void userClickEmailField() {
        loginScreen.clickEmailField();
    }

    @And("user click password field")
    public void userClickPasswordField() {
        loginScreen.clickPasswordField();
    }

    @And("user input valid email")
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
        productScreen.onProductScreenSuccessfully();
    }

    @And("user input empty password")
    public void userInputEmptyPassword() {
        loginScreen.inputValidPassword("");
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String arg0) {
        loginScreen.getErrorMessageEmptyPassword();
    }

    @And("user input empty email")
    public void userInputEmptyEmail() {
        loginScreen.inputValidEmail("");
    }

    @Then("user view error message {string}")
    public void userViewErrorMessage(String arg0) {
        loginScreen.getErrorMessageEmptyEmail();
    }

    @Then("user view error message {string} and {string}")
    public void userViewErrorMessageAnd(String arg0, String arg1) {
        loginScreen.getErrorMessageEmptyEmail();
        loginScreen.getErrorMessageEmptyPassword();
    }

    @And("user input invalid email")
    public void userInputInvalidEmail() {
        loginScreen.inputInvalidEmail("rizania@gmail.com");
    }

    @Then("user can see error message {string}")
    public void userCanSeeErrorMessage(String arg0) {
        loginScreen.getErrorMessage();
    }

    @And("user input invalid password")
    public void userInputInvalidPassword() {
        loginScreen.inputInvalidPassword("rizania123");
    }
}
