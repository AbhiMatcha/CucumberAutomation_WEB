package Objects;


import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class CourseOverview_repo extends BaseUtil
{
    public static WebElement overviewTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[1]/a"));
        return element;
    }

    public static WebElement purchased(){
        element = driver.findElement(By.id("courseBuyBar"));
        return element;
    }


    public static WebElement change_validity(){
        element = driver.findElement(By.className("js-validity-selector"));
        return element;
    }

    public static WebElement select_90validity(){

             element = driver.findElement(By.id("0"));
        return element;
    }

    public static WebElement select_365validity(){

        element = driver.findElement(By.id("324"));
        return element;
    }


    public static WebElement syllabusTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[2]/a"));
        return element;
    }

    public static WebElement certificateTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[3]/a"));
        return element;
    }

    public static WebElement discussionTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[4]/a"));
        return element;
    }

    public static WebElement enterCoupon(){
        element = driver.findElement(By.id("coupon-input"));
        return element;
    }

    public static WebElement applyCoupon(){
        element = driver.findElement(By.id("js-apply-coupon"));
        return element;
    }

    public static WebElement Coupon_error(){
        element = driver.findElement(By.xpath("//*[@id='coupon-code-component']/div/div[2]"));
        return element;
    }


    public static WebElement noteTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[5]/a"));
        return element;
    }

    public static WebElement enrollFreeCourse(){
        element = driver.findElement(By.className("enrollCourse"));
        return element;
    }

    public static WebElement buynowButton(){
        element = driver.findElement(By.className("buyCourse"));
        return element;
    }

    public static WebElement cancelButton(){
        element = driver.findElement(By.className("swal2-cancel"));
        return element;
    }

    public static WebElement courseExpiry(){
        element = driver.findElement(By.className("js-expiry"));
        return element;
    }

    public static WebElement Footer(){
        element = driver.findElement(By.xpath("//*[@id='Studfooter']/div/section/div/div/div/div[1]/div/a"));
        return element;
    }

    public static WebElement Course_description(){
        element = driver.findElement(By.className("descriptionMessage"));
        return element;
    }

    public static WebElement Course_viewResult(){
        element = driver.findElement(By.xpath("//*[@id='js-firstAttempt-score']/div/div[1]/div[2]/button[1]"));
        return element;
    }

}
