package steps_definition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class SC1_registration {



    @And("user navigate to home page")
    public void navigate_home()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }

    @And("user click on register link")
    public void register_link()
    {

       Hooks.driver.findElement(By.className("ico-register")).click();
    }


    @And("user fills your personal details with valid data")
    public void Personal_details()
    {
        Hooks.driver.findElement(By.cssSelector("input[id^=\"FirstName\"]")).sendKeys("Nourhane");
        Hooks.driver.findElement(By.cssSelector("input[id^=\"LastName\"]")).sendKeys("Mahrouss");
        Hooks.driver.findElement(By.name("Email")).sendKeys("Norhane1.Mahrouss@gmail.com");

    }
    @And("user fills your password with valid data")
    public void Your_Password_details()

    {
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("P@ssw0rd");
    }

   @And("user clicks on register button")
           public void register_button()
   {
       Hooks.driver.findElement(By.xpath("//button[contains(@name,\"register-butt\")]")).click();
   }

   @Then("success message is displayed")
   public void success_Message()
   {
      // Assert.assertTrue(driver.findElement(By.partialLinkText("Your registration completed")).isDisplayed());
       Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());

       SoftAssert soft = new SoftAssert();
       soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
       soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
       soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());

       soft.assertAll();

   }


}

