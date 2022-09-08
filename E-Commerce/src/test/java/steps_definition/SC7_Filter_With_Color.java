package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SC7_Filter_With_Color {
    @Given("logged user navigate to the home page")
    public void navigate_to_home() {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(url);
    }
    @When("user select a Apparel category then hover to Shoes subcategory")
            public void Shoes_subcategory() {
        WebElement Apparel_Category = Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Apparel_Category).build().perform();
        WebElement Shoes_subcategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
        actionProvider.moveToElement(Shoes_subcategory).click().build().perform();

    }
        @And("filter by Red color")
                public void Filter_Color() {
            Hooks.driver.findElement(By.id("attribute-option-15")).click();
        }

    }


