package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;



public class SC3_Reset_Password {

    @Given("user navigate to login page")
    public void navigate_home() {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Hooks.driver.navigate().to(url);

    }

    @And("user click on forget password link")
    public void Forget_password()
    {
        Hooks.driver.findElement(By.className("forgot-password")).click();

    }


    @And("user fills his Email")
            public void Email_details() {

        Hooks.driver.findElement(By.id("Email")).sendKeys("Norhane1.Mahrouss@gmail.com");
    }




    @Then("user click on Recover button")
    public void change_password_btn(){

        Hooks.driver.findElement(By.xpath("//button[contains(@name,\"send-email\")]")).click();

    }
    @Then("A message is Displayed to user")
    public void Displayed_Message()
    {
       String ExpectedResult = "Email with instructions has been sent to you.";
       String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
       Assert.assertTrue(ActualResult.contains(ExpectedResult));
       System.out.println("Password Recovery Message: Email with instructions has been sent to you.");
    }


}
