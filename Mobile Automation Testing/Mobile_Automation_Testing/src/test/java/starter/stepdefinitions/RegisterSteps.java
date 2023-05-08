package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.ProductScreen;
import starter.screen.RegisterScreen;

public class RegisterSteps {
    @Steps
    RegisterScreen registerScreen;

    @Given("user on register screen")
    public void userOnRegisterScreen() {
        registerScreen.onRegisterScreen();
    }

    @When("user click fullname field for register")
    public void userClickFullnameFieldForRegister() {
        registerScreen.clickFullnameField();
    }

    @And("user input valid fullname for register")
    public void userInputValidFullnameForRegister() {
        registerScreen.inputValidFullname("Kenzie");
    }

    @And("user click email field for register")
    public void userClickEmailFieldForRegister() {
        registerScreen.clickEmailField();
    }

    @And("user input valid email for register")
    public void userInputValidEmailForRegister() {
        registerScreen.inputValidEmail();
    }

    @And("user click password field for register")
    public void userClickPasswordFieldForRegister() {
        registerScreen.clickPasswordField();
    }

    @And("user input valid password for register")
    public void userInputValidPasswordForRegister() {
        registerScreen.inputValidPassword("kenzie123");
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        registerScreen.clickRegisterButton();
    }

    @And("user input empty email for register")
    public void userInputEmptyEmailForRegister() {
        registerScreen.inputEmptyEmail("");
    }

    @Then("user see {string} error message")
    public void userSeeErrorMessage(String arg0) {
        registerScreen.getEmptyEmailErrorMessage();
    }

    @And("user input empty password for register")
    public void userInputEmptyPasswordForRegister() {
        registerScreen.inputEmptyPassword("");
    }

    @Then("user view {string} error message")
    public void userViewErrorMessage(String arg0) {
        registerScreen.getEmptyPasswordErrorMessage();
    }

    @And("user input empty fullname for register")
    public void userInputEmptyFullnameForRegister() {
        registerScreen.inputEmptyFullname("");
    }

    @Then("user can see {string} error message")
    public void userCanSeeErrorMessage(String arg0) {
        registerScreen.getEmptyFullnameErrorMessage();
    }

    @Then("user can view {string}, {string}, and {string} error message")
    public void userCanViewAndErrorMessage(String arg0, String arg1, String arg2) {
        registerScreen.getEmptyFullnameErrorMessage();
        registerScreen.getEmptyEmailErrorMessage();
        registerScreen.getEmptyPasswordErrorMessage();
    }

    @And("user input fullname")
    public void userInputFullname() {
        registerScreen.inputValidFullname("Riza");
    }

    @And("user input email")
    public void userInputEmail() {
        registerScreen.inputEmail("riza@gmail.com");
    }

    @And("user input password")
    public void userInputPassword() {
        registerScreen.inputPassword("riza123");
    }

    @Then("user get error message {string}")
    public void userGetErrorMessage(String arg0) {
        registerScreen.getErrorMessage();
    }
}
