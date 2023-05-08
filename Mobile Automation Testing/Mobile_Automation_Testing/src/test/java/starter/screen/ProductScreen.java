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

    @Step
    public void onProductPageSuccessfully(){
        Assert.assertTrue(waitUntilVisible(productTitle()).isDisplayed());
    }
}
