package Steps;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import Base.utils;
import com.google.common.io.Files;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageFactory extends utils
{

    @Before

    public void beforeScenario()
    {
        /**
         *  For chrome browser run
         */

//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("-start-fullscreen");
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().deleteAllCookies();

        /**
         *  For headless chrome
         */

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/Mac/chromedriver");
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Ubuntu/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless","window-size=1024,768", "--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().maximize();
    }

    @After
    public void retry(Scenario scenario) throws InterruptedException
    {
        if(scenario.isFailed())
        {
            getscreenshot(scenario.getName());
            System.out.println(scenario.getName());
        }
        driver.manage().deleteAllCookies();
        driver.close();
        Thread.sleep(AddShortDelay);
    }

    public void getscreenshot(String methodName)
    {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            Date date = new Date();
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(scrFile, new File("Screenshots/screenshot_" + methodName + "_"+dateFormat.format(date) + ".png"));
        } catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
