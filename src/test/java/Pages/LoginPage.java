package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps_definition.Hooks;

public class LoginPage {

        public WebElement loginBtn()
        {
            By login = By.className("ico-login");
            WebElement loginBtn = Hooks.driver.findElement(login);
            return loginBtn;
        }

        public WebElement Email()
        {
            By email = By.name("Email");
            WebElement Email = Hooks.driver.findElement(email);
            return Email;
        }
        public WebElement Password()
        {
            By password = By.id("Password");
            WebElement Password = Hooks.driver.findElement(password);
            return Password;

        }
        public  WebElement SignIn()
        {
            By sign_in = By.cssSelector("button[class=\"button-1 login-button\"]");
            WebElement SignIn = Hooks.driver.findElement(sign_in);
            return SignIn;
        }

    }

