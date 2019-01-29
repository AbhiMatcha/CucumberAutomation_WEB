package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class newsfeed_repo extends BaseUtil
{

    public static WebElement feedList(){
        element = driver.findElement(By.id("js-feedsList"));
        return element;
    }

    public static WebElement GridList(){
        element = driver.findElement(By.className("grid-list"));
        return element;
    }
    public static WebElement bookmark_list(){
        element = driver.findElement(By.id("show-bookmarks-web"));
        return element;
    }

}
