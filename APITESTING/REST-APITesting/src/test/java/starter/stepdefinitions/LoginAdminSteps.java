package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.LoginAdmin.Post;

public class LoginAdminSteps {
    @Steps
    Post post;

//LoginAdmin
    @Given("Admin set POST api endpoint for login")
    public void setPostLoginEndpoints(){
        post.setApiEndpoints();

    }
    @When("Admin send POST HTTP request")
    public void sendPostHttpRequest(){
        post.sendPostHttpRequest();

    }
    @Then("Admin receive status code 200 and success login")
    public void seeStatusCode200AndSucces(){
        post.seeStatusCode200AndSuccessLogin();

    }

}

