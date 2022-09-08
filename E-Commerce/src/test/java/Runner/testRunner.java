package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "steps_definition",
        tags = "@Runner",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/cucumber-TestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"

        }
)
public class testRunner extends AbstractTestNGCucumberTests {
}
