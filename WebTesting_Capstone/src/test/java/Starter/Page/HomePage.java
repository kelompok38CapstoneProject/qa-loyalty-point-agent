package Starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By adminOnHomePage(){
        return By.xpath("");
    }
    @Step
    public void openPageHome(){
        open();
    }
    @Step
    public boolean OnHomePage(){
        return $(adminOnHomePage()).isDisplayed();
    }
}
