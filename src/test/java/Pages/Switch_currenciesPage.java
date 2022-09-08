package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import steps_definition.Hooks;

public class Switch_currenciesPage {

    public WebElement choose_Euro()
    {
        By Euro= By.id("customerCurrency");
        WebElement choose_Euro= Hooks.driver.findElement(Euro);
        Select selectObject = new Select(choose_Euro);
        selectObject.selectByVisibleText("Euro");
        return choose_Euro;
    }


    public WebElement choose_US()
    {
        By US= By.id("customerCurrency");
        WebElement choose_US= Hooks.driver.findElement(US);
        Select selectObject2 = new Select(choose_US);
        selectObject2.selectByVisibleText("US Dollar");
        return choose_US;
    }


}
