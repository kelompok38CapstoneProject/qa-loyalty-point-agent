package Starter.Stepdefinition;

import Starter.Page.HomePage;
import Starter.Page.UsersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UsersStep {
    @Steps
    UsersPage userpage;
    @Steps
    HomePage homepage;
    @Given("admin on home page")
    public void adminOnHomePage() {
        homepage.openPageHome();
        homepage.OnHomePage();
    }

    @When("admin click users button")
    public void adminClickUsersButton() {
        userpage.ClickUserButton();
    }

    @Then("admin can see list of users")
    public void adminCanSeeListOfUsers() {
        userpage.CanSeeListOfUsers();
    }
}
