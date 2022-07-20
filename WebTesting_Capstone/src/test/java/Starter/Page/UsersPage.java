package Starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UsersPage extends PageObject {

    private By adminClickUsersButton(){
        return By.xpath("(//div[@class='d-flex align-items-center'])[4]");
    }
    private By adminCanSeeListOfUsers(){
        return By.xpath("(//div[@class='(//div[@class='container'])");
    }

    @Step
    public void ClickUserButton(){
        $(adminClickUsersButton()).click();
    }
    @Step
    public boolean CanSeeListOfUsers() {
        return $(adminCanSeeListOfUsers()).isDisplayed();
    }
}
