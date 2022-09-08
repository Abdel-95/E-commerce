package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

public class SC4_Search {

        @When("user clicks on search field")
        public void search()
        {
            Hooks.driver.findElement(By.id("small-searchterms")).click();
        }

        @And("user search with name of product")
    public void search_product()
        {
            Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("Apple MacBook");
            Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();
        }

        @Then("user could find relative results")
    public void relative_result()
        {
            int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
            System.out.println(count);
            Assert.assertTrue(count>0);
            ArrayList <String>products = null;
            products = new ArrayList<String>();
            for (int x = 0 ; x < count ; x++ ){
               System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
                products.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
               // Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText().toLowerCase().contains("Apple MacBooK"));
            }
            System.out.println(products);
        }



}

