package Starter.Stepdefinition;

import Starter.Page.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductStep {
    @Steps
    ProductPage productPage;

    @When("admin click product button")
    public void adminClickProductButton() {
        productPage.ClickProductButton();
    }

    @Then("admin can see product list")
    public void adminCanSeeProductList() {
        productPage.CanSeeProductList();
    }
}
