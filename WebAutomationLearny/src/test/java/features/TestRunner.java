package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/featureFiles/"},
        glue = "Steps",
        format = {"pretty", "json:target/cucumber.json"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/site/cucumber-reports/report.html"},
        monochrome = true
)
public class TestRunner
{
}