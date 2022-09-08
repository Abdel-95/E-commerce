package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SC6_different_category {
    private Actions actionProvider;

    @Given("logged user navigate to home page")
    public void navigate_to_home() {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(url);
    }

    @When("user select Computer categories")
    public void select_Computer_Category() {
        WebElement ComputerCategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(ComputerCategory).click().build().perform();
    }

    @And("user select a Electronics categories then hover to camera and photo subcategory")
    public void select_subCategory() {
        WebElement ElectronicsCategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(ElectronicsCategory).build().perform();
        WebElement Electronics_SubCategory_Camera_photo = Hooks.driver.findElement(By.cssSelector("a[href=\"/camera-photo\"]"));
        actionProvider.moveToElement(Electronics_SubCategory_Camera_photo).click().build().perform();
    }


    @And("user choose Gift Cards categories")
    public void Gift_Cards_Category() {
        WebElement Gift_Cards_Category = Hooks.driver.findElement(By.cssSelector("a[href=\"/gift-cards\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Gift_Cards_Category).click().build().perform();
    }
}
