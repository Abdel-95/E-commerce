package steps_definition;

import Pages.Different_CategoriesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SC6_different_category {
    Different_CategoriesPage differentCategories = new Different_CategoriesPage();
    private Actions actionProvider;

    @Given("logged user navigate to home page")
    public void navigate_to_home() {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(url);
    }

    @When("user select Computer categories")
    public void select_Computer_Category() {
        differentCategories.select_Computer_Category();
    }

    @And("user select a Electronics categories then hover to camera and photo subcategory")
    public void select_subCategory() {
        differentCategories.select_subCategory();
    }


    @And("user choose Gift Cards categories")
    public void Gift_Cards_Category() {
        differentCategories.Gift_Cards_Category();
    }
}
