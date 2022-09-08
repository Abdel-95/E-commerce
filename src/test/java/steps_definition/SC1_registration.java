package steps_definition;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class SC1_registration {
RegistrationPage register = new RegistrationPage();


    @And("user navigate to home page")
    public void navigate_home()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }

    @And("user click on register link")
    public void register_link()
    {

        register.register_Link().click();    }


    @And("user fills your personal details with valid data")
    public void Personal_details()
    {
        register.First_Name().sendKeys("Nourhane");
        register.Last_Name().sendKeys("Mahrouss");
        register.Email().sendKeys("Norhane.Mahrouss@gmail.com");



    }
    @And("user fills your password with valid data")
    public void Your_Password_details()

    {
        register.Password().sendKeys("P@ssw0rd");
        register.Confirm_Password().sendKeys("P@ssw0rd");

    }

   @And("user clicks on register button")
           public void register_button() {
       register.RegisterBtn().click();
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

