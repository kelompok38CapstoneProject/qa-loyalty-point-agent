package Starter.Stepdefinition;

import Starter.Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStep {
    @Steps
    LoginPage loginpage;

//Login1
    @Given("admin on login page")
    public void adminOnLoginPage() {
        loginpage.openPage();
        loginpage.OnLoginPage();
        
    }

    @When("admin input valid username")
    public void adminInputValidUsername() {
        loginpage.InputValidUsername("septienjelinasitio@gmail.com");
        
    }

    @And("admin input valid password")
    public void adminInputValidPassword() {
        loginpage.InputValidPassword("septi123");
    }

    @And("admin  click login button")
    public void adminClickLoginButton() {
        loginpage.ClickLoginButton();
        
    }

    @Then("admin success login")
    public void adminSuccessLogin() {
        loginpage.SuccessLogin();
    }

//Login2
    @When("admin input invalid username")
    public void adminInputInvalidUsername() {
        loginpage.InputInvalidUsername("septienjelina");
    }

    @And("admin input invalid password")
    public void adminInputInvalidPassword() {
        loginpage.InputInvalidPassword("septi321");
    }
}
