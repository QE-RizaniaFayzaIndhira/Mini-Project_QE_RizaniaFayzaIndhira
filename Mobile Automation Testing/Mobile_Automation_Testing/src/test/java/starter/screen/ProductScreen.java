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

    private By beliButton(){
        return AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[3]");
    }

    private By productInCart(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"1\"]");
    }

    @Step
    public void onProductScreen(){
        Assert.assertTrue(waitUntilVisible(productTitle()).isDisplayed());
    }

    @Step
    public void clickBeliButton(){
        onClick(beliButton());
    }

    @Step
    public boolean seeProductInCart(){
        return waitUntilVisible(productInCart()).isDisplayed();
    }

    @Step
    public void onProductScreenSuccessfully(){
        Assert.assertTrue(waitUntilVisible(productTitle()).isDisplayed());
    }
}
