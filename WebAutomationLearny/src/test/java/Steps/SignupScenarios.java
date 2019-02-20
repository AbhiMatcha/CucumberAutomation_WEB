package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import static Base.utils.*;
import static Objects.homeScreen_repo.SkipVerification;
import static Objects.login_repo.pop_up;
import static Objects.signup_repo.*;

public class SignupScenarios {
    @Given("^I navigated to signup page$")
    public void iNavigatedToSignupPage() throws InterruptedException {
        driver.get(signup_URL);
        Thread.sleep(AddShortDelay);
    }

    @And("^user entered ([^\"]*) and ([^\"]*)$")
    public void userEnteredSignup_EmailAndSignup_Password(String name, String password)
    {
        Assert.assertEquals(signup_mail().isDisplayed(), true);
        signup_mail().clear();
        signup_mail().sendKeys(name);
        Assert.assertEquals(signup_password().isDisplayed(), true);
        signup_password().clear();
        signup_password().sendKeys(password);
    }

    @And("^entered email with length ([^\"]*) and ([^\"]*)$")
    public void userEnteredEmailWithLengthSignup_UsernameAndSignup_Password( int length, String password)
    {
        Assert.assertEquals(signup_mail().isDisplayed(), true);
        signup_mail().clear();
        signup_mail().sendKeys(randomEmail(length));
        Assert.assertEquals(signup_password().isDisplayed(), true);
        signup_password().clear();
        signup_password().sendKeys(password);
    }


//    @And("^entered email with signup_email and Signup_Password$")
//    public void userEnteredEmailWithLengthSignup_emailAndSignup_Password()
//    {
//        Assert.assertEquals(signup_mail().isDisplayed(), true);
//        signup_mail().clear();
//        signup_mail().sendKeys(randomEmail(Signup_Email_length));
//        Assert.assertEquals(signup_password().isDisplayed(), true);
//        signup_password().clear();
//        signup_password().sendKeys(password);
//    }

    @And("^I tapped on signUp for free button$")
    public void iTappedOnSignUpForFreeButton()
    {
        signupForFree().click();
    }

    @Then("^user should signup or skip the verification$")
    public void userShouldSignupOrSkipTheVerification() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        if(SkipVerification().isDisplayed())
        {
            SkipVerification().click();
        }
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.id("userProfileDiv")).isDisplayed(), true);
     }

    @Then("^user should see the message ([^\"]*) or skip the verification$")
    public void userShouldSeeTheMessageErrorMessageOrSkipTheVerification(String errorMessage) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals(pop_up().isDisplayed(),true);
        pop_up().getText().equals(errorMessage);
        Thread.sleep(5000);

    }

    @And("^entered email with signup_email and Signup_Password$")
    public void enteredEmailWithSignup_emailAndSignup_Password()
    {
        Assert.assertEquals(signup_mail().isDisplayed(), true);
        signup_mail().clear();
        signup_mail().sendKeys(randomEmail(Signup_Email_length));
        Assert.assertEquals(signup_password().isDisplayed(), true);
        signup_password().clear();
        signup_password().sendKeys(password);
    }
}
