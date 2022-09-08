package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import steps_definition.Hooks;

public class FilterColor_Page {

    public WebElement Apparel_subcategory() {
        By ApparelCategory = By.cssSelector("a[href=\"/apparel\"]");
        WebElement Apparel_subcategory = Hooks.driver.findElement(ApparelCategory);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Apparel_subcategory).build().perform();
        return Apparel_subcategory;
    }
        public WebElement shoesCategory() {
            By ShoesCategory = By.cssSelector("a[href=\"/shoes\"]");
            WebElement shoesCategory = Hooks.driver.findElement(ShoesCategory);
            Actions actionProvider = new Actions(Hooks.driver);
            actionProvider.moveToElement(shoesCategory).build().perform();
            return shoesCategory;

}

    public WebElement Filter_Color() {
       By filterColor = By.id("attribute-option-15");
        //By filterColor = By.cssSelector("span[style=\"background-color:#8a374a\"]");
        WebElement Filter_Color = Hooks.driver.findElement(filterColor);
    return Filter_Color;
    }
}
