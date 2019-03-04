package Objects;

import Base.BaseUtil;
import Base.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static Base.utils.*;
import static Objects.forgotPassword_repo.*;
import static Objects.student_repo.confirmAlert;

public class login_repo extends BaseUtil
{
    public static String schoolName ="QualiCenter";

    public static WebElement login_email()
    {
        element = driver.findElement(By.id("lernystLogin_new_user_user_emai"));
        return element;
    }

    public static WebElement login_password() {
        element = driver.findElement(By.id("lernystLogin_new_user_user_password"));
        return element;
    }

    public static WebElement login_button() {
        element = driver.findElement(By.className("learnyst-btn-login"));
        return element;
    }

    public static WebElement forgot_PasswordButton() {
        element = driver.findElement(By.className("learnyst-forgot-pwd"));
        return element;
    }

    public static WebElement pop_up() {
        element = driver.findElement(By.id("swal2-content"));
        return element;
    }

    public static WebElement signup_button() {
        element = driver.findElement(By.xpath("//*[@id='js-signin-form']/div/div/div/p/a"));
        return element;
    }

    public static WebElement Fb_button() {
        element = driver.findElement(By.id("js-login-fb-web"));

        return element;
    }

    public static WebElement email_FB() {
        element = driver.findElement(By.id("email"));
        return element;
    }

    public static WebElement password_FB() {
        element = driver.findElement(By.id("pass"));
        return element;
    }

    public static WebElement Fb_Login() {
        element = driver.findElement(By.id("u_0_0"));
        return element;
    }

    public static WebElement select_Gmail() {
        element = driver.findElement(By.className("WaidBe"));
        return element;
    }


    public static WebElement email_google() {
        element = driver.findElement(By.xpath("//div[contains(text(),'Email or phone')]"));
        return element;
    }

    public static WebElement EmailNext_google() {
        element = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
        return element;
    }

    public static WebElement PasswordNext_google() {
        element = driver.findElement(By.xpath("//*[@id='passwordNext']/content/span"));
        return element;
    }

    public static WebElement password_google() {
        element = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
        return element;
    }

    public static WebElement deleteMessage_gmail() {
        element = driver.findElement(By.xpath("//*[@id=':5']/div[2]/div[1]/div/div[2]/div[3]"));
        return element;
    }

//    public static WebElement select_Gmail(){
//        element = driver.findElement(By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]"));
//        element = driver.findElements(By.xpath("//*[@class='zF']"));
//        return element;
//    }

    public static WebElement selectAll_gmail() {
        element = driver.findElement(By.xpath("//*[@id=':36']/div[1]/span"));
        return element;
    }

    public static WebElement Delete_mail() {
        element = driver.findElement(By.xpath("//*[@data-tooltip='Delete']"));
        return element;
    }


    public static void openLoginPage()
    {
        driver.get(utils.login_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static WebElement messageFromSchool()
    {
        element = driver.findElement(By.xpath("//*[@id=':3b']/span[1]/span"));
        return element;

    }

    public static void loginMethod() throws Exception
    {
        /**  Login using valid credentails
         * Verify login is successfull and navigated
         * to homepage, by finding profile after login
         */
        openLoginPage();
        Thread.sleep(3000);
        try {
            login_email().click();
        }
        catch (Exception e)
        {
            System.out.println("Login__test case 8: User not navigated to login page");
        }

        Thread.sleep(4000);
        login_email().sendKeys(Login_email);
        Thread.sleep(4000);
        login_password().click();
        login_password().sendKeys(password);
        Thread.sleep(4000);
        Assert.assertEquals(true, login_repo.login_button().isDisplayed());
        login_button().click();
        Thread.sleep(4000);
    }

    public static void fbLogin() throws Exception
    {
        /* Verify third party login */

        openLoginPage();
        Thread.sleep(3000);
        Fb_button().click();
        Thread.sleep(5000);
        Set<String> st= driver.getWindowHandles();
        Iterator<String> it = st.iterator();
        String parent =  it.next();
        String child =it.next();
        driver.switchTo().window(child);
        email_FB().click();
        email_FB().sendKeys(Fb_email);
        Thread.sleep(4000);
        password_FB().click();
        password_FB().sendKeys(Fb_Password);
        Thread.sleep(4000);
        Fb_Login().click();
        Thread.sleep(3000);
        driver.switchTo().window(parent);
        Thread.sleep(4000);
    }

    public static void Verify_forgotPassword() throws Exception
    {
        Assert.assertEquals(true, forgot_PasswordButton().isDisplayed());
        forgot_PasswordButton().click();
        Thread.sleep(4000);
        Assert.assertEquals(true, forgot_PasswordEmail().isDisplayed());
        forgot_PasswordEmail().click();
        forgot_PasswordEmail().sendKeys(google_email);
        Thread.sleep(4000);
        Assert.assertEquals(true, forgotPassword_Send().isDisplayed());
        Thread.sleep(2000);
        Assert.assertEquals(true, forgotPassword_back().isDisplayed());
        forgotPassword_Send().click();
        Thread.sleep(4000);
        Assert.assertEquals(true, forgotPassword_Popup().isDisplayed());
        String PopupMessage=forgotPassword_Popup().getText();
        Thread.sleep(4000);
        Assert.assertEquals(true,PopupMessage.equals(forgotPassword_repo.ForgotPopMessage));
        confirmAlert().click();
        Thread.sleep(4000);
        driver.get(google_URL);
        Thread.sleep(3000);
        System.out.println("hi im here");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Email or phone')]")));
        System.out.println(email_google().isDisplayed());
        email_google().click();
        System.out.println("Hey i clicked");
        Thread.sleep(3000);
        email_google().sendKeys(google_email);
        Thread.sleep(3000);
        EmailNext_google().click();
        Thread.sleep(3000);
        password_google().click();
        Thread.sleep(3000);
        password_google().sendKeys(google_password);
        Thread.sleep(5000);
        PasswordNext_google().click();
        Thread.sleep(3000);
        select_Gmail().click();
        Thread.sleep(3000);
        if(messageFromSchool().isDisplayed())
        {
            if((messageFromSchool().getText()).equals(schoolName))
            {
                messageFromSchool().click();
                Thread.sleep(3000);
                Assert.assertEquals(true,deleteMessage_gmail().isDisplayed());
                Thread.sleep(3000);
                deleteMessage_gmail().click();
            }
        }
        else
            {
               Assert.assertEquals(true,deleteMessage_gmail().isDisplayed());
            }
    }

}
