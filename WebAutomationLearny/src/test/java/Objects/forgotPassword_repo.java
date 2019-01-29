package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class forgotPassword_repo extends BaseUtil
{
    public static String ForgotPopMessage = "An email has been sent to your account's email address. Please check your email to continue.";

    public static WebElement forgot_PasswordEmail(){
        element = driver.findElement(By.xpath("//*[@id=\"js-resetPassword-form\"]/div[1]/center/input"));
        return element;
    }
    public static WebElement forgotPassword_Send(){
        element = driver.findElement(By.id("js-resetPassword"));
        return element;
    }

    public static WebElement forgotPassword_back(){
        element = driver.findElement(By.xpath("//*[@id='js-resetPassword-form']/div[2]/button[2]"));
        return element;
    }

    public static WebElement forgotPassword_Popup(){
        element = driver.findElement(By.id("swal2-content"));
        return element;
    }

    public static WebElement successForSentEmail(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

    public static WebElement backToDashboard(){
        element = driver.findElement(By.className("backDashboard"));
        return element;
    }
}
