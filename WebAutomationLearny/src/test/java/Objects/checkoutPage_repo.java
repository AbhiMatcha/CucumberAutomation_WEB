package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkoutPage_repo extends BaseUtil
{

    public static WebElement learnerName(){
        element = driver.findElement(By.id("learner-name"));
        return element;
    }

    public static WebElement address1(){
        element = driver.findElement(By.id("learner-address1"));
        return element;
    }

    public static WebElement address2(){
        element = driver.findElement(By.id("learner-address"));
        return element;
    }

    public static WebElement city(){
        element = driver.findElement(By.id("learner-city"));
        return element;
    }

    public static WebElement pincode(){
        element = driver.findElement(By.id("learner-pincode"));
        return element;
    }

    public static WebElement mobileNumber() {
        element = driver.findElement(By.id("mobNumber"));
        return element;
    }
    public static WebElement save(){
        element = driver.findElement(By.className("js-submit"));
        return element;
    }

    public static WebElement enterCoupon(){
        element = driver.findElement(By.className(" coupon-input"));
        return element;
    }

    public static WebElement GST_courseActualPrice(){
        element = driver.findElement(By.xpath("//*[@id='js-scoreReportList']/tr[1]/td[2]/span"));
        return element;
    }

    public static WebElement GST_AmountPayable(){
        element = driver.findElement(By.xpath("//*[@id='js-scoreReportList']/tr[5]/td[2]/span"));
        return element;
    }

    public static WebElement refundPolicy(){
        element = driver.findElement(By.xpath("//*[@id='learnyContent']/div/div/div/div/div[2]/div[3]/div/a"));
        return element;
    }

}
