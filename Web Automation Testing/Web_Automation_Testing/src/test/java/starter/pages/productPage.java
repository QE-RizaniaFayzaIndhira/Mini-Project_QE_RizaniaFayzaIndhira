package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class productPage extends PageObject {
    private By profileIcon(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }

    private By logoutButton(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }

    private By detailProductButton(){
        return By.xpath("//*[@id=\"11310\"]/div/div[3]/div[2]/button[1]/span");
    }

    private By detailProductTittle(){
        return By.xpath("//p[text()='Furniture Top']");
    }

    private By beliButton(){
        return By.xpath("//*[@id=\"11310\"]/div/div[3]/div[2]/button[2]/span");
    }

    @Step
    public void onProductPage(){
        open();
        $(profileIcon()).isDisplayed();
    }

    @Step
    public void clickLogoutButton(){
        $(logoutButton()).click();
    }

    @Step
    public void onProductPageSuccessfully(){
        $(profileIcon()).isDisplayed();
    }

    @Step
    public void clickDetailProductButton(){
        $(detailProductButton()).click();
    }

    @Step
    public void seeDetailProduct(){
        $(detailProductTittle()).isDisplayed();
    }

    @Step
    public void clickBeliButton(){
        $(beliButton()).click();
    }
}
