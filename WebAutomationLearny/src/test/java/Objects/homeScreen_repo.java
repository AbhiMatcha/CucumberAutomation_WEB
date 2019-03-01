package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

import static Base.utils.*;
import static Objects.ProfilePage_repo.logout;
import static Objects.login_repo.*;
import static Objects.signup_repo.*;
import static Objects.student_repo.confirmAlert;

public class homeScreen_repo extends BaseUtil
{
    public static String searchCourse ="Verify-certificate";
    public static String name ="testing";
    public static String place ="Learnyst";
    public static String country ="India";
    public static String city ="Bangalore";
    public static String state ="Karnataka";
    public static String institute ="Automation";

    public static String SkipMobileError="Reached maximum skip count. Kindly complete the form.";
    public static String MobileFieldErrorMessage="Please enter Phone Number with Country Code like +91XXXXXXXXXX";

    public static WebElement profile_button(){
        element = driver.findElement(By.id("userProfileDiv"));
        return element;
    }
    public static WebElement settings_button(){
        element = driver.findElement(By.id("settings"));
        return element;
    }
    public static WebElement Newsfeed_button(){
        element = driver.findElement(By.id("nav-newsfeed"));
        return element;
    }

    public static WebElement help_button(){
        element = driver.findElement(By.linkText("Help"));
        return element;
    }

    public static WebElement search_course(){
        element = driver.findElement(By.xpath("//*[@id='search-input']"));
        return element;
    }

    public static WebElement refresh_button(){
        element = driver.findElement(By.id("js-refresh"));
        return element;
    }
    public static WebElement logout_button(){
        element = driver.findElement(By.id("signOutID"));
        return element;
    }

    public static WebElement support_button(){
        element = driver.findElement(By.id("nav-support"));
        return element;
    }

    public static WebElement userName_Homescreen(){
        element = driver.findElement(By.xpath("//*[@id='userProfileDiv']/span"));
        return element;
    }

    public static WebElement EmailAlert(){
        element = driver.findElement(By.id("resendEmail"));
        return element;
    }

    public static WebElement offeredCourse(){
        element = driver.findElement(By.xpath("//*[@id='dashTabs']/li[2]/a"));
        return element;
    }

    public static WebElement offeredCourse_trailUser(){
        element = driver.findElement(By.xpath("//*[@id='dashTabs']/li/a"));
        return element;
    }

    public static WebElement myCourse(){
        element = driver.findElement(By.xpath("//*[@id='dashTabs']/li[1]/a"));
        return element;
    }

    public static WebElement inputMobileNumber(){
        element = driver.findElement(By.id("mobile"));
        return element;
    }

    public static WebElement inputName(){
        element = driver.findElement(By.id("name"));
        return element;
    }
    public static WebElement inputPhoneNumber(){
        element = driver.findElement(By.id("phone"));
        return element;
    }

    public static WebElement Login_Homescreen_Visitor(){
        element = driver.findElement(By.id("nav-sign-u"));
        return element;
    }


    public static WebElement inputPlace(){
        element = driver.findElement(By.id("place"));
        return element;
    }
    public static WebElement inputCity(){
        element = driver.findElement(By.id("city"));
        return element;
    }
    public static WebElement inputState(){
        element = driver.findElement(By.id("state"));
        return element;
    }
    public static WebElement inputInstitute(){
        element = driver.findElement(By.id("institute"));
        return element;
    }
    public static WebElement inputCountry(){
        element = driver.findElement(By.id("country"));
        return element;
    }

    public static WebElement SkipVerification(){
        element = driver.findElement(By.id("skip"));
        return element;
    }

    public static WebElement SubmitinputMobileNumber(){
        element = driver.findElement(By.id("submit-profile"));
        return element;
    }

    public static void completingVerification() throws InterruptedException {

        if(inputMobileNumber().isDisplayed())
        {
            inputName().click();
            inputName().sendKeys(name);
            inputPhoneNumber().click();
            inputPhoneNumber().sendKeys(MobileNumber);
            inputPlace().click();
            inputPlace().sendKeys(place);
            inputCity().click();
            inputCity().sendKeys(city);
            inputState().click();
            inputState().sendKeys(state);
            inputCountry().click();
            inputCountry().sendKeys(country);
            inputInstitute().click();
            inputInstitute().sendKeys(institute);
            inputMobileNumber().click();
            inputMobileNumber().sendKeys(MobileNumber);
            Thread.sleep(3000);
            SubmitinputMobileNumber().click();
            Thread.sleep(3000);
        }
    }

    public static void Verify_Accountverification() throws Exception
    {
        /*
         * Verify error message on
         * reaching skip limit of
         * entering accountinfo
         *
         * complete the submitting
         * account info
         *
         */
        String tempMail=randomEmail(10);
        driver.get(signup_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(4000);
        signup_mail().sendKeys(tempMail);
        signup_password().sendKeys(password);
        signupForFree().click();
        System.out.println(" ");
        Thread.sleep(4000);
        if(inputMobileNumber().isDisplayed())
        {
            SkipVerification().click();
            Thread.sleep(3000);
            logout();
        }
        openLoginPage();
        Thread.sleep(3000);
        login_email().click();
        login_email().sendKeys(tempMail);
        Thread.sleep(4000);
        login_password().click();
        login_password().sendKeys(password);
        Thread.sleep(4000);
        login_button().click();
        Thread.sleep(3000);
        if(inputMobileNumber().isDisplayed())
        {
            SkipVerification().click();
            Thread.sleep(3000);
            String errorMessage = login_repo.pop_up().getText();
            if (errorMessage.equals(SkipMobileError))
            {
                Thread.sleep(4000);
                confirmAlert().click();
                Thread.sleep(4000);
                completingVerification();
            }
        }
    }

    public static void ValidatingInputMobileNumber() throws InterruptedException {
        if (inputMobileNumber().isDisplayed()) {
            inputMobileNumber().click();
            inputMobileNumber().sendKeys(randomMobileNumber());
            Thread.sleep(3000);
            SubmitinputMobileNumber().click();
            Thread.sleep(3000);
            String errorMessage = login_repo.pop_up().getText();
            if (errorMessage.equals(MobileFieldErrorMessage)) {
                Thread.sleep(4000);
                confirmAlert().click();
                Thread.sleep(4000);
                logout_button().click();

            }
        }
    }

}
