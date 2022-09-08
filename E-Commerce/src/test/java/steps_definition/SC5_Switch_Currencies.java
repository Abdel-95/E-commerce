package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SC5_Switch_Currencies {
    @Given("user navigate to home")
    public void navigate_home()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }
@And("logged user choose Euro from dropdown menu")
        public void choose_Euro() {
   WebElement selectElement = Hooks.driver.findElement(By.id("customerCurrency"));
    Select selectObject = new Select(selectElement);
    selectObject.selectByVisibleText("Euro");
//    List<WebElement> lst = selectObject.getOptions();
//  System.out.println("The dropdown options are:");
//    for(WebElement options: lst)
//        System.out.println(options.getText());selectObject.selectByIndex(1);
//    System.out.println("Select value is: " + selectObject.getFirstSelectedOption().getText());
//    selectObject.selectByVisibleText("Euro");
//    System.out.println("Select value is: " + selectObject.getFirstSelectedOption().getText());
}
    @Then ("user choose Euro successfully")
public void success_Euro() {
    String ExpectedResult = "Euro";
    String ActualResult = Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

    @And ("user choose US Dollar from dropdown menu")
    public void choose_US() {
        Select selectElement = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        selectElement.selectByVisibleText("US Dollar");
    }
       @Then("user choose US Dollar successfully")
               public void success_US() {
           String ExpectedResult = "US Dollar";
           String ActualResult = Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
           Assert.assertTrue(ActualResult.contains(ExpectedResult));

        }
    }



