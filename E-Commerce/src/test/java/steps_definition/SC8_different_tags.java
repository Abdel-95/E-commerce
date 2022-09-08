package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SC8_different_tags {

    @Given("user navigate to computer category page")
    public void navigate_to_home() {
        String url = "https://demo.nopcommerce.com/computers";
        Hooks.driver.navigate().to(url);
    }

    @When("user select cool from popular tags")
    public void Cool_Tags() {
        WebElement Cool = Hooks.driver.findElement(By.cssSelector("a[href=\"/cool\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Cool).click().build().perform();
    }

    @And("user select digital from popular tags")

    public void Digital_Tags() {
        WebElement Digital = Hooks.driver.findElement(By.cssSelector("a[href=\"/digital\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Digital).click().build().perform();
    }

    @And("user select game from popular tags")

    public void Game_Tags() {
        WebElement Digital = Hooks.driver.findElement(By.cssSelector("a[href=\"/game\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Digital).click().build().perform();
    }

    @And("user select computer from popular tags")
    public void Computer_Tags() {
        WebElement Digital = Hooks.driver.findElement(By.cssSelector("a[href=\"/computer\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Digital).click().build().perform();
    }
}
