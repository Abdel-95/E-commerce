package steps_definition;

import Pages.CompareList_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC91_Compare_List {
    CompareList_Page compare = new CompareList_Page();

    @Given("user navigate to homepage")
    public void navigate_log_in_page()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }

    @When("user add Apple MacBook to compare list")
        public void Apple_MacBook() {
            compare.Apple_MacBook().click();
        }

    @And("user click on add to compare list button")
    public void Add_To_compare_List_1() {
           compare.Add_To_compare_List_1().click();
        }

    @Then("success message1")
    public void Success_message1() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Apple MacBook Pro 13-inch: The product has been added to your product comparison");
    }
    @When("user add Laptop Samsung to compare list")

    public void Laptop_Samsung() {
        compare.Laptop_Samsung().click();
    }
    @And("user click on add to compare list button_2")
    public void Add_To_compare_List_2() {
       compare.Add_To_compare_List_2().click();
    }
    @Then("success message2")
    public void Success_message2() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Samsung Series 9 NP900X4C-A06US 15-Inch Ultrabook: The product has been added to your product comparison");
    }
    @When("user add HP laptop to compare list")
    public void HP_Laptop() {
        compare.HP_Laptop().click();
    }

    @And("user click on add to compare list button_3")
    public void Add_To_compare_List_3() {

        compare.Add_To_compare_List_3().click();
    }

    @Then("success message3")
    public void Success_message3() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("HP Spectre XT Pro UltraBook: The product has been added to your product comparison");
    }

}

