package steps_definition;

import Pages.makeOrder_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SC92_Make_Order {
    makeOrder_Page Order = new makeOrder_Page();

    @Given("user navigate to homepage.com")
    public void navigate_log_in_page() {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(url);
    }

    @And("user click on shopping cart link")
    public void Navigate_to_shopping_cart_page() {
        Order.Navigate_to_shopping_cart_page().click();
    }

    @And("user choose to wrapped his order as a gift")
    public void choose_wrapped() {
        Order.choose_wrapped();
    }

    @And("user check on the agreement checkBox")
    public void agreement_checkbox() {
        Order.agreement_checkbox().click();
    }

    @When("user click on checkout button")
    public void checkout_button() {
        Order.checkout_button().click();

    }

    @And("user log in")
    public void log_in() {
        Order.log_in().sendKeys("Norhane.Mahrouss@gmail.com");

    }

    @And("user enter his password")
    public void Password() {
        Order.Password().sendKeys("P@ssw0rd");

    }

    @Then("user log in successfully")
    public void logInBtn() {
        Order.logInBtn().click();
    }

    @And("user check on the agreement checkBox2")
    public void agreement_checkbox2() {
        Order.agreement_checkbox2().click();
    }

    @And("user click on checkout button2")
    public void checkout_button2() {
        Order.checkout_button2().click();
    }

    @And("user fills all mandatory fields")
    public void fills_data() {
        // Order.firstName().sendKeys("Nourhane");
        //  Order.lastName().sendKeys("Mahrouss");
        // Order.email().sendKeys("Norhane.Mahrouss@gmail.com");
        Order.Country();
        Order.City().sendKeys("Cairo");
        Order.Address().sendKeys("13 st Cairo Egypt");
        Order.ZipCode().sendKeys("12160");
        Order.PhoneNum().sendKeys("010000000001");

    }

    @Then("user click on continue button")
    public void continue_Btn() {
        Order.continue_Btn().click();
    }

    @And("user select ground option and click continue button")
    public void continue_Btn2() {
        Order.continue_Btn2().click();

    }

    @And("user select money option and click continue")
    public void continue_Btn3() {
        Order.continue_Btn3().click();

    }

    @And("user click continue button4")
    public void continue_Btn4() {
        Order.continue_Btn4().click();

    }

    @And("user click confirm button")
    public void confirm_Btn() {
        Order.confirm_Btn().click();

    }
}
//@Then("user completed the order")
//    public void Order_completed() {
//        Order.Order_completed().click();
//}
//
//    }

