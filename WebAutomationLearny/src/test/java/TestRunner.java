import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"},
        glue = "Steps",
        format = {"pretty", "json:target/cucumber.json"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/site/cucumber-reports/report.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests
{
}
