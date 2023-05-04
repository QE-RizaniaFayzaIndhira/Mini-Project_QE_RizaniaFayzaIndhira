package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class cartPage extends PageObject {
    private By cartButton(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]");
    }

    private By productInCartTitle(){
        return By.xpath("//*[@id=\"order-11310\"]/div[1]/div[1]");
    }

    @Step
    public void clickCartButton(){
        $(cartButton()).click();
    }

    @Step
    public void seeProductInCart(){
        $(productInCartTitle()).isDisplayed();
    }
}
