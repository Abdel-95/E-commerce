package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SC92_Make_Order {

    @Given("user navigate to homepage.com")
    public void navigate_log_in_page()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }
    @When("user add  MacBook to the cart")
    public void Apple_MacBook() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]")).click();
    }
    @And("user click on add to_cart_button")
    public void Add_To_Cart_1() {
        Hooks.driver.findElement(By.id("add-to-cart-button-4")).click();
    }
       @And("user click on shopping cart link")
    public void Navigate_to_shopping_cart_page() {
           Hooks.driver.findElement(By.cssSelector("a[href=\"/cart\"]")).click();
       }

       @And("user choose to wrapped his order as a gift")
    public void choose_wrapped() {
           WebElement checkout = Hooks.driver.findElement(By.name("checkout_attribute_1\""));
           Select drpCountry = new Select(checkout);
           drpCountry.selectByVisibleText("Yes [+$10.00]");
       }

      @And("user check on the agreement checkBox")
    public void agreement_checkbox() {
           Hooks.driver.findElement(By.id("termsofservice")).click();

      }

      @When("user click on checkout button")
    public void checkout_button() {
          Hooks.driver.findElement(By.id("checkout")).click();

      }

      @And("user fills all mandatory fields")
    public void fills_data() {
          Hooks.driver.findElement(By.name("BillingNewAddress.FirstName")).sendKeys("Nourhane");
          Hooks.driver.findElement(By.name("BillingNewAddress.LastName")).sendKeys("Mahrouss");
          Hooks.driver.findElement(By.name("BillingNewAddress.Email")).sendKeys("Norhane1.Mahrouss@gmail.com");
          Select Country = new Select(Hooks.driver.findElement(By.id("BillingNewAddress_CountryId")));
          Country.selectByValue("123");
          Hooks.driver.findElement(By.name("BillingNewAddress.City")).sendKeys("Cairo");
          Hooks.driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("13 st Cairo Egypt");
          Hooks.driver.findElement(By.name("BillingNewAddress.ZipPostalCode")).sendKeys("12160");
          Hooks.driver.findElement(By.name("BillingNewAddress.PhoneNumber")).sendKeys("010000000001");

      }

    @Then("user click on continue button")
    public void continue_Btn() {
        Hooks.driver.findElement(By.id("checkout")).click();
    }

      @And("user select ground option and click continue button")
    public void continue_Btn2() {
          Hooks.driver.findElement(By.id("checkout")).click();

      }
    @And("user select money option and click continue")
    public void continue_Btn3() {
        Hooks.driver.findElement(By.id("checkout")).click();

    }
    @Then("user click continue button4")
    public void continue_Btn4() {
        Hooks.driver.findElement(By.id("checkout")).click();

    }
    @Then("user click confirm button")
    public void confirm_Btn() {
        Hooks.driver.findElement(By.id("checkout")).click();

    }


    }

