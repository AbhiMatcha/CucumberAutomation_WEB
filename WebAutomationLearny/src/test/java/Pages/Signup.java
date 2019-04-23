package Pages;

import Base.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Signup extends utils
{

    @FindBy(id = "signup-email")
    private WebElement signup_mail;

    @FindBy(id = "signup-password")
    private WebElement signup_password;

    @FindBy(id = "js-signup")
    private WebElement signupForFree;

    @FindBy(xpath = "//*[@id='js-signup-form']/div/div[2]/p/a")
    private WebElement signupPage_signin;

    public void signupFunction()
    {
        Assert.assertEquals(signup_mail.isDisplayed(), true);
        signup_mail.clear();
        signup_mail.sendKeys(randomEmail(Signup_Email_length));
        Assert.assertEquals(signup_password.isDisplayed(), true);
        signup_password.clear();
        signup_password.sendKeys(password);
        signupForFree.click();
    }



}
