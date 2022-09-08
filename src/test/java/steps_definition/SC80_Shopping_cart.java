package steps_definition;

import Pages.ShoppingCart_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SC80_Shopping_cart {
    ShoppingCart_Page cart = new ShoppingCart_Page();

    @Given("user navigate to The_home_page")
    public void navigate_log_in_page()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }

@When("user add Apple MacBook to the cart")
    public void Apple_MacBook() {
cart.Apple_MacBook().click();
}

@And("user click on add to the cart button")
    public void Add_To_Cart_1() {
    cart.Add_To_Cart_1().click();
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
    cart.Laptop_Samsung().click();
}
    @And("user click on add to the cart button_2")
    public void Add_To_Cart_2() {
        cart.Add_To_Cart_2().click();
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
    cart.Gift_card().click();

}
@And("user fills the mandatory fields")
public void user_fills_fields() {
    cart.RecipientName().sendKeys("Ahmed");
    cart.RecipientEmail().sendKeys("Ahmed@test.com");
    cart.SenderName().sendKeys("Nourhane");
    cart.SenderEmail().sendKeys("Nourhane@test.com");

}
    @And("user click on add to tha cart button_3")
    public void Add_To_Cart_3() {
       cart.Add_To_Cart_3().click();
    }

    @Then("success message appear_3")
    public void Success_message_3() {
        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Gift Card: The product has been added to your shopping cart");
    }
}
