package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import steps_definition.Hooks;

public class ShoppingCart_Page {
    public WebElement Apple_MacBook() {
        By MacBook = By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
        WebElement Apple_MacBook = Hooks.driver.findElement(MacBook);
        return Apple_MacBook;
    }

    public WebElement Add_To_Cart_1() {
        By cart_1 = By.id("add-to-cart-button-4");
        WebElement Add_To_Cart_1 = Hooks.driver.findElement(cart_1);
        return Add_To_Cart_1;
    }


    public WebElement Laptop_Samsung() {
        By Samsung = By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]");
        WebElement Laptop_Samsung = Hooks.driver.findElement(Samsung);
        return Laptop_Samsung;
    }

    public WebElement Add_To_Cart_2() {
        By cart_2 = By.id("add-to-cart-button-6");
        WebElement Add_To_Cart_2 = Hooks.driver.findElement(cart_2);
        return Add_To_Cart_2;

    }


    public WebElement Gift_card() {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(url);
        By giftCard = By.cssSelector("a[href=\"/25-virtual-gift-card\"]");
        WebElement Gift_card = Hooks.driver.findElement(giftCard);
        return Gift_card;
    }

    public WebElement RecipientName() {
        By Recipient = By.name("giftcard_43.RecipientName");
        WebElement RecipientName = Hooks.driver.findElement(Recipient);
        return RecipientName;
    }

    public WebElement RecipientEmail() {
        By RecipientMail = By.id("giftcard_43_RecipientEmail");
        WebElement RecipientEmail = Hooks.driver.findElement(RecipientMail);
        return RecipientEmail;
    }

    public WebElement SenderName() {
        By Sender = By.id("giftcard_43_SenderName");
        WebElement SenderName = Hooks.driver.findElement(Sender);
        return SenderName;
    }

    public WebElement SenderEmail() {
        By SenderMail = By.id("giftcard_43_SenderEmail");
        WebElement SenderEmail = Hooks.driver.findElement(SenderMail);
        return SenderEmail;
    }

    public WebElement Add_To_Cart_3() {
        By cart_3 = By.id("add-to-cart-button-43");
        WebElement Add_To_Cart_3 = Hooks.driver.findElement(cart_3);
        return Add_To_Cart_3;

    }

}
