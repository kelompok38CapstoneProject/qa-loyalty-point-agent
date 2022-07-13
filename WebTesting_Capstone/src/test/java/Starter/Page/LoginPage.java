package Starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
//Login1
    private By adminOnLoginPage(){
        return By.xpath("(//div[@class='bg-login'])");
    }
    private By adminInputValidUsername(){
        return By.id("email");
    }
    private By adminInputValidPassword(){
        return By.id("password");
    }
    private By adminClickLoginButton(){
        return By.className("btn btn-block text-white py-2 rounded-md login-btn");
    }
    private By adminSuccessLogin(){
        return By.xpath("(//span[@class='text-xl'])");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public boolean OnLoginPage(){
        return $(adminOnLoginPage()).isDisplayed();
    }
    @Step
    public void InputValidUsername(String username){
         $(adminInputValidUsername()).type(username);
    }
    @Step
    public void InputValidPassword(String password){
        $(adminInputValidPassword()).type(password);
    }
    @Step
    public void ClickLoginButton(){
        $(adminClickLoginButton()).click();
    }
    @Step
    public boolean SuccessLogin(){
        return $(adminSuccessLogin()).isDisplayed();
    }

//Login2
    private By adminInputInvalidUsername(){
    return By.xpath("");
    }
    private By adminInputInvalidPassword(){
        return By.xpath("");
    }

    @Step
    public void InputInvalidUsername(String invalidusername){
        $(adminInputInvalidUsername()).type(invalidusername);
    }
    @Step
    public void InputInvalidPassword(String invalidpassword){
        $(adminInputInvalidPassword()).type(invalidpassword);
    }


}
