package Starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    //Login1
    private By adminOnLoginPage() {
        return By.xpath("(//div[@class='row d-flex justify-content-center align-items-center h-100'])");
    }

    private By adminInputValidUsername() {
        return By.id("email");
    }

    private By adminInputValidPassword() {
        return By.id("password");
    }

    private By adminClickLoginButton() {
        return By.className("btn btn-block text-white py-2 rounded-md login-btn");
    }

    private By adminSuccessLogin() {
        return By.xpath("(//span[@class='text-xl'])");
    }

    @Step
    public void openPage() {
        openUrl("https://transcendent-centaur-b1027d.netlify.app/login/");

    }

    @Step
    public boolean OnLoginPage() {
        return $(adminOnLoginPage()).isDisplayed();
    }

    @Step
    public void InputValidUsername(String username) {
        $(adminInputValidUsername()).type(username);
    }

    @Step
    public void InputValidPassword(String password) {
        $(adminInputValidPassword()).type(password);
    }

    @Step
    public void ClickLoginButton() {
        $(adminClickLoginButton()).click();
    }

    @Step
    public boolean SuccessLogin() {
        return $(adminSuccessLogin()).isDisplayed();
    }

}