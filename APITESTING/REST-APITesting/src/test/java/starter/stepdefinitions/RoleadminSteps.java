package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Roleadmin.GetRoleadmin;

public class RoleadminSteps {
    @Steps
    GetRoleadmin getCategories;


    @Given("Admin set GET endpoint role admin")
    public void adminSetGETEndpointRoleAdmin() {
        getCategories.setGetUrlApiEndpointRoleadmin();
    }

    @When("send GET HTTP request role admin")
    public void userSendGETHTTPRequestRoleadmin() {
        getCategories.setGetUrlApiEndpointRoleadmin();
    }

    @Then("Admin receive status code {int}")
    public void userReceiveStatusCode(int arg0) {
        getCategories.userReceiveValidHttpResponse200();
    }

    @And("Admin receive valid url")
    public void adminReceiveValidUrl() {
        getCategories.validateDataDetailUrl();
    }
}
