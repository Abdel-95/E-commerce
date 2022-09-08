package steps_definition;


import Pages.ResetPassword_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;



public class SC3_Reset_Password {
    ResetPassword_Page reset = new ResetPassword_Page();

    @Given("user navigate to login page")
    public void navigate_home() {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Hooks.driver.navigate().to(url);

    }

    @And("user click on forget password link")
    public void Forget_password()
    {
        reset.Forget_password().click();
    }


    @And("user fills his Email")
            public void Email_details() {
        reset.Email_details().sendKeys("Norhane.Mahrouss@gmail.com");
    }




    @Then("user click on Recover button")
    public void change_password_btn(){
        reset.change_password_btn().click();

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
