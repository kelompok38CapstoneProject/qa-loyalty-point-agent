package Starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {
    private By adminClickProductButton(){
        return By.xpath("(//div[@class='text-md'])[3]");
    }
    private By adminCanSeeProductList(){
        return By.xpath("(//div[@class='container py-4'])");
    }

    @Step
    public void ClickProductButton(){
        $(adminClickProductButton()).click();
    }
    @Step
    public boolean CanSeeProductList() {
        return $(adminCanSeeProductList()).isDisplayed();
    }
}
