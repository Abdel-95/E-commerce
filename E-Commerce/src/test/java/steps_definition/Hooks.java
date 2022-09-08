package steps_definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {
 static WebDriver driver;
    @Before
public static void open_browser()
    {

        WebDriverManager.chromedriver() .setup();
        driver = new ChromeDriver();
        driver.manage() .window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
    }

    @After
    public static void quit_browser()
    {
        driver.quit();
    }
}

