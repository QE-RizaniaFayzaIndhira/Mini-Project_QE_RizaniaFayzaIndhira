package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By emailField(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    @Step
    public void onLoginScreen(){
        Assert.assertTrue(waitUntilVisible(loginButton()).isDisplayed());
    }

    @Step
    public void inputValidEmail(String email){
        onType(emailField(), email);
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
