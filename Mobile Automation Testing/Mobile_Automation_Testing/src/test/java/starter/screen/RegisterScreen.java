package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {
    private By loginIcon() {
        return AppiumBy.xpath("//android.view.View[@content-desc='Products']/following-sibling::android.widget.Button");
    }

    private By registerLink(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc='Register']");
    }

    private By fullnameField(){
        return AppiumBy.xpath("//android.widget.EditText[@text='Alex Under, Fullname']");
    }

    private By emailFieldForRegister(){
        return AppiumBy.xpath("//android.widget.EditText[@text='alex@email.com, Email']");
    }

    private By passwordFieldForRegister(){
        return AppiumBy.xpath("//android.widget.EditText[@text='123123123, Password']");
    }

    private By registerButton(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc='Register']");
    }

    private By emptyFullnameErrorMessage(){
        return AppiumBy.xpath("//android.view.View[@content-desc='fullname can not empty']");
    }

    private By emptyEmailErrorMessage(){
        return AppiumBy.xpath("//android.view.View[@content-desc='email can not empty']");
    }

    private By emptyPasswordErrorMessage(){
        return AppiumBy.xpath("//android.view.View[@content-desc='password can not empty']");
    }

    private By errorMessage(){
        return AppiumBy.xpath("//android.view.View[@content-desc='Gagal :(']");
    }

    @Step
    public void onRegisterScreen(){
        onClick(loginIcon());
        onClick(registerLink());
        Assert.assertTrue(waitUntilVisible(registerButton()).isDisplayed());
    }

    @Step
    public void clickFullnameField(){
        onClick(fullnameField());
    }

    @Step
    public void inputValidFullname(String fullname){
        onType(fullnameField(), fullname);
    }

    @Step
    public void clickEmailField(){
        onClick(emailFieldForRegister());
    }

    @Step
    public void inputValidEmail(){
        int min = 1;
        int max = 1000000;
        int number = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String email_register = "kenzie" + String.valueOf(number) + "@gmail.com";
        onType(emailFieldForRegister(), email_register);
    }

    @Step
    public void clickPasswordField(){
        onClick(passwordFieldForRegister());
    }

    @Step
    public void inputValidPassword(String password_register){
        onType(passwordFieldForRegister(), password_register);
    }

    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }

    @Step
    public void inputEmptyEmail(String email_register){
        onType(emailFieldForRegister(), email_register);
    }

    @Step
    public boolean getEmptyEmailErrorMessage(){
        return waitUntilVisible(emptyEmailErrorMessage()).isDisplayed();
    }

    @Step
    public void inputEmptyPassword(String password_register){
        onType(passwordFieldForRegister(), password_register);
    }

    @Step
    public boolean getEmptyPasswordErrorMessage(){
        return waitUntilVisible(emptyPasswordErrorMessage()).isDisplayed();
    }

    @Step
    public void inputEmptyFullname(String fullname_register){
        onType(fullnameField(), fullname_register);
    }

    @Step
    public boolean getEmptyFullnameErrorMessage(){
        return waitUntilVisible(emptyFullnameErrorMessage()).isDisplayed();
    }

    @Step
    public void inputFullname(String fullname1){
        onType(fullnameField(), fullname1);
    }

    @Step
    public void inputEmail(String email1){
        onType(emailFieldForRegister(), email1);
    }

    @Step
    public void inputPassword(String password1){
        onType(passwordFieldForRegister(), password1);
    }

    @Step
    public boolean getErrorMessage(){
        return waitUntilVisible(errorMessage()).isDisplayed();
    }
}
