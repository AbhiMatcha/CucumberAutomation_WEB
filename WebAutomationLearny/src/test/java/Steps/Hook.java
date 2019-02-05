package Steps;

import com.google.common.io.Files;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Base.utils.AddShortDelay;

public class Hook extends BaseUtil
{
    @Before
    public void InitializerTest()
    {
        /**
         *  For chrome browser run
         */
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("-start-fullscreen");
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().deleteAllCookies();
//        stepInfo="Scenario Start";

        /**
         *  For headless chrome
         */

//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/Mac/chromedriver");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Ubuntu/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless","window-size=1024,768", "--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().maximize();
    }


    @After
    public void TearDownTest(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed())
        {
            getscreenshot(scenario.getName());
            System.out.println(scenario.getName());
        }
        driver.manage().deleteAllCookies();
        driver.quit();
        Thread.sleep(AddShortDelay);
    }

    public void getscreenshot(String methodName)
    {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            Date date = new Date();
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(scrFile, new File("Reports/screenshot_" + methodName + "_"+dateFormat.format(date) + ".png"));
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
