package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By emailField(){
        return AppiumBy.xpath("//android.widget.EditText[@text='Email']");
    }

    private By passwordField(){
        return AppiumBy.xpath("//android.widget.EditText[@text='Password']");
    }

    private By loginButton(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc='Login']");
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
}
