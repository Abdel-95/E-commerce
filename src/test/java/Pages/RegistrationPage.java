package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps_definition.Hooks;

public class RegistrationPage {

    public WebElement register_Link()
    {
        By register= By.className("ico-register");
        WebElement register_Link= Hooks.driver.findElement(register);
        return register_Link;
    }
    public WebElement First_Name() {
        By FirstName = By.cssSelector("input[id^=\"FirstName\"]");
        WebElement First_Name = Hooks.driver.findElement(FirstName);
        return First_Name;
    }
    public WebElement Last_Name() {
        By LastName = By.cssSelector("input[id^=\"LastName\"]");
        WebElement Last_Name = Hooks.driver.findElement(LastName);
        return Last_Name;
    }
    public WebElement Email() {
        By email = By.name("Email");
        WebElement Email = Hooks.driver.findElement(email);
        return Email;
    }
        public WebElement Password() {
        By password = By.id("Password");
        WebElement Password = Hooks.driver.findElement(password);
        return Password;

    }
    public WebElement Confirm_Password() {
        By password = By.id("ConfirmPassword");
        WebElement Confirm_Password = Hooks.driver.findElement(password);
        return Confirm_Password;
    }
    public  WebElement RegisterBtn()
    {
        By register1 = By.xpath("//button[contains(@name,\"register-butt\")]");
        WebElement RegisterBtn = Hooks.driver.findElement(register1);
        return RegisterBtn;
    }
}