package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Objects.homeScreen_repo.*;

public class ProfilePage_repo  extends BaseUtil
{

    public static String UserName_errorMessage="\n" +
            "  User name should not be null";
    public static String SavedSuccessfulyMessage="×\n" +
            "User Information saved successfully";
    public static String filedEmpty_Message="None of the fields shall be empty";
    public static String errorMessage="×\n" +
            "Provide valid mobile number with country code (Example '+91' for India)";
    public static String passwordChanged_Message="×\n" +
            "Your password has changed";
    public static String oldPasswordIncorrect_Message="Old password is incorrect.";
    public static String chooseNewPassword_Message="Please choose new password";
    public static String passwordsNotMatching_Message="New passwords are not matching";

    public static WebElement profile_closeAlert(){
        element = driver.findElement(By.id("//*[@id='learnyAlerts']/div/a"));
        return element;
    }

    public static WebElement profile_chanePassword_oldPass(){
        element = driver.findElement(By.id("current_password"));
        return element;
    }

//    public static WebElement profile_uploadButton(){
//        element = driver.findElement(By.xpath("//*[contains(text(),'Upload')]"));
//        return element;
//    }

    public static WebElement profile_uploadButton(){
        element = driver.findElement(By.xpath("//*[@id='user-img-up']/button"));
        return element;
    }

    public static WebElement profile_selectFileFromComputer(){
        element = driver.findElement(By.xpath("//*[@id='media-uploader']/div[1]/button"));
        return element;
    }

    public static WebElement closeWindow_selectImage(){
        element = driver.findElement(By.xpath("//*[@id='upload-file']/div/div[3]/button[3]"));
        return element;
    }





    public static WebElement profile_chanePassword_newPass(){
        element = driver.findElement(By.id("new_paswd"));
        return element;
    }

    public static WebElement profile_chanePassword_ConfirmNewPass(){
        element = driver.findElement(By.id("password"));
        return element;
    }


    public static WebElement profile_chanePassword_save(){
        element = driver.findElement(By.id("changePassSubmit"));
        return element;
    }

    public static WebElement profile_changePassword_close(){
        element = driver.findElement(By.xpath("//*[@id='password-change-picker']/div/div/div[3]/a"));
        return element;
    }


    public static WebElement profile_changePassowrd_showpass(){
        element = driver.findElement(By.id("show-password"));
        return element;
    }

    public static WebElement profile_changePassword_errormessage(){
        element = driver.findElement(By.className("pwd-change-msg"));
        return element;
    }


    public static WebElement profile_studentName(){
        element = driver.findElement(By.id("userName"));
        return element;
    }
    public static WebElement profile_Mobile(){
        element = driver.findElement(By.id("mobileNumber"));
        return element;
    }

    public static WebElement profile_changePassword(){
        element = driver.findElement(By.id("js-change-pwd-initiate"));
        return element;
    }

    public static WebElement profile_emailAddress(){
        element = driver.findElement(By.id("emailId"));
        return element;
    }

    public static WebElement profile_EmailCheckbox(){
        element = driver.findElement(By.id("js-newsletter-subscribe"));
        return element;
    }

    public static WebElement profile_signout(){
        element = driver.findElement(By.id("js-logoutApp"));
        return element;
    }

    public static WebElement profile_save(){
        element = driver.findElement(By.xpath("//*[@id='js-setting-submit']"));
        return element;
    }

    public static WebElement profile_alertMessage(){
        element = driver.findElement(By.className("alert-dismissable"));
        return element;
    }

    public static void logout() throws Exception
    {
        profile_button().click();
        Thread.sleep(3000);
        logout_button().click();
        Thread.sleep(3000);
    }

}
