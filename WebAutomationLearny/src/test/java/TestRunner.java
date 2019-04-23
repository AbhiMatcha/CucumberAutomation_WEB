
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.runtime.model.CucumberFeature;
import java.util.ArrayList;
import java.util.List;
//
//@ExtendedCucumberOptions(
//        usageReport = true,
//        detailedReport = true,
//        detailedAggregatedReport = true,
//        overviewReport = true,
//        overviewChartsReport = true,
//        pdfPageSize = "A4 Landscape",
//        toPDF = true,
//        outputFolder = "target/81",
//        retryCount = 3
//)
@CucumberOptions(
        features = {"src/test/java/Features/"},
        glue = "Steps",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Reports/site/cucumber-reports/report.html","rerun:target/rerunFailed.txt"},
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests
{
}
