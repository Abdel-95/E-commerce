package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps_definition.Hooks;

public class ResetPassword_Page {

    public WebElement Forget_password()
    {
        By ForgetPassword= By.className("forgot-password");
        WebElement Forget_password= Hooks.driver.findElement(ForgetPassword);
        return Forget_password;
    }

    public WebElement Email_details()
    {
        By EmailDetails= By.id("Email");
        WebElement Email_details= Hooks.driver.findElement(EmailDetails);
        return Email_details;
    }
    public WebElement change_password_btn()
    {
        By changePassword= By.xpath("//button[contains(@name,\"send-email\")]");
        WebElement change_password_btn= Hooks.driver.findElement(changePassword);
        return change_password_btn;
    }
}
