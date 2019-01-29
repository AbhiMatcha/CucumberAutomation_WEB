package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

import java.util.Random;

public class payment_repo extends BaseUtil
{
    public static WebElement paySecurely(){
        element = driver.findElement(By.id("js-paynow"));
        return element;
    }

    public static WebElement Netbanking(){
        element = driver.findElement(By.xpath("//*[@id='payment-options']/div[2]"));
        return element;
    }

    public static WebElement Wallet(){
        element = driver.findElement(By.xpath("//*[@id='payment-options']/div[3]"));
        return element;
    }

    public static WebElement selectWalletType()
    {
        element = driver.findElement(By.xpath("//*[@id='wallets']/div/div["+randomWallet()+"]/label"));
        return element;
    }

    public static int randomWallet()
    {
        int selectAnswer[] = {1,4};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }




    public static WebElement selectDifferentBank(){
        element = driver.findElement(By.id("bank-select"));
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText(randombank());
        return element;
    }
    public static String randombank()
    {
        String selectAnswer[] = {"Andhra Bank","Axis Bank","Canara Bank","HDFC Bank"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    public static WebElement selectCountry(){
        element = driver.findElement(By.id("country-dd"));
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText("India");
        return element;
    }
    public static WebElement selectState(){
        element = driver.findElement(By.id("state-dd"));
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText(states());
        return element;
    }
    public static String states()
    {
        String selectAnswer[] = {"Andhra Pradesh","Pondicherry","Karnataka","Telangana"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    public static WebElement payNow(){
        element = driver.findElement(By.xpath("//*[@id='footer']/span[2]"));
        return element;
    }

    public static WebElement successButton(){
        element = driver.findElement(By.className("success"));
        return element;
    }

}
