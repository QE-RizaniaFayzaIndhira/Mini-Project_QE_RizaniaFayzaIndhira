package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class registerPage extends PageObject {
    private By titleRegister(){
        return By.xpath("//div[text()='Register']");
    }

    private By fullnameField(){
        return By.xpath("//label[text()='Nama Lengkap']//following-sibling::input");
    }

    private By emailRegisterField(){
        return By.xpath("//label[text()='Email']//following-sibling::input");
    }

    private By passwordRegisterField(){
        return By.xpath("//label[text()='Password']//following-sibling::input");
    }

    private By registerButton(){
        return By.xpath("//span[text()='Register']");
    }

    private By errorMessageEmailRegister(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div");
    }

    @Step
    public void onRegisterPage(){
        $(titleRegister()).isDisplayed();
    }

    @Step
    public void inputValidFullnameForRegister(String fullname_register){
        $(fullnameField()).type(fullname_register);
    }

    @Step
    public void inputValidEmailForRegister(String email_register){
        $(emailRegisterField()).type(email_register);
    }

    @Step
    public void inputValidPasswordForRegister(String password_register){
        $(passwordRegisterField()).type(password_register);
    }

    @Step
    public void clickRegisterButton(){
        $(registerButton()).click();
    }

    @Step
    public void inputEmptyFullnameForRegister(String empty_fullname_register){
        $(fullnameField()).type(empty_fullname_register);
    }

    @Step
    public void inputEmptyEmailForRegister(String empty_email_register){
        $(emailRegisterField()).type(empty_email_register);
    }

    @Step
    public void inputEmptyPasswordForRegister(String empty_password_register){
        $(passwordRegisterField()).type(empty_password_register);
    }

    @Step
    public void seeErrorMessageRegisterEmail(){
        $(errorMessageEmailRegister()).isDisplayed();
    }

    @Step
    public void inputFullnameForRegister(String fullnameForRegister){
        $(fullnameField()).type(fullnameForRegister);
    }

    @Step
    public void inputEmailForRegister(String emailForRegister){
        $(emailRegisterField()).type(emailForRegister);
    }

    @Step
    public void inputPasswordForRegister(String passwordForRegister){
        $(passwordRegisterField()).type(passwordForRegister);
    }
}
