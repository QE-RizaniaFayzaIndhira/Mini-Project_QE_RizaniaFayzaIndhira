package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class ProductScreen extends BasePageObject {
    private By productTitle(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }

    private By logoutButton(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    @Step
    public void onProductScreen(){
        Assert.assertTrue(waitUntilVisible(productTitle()).isDisplayed());
    }

    @Step
    public void clickLogoutButton(){
        onClick(logoutButton());
    }

    @Step
    public void onProductPageSuccessfully(){
        Assert.assertTrue(waitUntilVisible(productTitle()).isDisplayed());
    }
}
