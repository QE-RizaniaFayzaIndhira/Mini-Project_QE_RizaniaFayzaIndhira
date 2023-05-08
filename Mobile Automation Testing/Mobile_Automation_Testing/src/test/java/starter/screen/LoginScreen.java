package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

    private By loginIcon() {
        return AppiumBy.xpath("//android.view.View[@content-desc='Products']/following-sibling::android.widget.Button");
    }

    private By emailField(){
        return AppiumBy.xpath("//android.widget.EditText[@text='Email']");
    }

    private By passwordField(){
        return AppiumBy.xpath("//android.widget.EditText[@text='Password']");
    }

    private By loginButton(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc='Login']");
    }

    private By errorMessageEmptyEmail(){
        return AppiumBy.xpath("//android.view.View[@content-desc='email can not empty']");
    }

    private By errorMessageEmptyPassword(){
        return AppiumBy.xpath("//android.view.View[@content-desc='password can not empty']");
    }

    private By errorMessage(){
        return AppiumBy.xpath("//android.view.View[@content-desc='Email atau password tidak valid.']");
    }

    @Step
    public void OnLoginScreen(){
        onClick(loginIcon());
        Assert.assertTrue(waitUntilVisible(loginButton()).isDisplayed());
    }

    @Step
    public void clickEmailField(){
        onClick(emailField());
    }

    @Step
    public void inputValidEmail(String email){
        onType(emailField(), email);
    }

    @Step
    public void clickPasswordField(){
        onClick(passwordField());
    }

    @Step
    public void inputValidPassword(String password){
        onType(passwordField(), password);
    }

    @Step
    public void clickLoginButton(){
        onClick(loginButton());
    }

    @Step
    public boolean getErrorMessageEmptyEmail() {
        return waitUntilVisible(errorMessageEmptyEmail()).isDisplayed();
    }

    @Step
    public boolean getErrorMessageEmptyPassword() {
        return waitUntilVisible(errorMessageEmptyPassword()).isDisplayed();
    }

    @Step
    public void inputInvalidEmail(String email){
        onType(emailField(), email);
    }

    @Step
    public void inputInvalidPassword(String password){
        onType(passwordField(), password);
    }

    @Step
    public boolean getErrorMessage() {
        return waitUntilVisible(errorMessage()).isDisplayed();
    }
}
