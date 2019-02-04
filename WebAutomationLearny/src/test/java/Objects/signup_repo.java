package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

import static Base.utils.*;
import static Objects.homeScreen_repo.*;

public class signup_repo extends BaseUtil
{
    public static String errorMessage_signup ="email is already registered";
    public static String email ="abhishek.matcha@learnyst.com";
    public static String EmailExceedLength =randomEmail(38);
    public static String randomEmailInputs[] = {"<script>alert(document.cookie)</script>","<body onload=alert(‘something’)>;","<b onmouseover=alert(‘XSS testing!‘)></b>","ABHISHEK.MATCHA@LEARNYST.COM"," ","matcha.abhishek@learnyst.com",email,EmailExceedLength};
    public static String randomEmailpasswords[]={randomSpecialCharacter(),"  ","abhiq","ABHI1234"};
    public static String enterYopmail=randomEmail(10);

    public static WebElement signup_mail(){
        element = driver.findElement(By.id("signup-email"));
        return element;
    }
//    public static WebElement signUperror(){
//        element = driver.findElement(By.className("signup_error"));
//        return element;
//    }

    public static WebElement signup_password(){
        element = driver.findElement(By.id("signup-password"));
        return element;
    }

    public static WebElement signupForFree(){
        element = driver.findElement(By.id("js-signup"));
        return element;
    }

    public static WebElement signupPage_signin()
    {
        element = driver.findElement(By.xpath("//*[@id='js-signup-form']/div/div[2]/p/a"));
        return element;
    }
    public static String signupMethod() throws Exception
    {
        /**
         * Postive Flow:
         *
         * Signup using valid credentails
         * Verify signup is successfull and
         * navigated to homepage, by skipping the
         * account filling form
         */

        driver.get(signup_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String name=randomEmail(10);
        signup_mail().sendKeys(name);
        signup_password().sendKeys(password);
        signupForFree().click();
        if(SkipVerification().isDisplayed())
        {
            SkipVerification().click();
        }
        return name;
    }
    public static String GST_signupMethod() throws Exception
    {
        /**
         * Postive Flow:
         *
         * Signup using valid credentails
         * Verify signup is successfull and
         * navigated to homepage, by skipping the
         * account filling form
         */

        driver.get(GST_signup_URL);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String name=randomEmail(10);
        signup_mail().sendKeys(name);
        signup_password().sendKeys(password);
        signupForFree().click();
        Thread.sleep(4000);
        if(SkipVerification().isDisplayed())
        {
            SkipVerification().click();
        }
        return name;
    }

}
