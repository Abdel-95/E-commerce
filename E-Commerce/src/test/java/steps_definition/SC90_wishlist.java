package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC90_wishlist {

    @Given("user navigate to home_page")
    public void navigate_log_in_page()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }

    @When("user add Apple MacBook to wishlist")
    public void Apple_MacBook() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]")).click();
    }

    @And("user click on add to wishlist button")
    public void Add_To_Wishlist_1() {
        Hooks.driver.findElement(By.id("add-to-wishlist-button-4")).click();
    }

    @Then("success message_1")
    public void Success_message_1() {
        String ExpectedResult = "The product has been added to your wishlist";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Apple MacBook Pro 13-inch: The product has been added to your wishlist");
    }
    @When("user add Laptop Samsung to wishlist")

    public void Laptop_Samsung() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]")).click();
    }
    @And("user click on add to wishlist button_2")
    public void Add_To_wishlist_2() {
        Hooks.driver.findElement(By.id("add-to-wishlist-button-6")).click();
    }
    @Then("success message_2")
    public void Success_message_2() {
        String ExpectedResult = "The product has been added to your wishlist";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Samsung Series 9 Laptop: The product has been added to your wishlist");
    }
    @When("user add HP laptop to wishlist")
    public void HP_Laptop() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/hp-spectre-xt-pro-ultrabook\"]")).click();

    }

    @And("user click on add to tha wishlist button_3")
    public void Add_To_wishlist_3() {
        Hooks.driver.findElement(By.id("add-to-wishlist-button-7")).click();
    }

    @Then("success message_3")
    public void Success_message_3() {
        String ExpectedResult = "The product has been added to your wishlist";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("HP Spectre XT Pro UltraBook: The product has been added to your wishlist");
    }
}


