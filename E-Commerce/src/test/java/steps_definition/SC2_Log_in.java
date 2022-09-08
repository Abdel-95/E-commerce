package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class SC2_Log_in {
    @Given("user navigate to log in page")
    public void navigate_log_in_page()
    {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F/";
        Hooks.driver.navigate() .to(url);
    }

    @And("user click on log in link")
    public void log_in_link()
    {

        Hooks.driver.findElement(By.className("ico-login")).click();
    }
    @And("user fills email with valid data")
    public void Personal_Email()
    {
        Hooks.driver.findElement(By.name("Email")).sendKeys("Norhane1.Mahrouss@gmail.com");

    }
    @And("user fills  password with valid data")
    public void Your_Password_details()

    {
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");

    }

    @And("user clicks on log in button")
    public void Log_in_button()
    {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]")).click();
    }
}
