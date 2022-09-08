package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC80_Shopping_cart {

    @Given("user navigate to The_home_page")
    public void navigate_log_in_page()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }

@When("user add Apple MacBook to the cart")
    public void Apple_MacBook() {
    Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]")).click();
}

@And("user click on add to the cart button")
    public void Add_To_Cart_1() {
    Hooks.driver.findElement(By.id("add-to-cart-button-4")).click();
}
@Then("success message appear")
    public void Success_message_1() {
    String ExpectedResult = "The product has been added to your shopping cart";
    String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
    Assert.assertTrue(ActualResult.contains(ExpectedResult));
    System.out.println("Apple MacBook Pro 13-inch: The product has been added to your shopping cart");
}
@When("user add Laptop Samsung to the cart")

    public void Laptop_Samsung() {
    Hooks.driver.findElement(By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]")).click();
}
    @And("user click on add to the cart button_2")
    public void Add_To_Cart_2() {
        Hooks.driver.findElement(By.id("add-to-cart-button-6")).click();
}
@Then("success message appear_2")
    public void Success_message_2() {
    String ExpectedResult = "The product has been added to your shopping cart";
    String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
    Assert.assertTrue(ActualResult.contains(ExpectedResult));
    System.out.println("Samsung Series 9 Laptop: The product has been added to your shopping cart");
}
@When("user add gift card to the cart")
    public void Gift_card() {
    String url = "https://demo.nopcommerce.com/";
    Hooks.driver.navigate() .to(url);
    Hooks.driver.findElement(By.cssSelector("a[href=\"/25-virtual-gift-card\"]")).click();

}
@And("user fills the mandatory fields")
public void user_fills_fields() {
    Hooks.driver.findElement(By.name("giftcard_43.RecipientName")).sendKeys("Ahmed");
    Hooks.driver.findElement(By.id("giftcard_43_RecipientEmail")).sendKeys("Ahmed@test.com");
    Hooks.driver.findElement(By.id("giftcard_43_SenderName")).sendKeys("Nourhane");
    Hooks.driver.findElement(By.id("giftcard_43_SenderEmail")).sendKeys("Nourhane@test.com");

}
    @And("user click on add to tha cart button_3")
    public void Add_To_Cart_3() {
        Hooks.driver.findElement(By.id("add-to-cart-button-43")).click();
    }

    @Then("success message appear_3")
    public void Success_message_3() {
        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Gift Card: The product has been added to your shopping cart");
    }
}
