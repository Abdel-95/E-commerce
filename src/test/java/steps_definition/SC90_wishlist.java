package steps_definition;

import Pages.WishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC90_wishlist {
    WishlistPage wishlist = new WishlistPage();

    @Given("user navigate to home_page")
    public void navigate_log_in_page()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }

    @When("user add Apple MacBook to wishlist")
        public void Apple_MacBook() {
            wishlist.Apple_MacBook().click();
        }

    @And("user click on add to wishlist button")
    public void Add_To_Wishlist_1() {
       wishlist.Add_To_Wishlist_1().click();
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
            wishlist.Laptop_Samsung().click();
        }
    @And("user click on add to wishlist button_2")
    public void Add_To_wishlist_2() {
        wishlist.Add_To_Wishlist_2().click();
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
        wishlist.HP_Laptop().click();

    }

    @And("user click on add to tha wishlist button_3")
    public void Add_To_wishlist_3() {
        wishlist.Add_To_Wishlist_3().click();
    }

    @Then("success message_3")
    public void Success_message_3() {
        String ExpectedResult = "The product has been added to your wishlist";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("HP Spectre XT Pro UltraBook: The product has been added to your wishlist");
    }
}


