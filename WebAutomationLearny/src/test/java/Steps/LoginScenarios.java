package Steps;

import Objects.forgotPassword_repo;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import static Base.utils.*;
import static Objects.forgotPassword_repo.*;
import static Objects.homeScreen_repo.logout_button;
import static Objects.homeScreen_repo.profile_button;
import static Objects.login_repo.*;
import static Objects.student_repo.confirmAlert;

public class LoginScenarios
{
    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage()
    {
        driver.get(login_URL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("^I entered ([^\"]*) and ([^\"]*)$")
    public void iEnteredUsernameAndPassword(String username, String password)
    {
            Assert.assertEquals(login_email().isDisplayed(),true);
            login_email().clear();
            login_email().sendKeys(username);
            Assert.assertEquals(login_password().isDisplayed(),true);
            login_password().clear();
            login_password().sendKeys(password);
    }

//    @And("^I entered login username and login password$")
//    public void iEnteredLoginUsernameAndLoginPassword()
//    {
//        Assert.assertEquals(login_email().isDisplayed(),true);
//        login_email().clear();
//        login_email().sendKeys(Login_email);
//        Assert.assertEquals(login_password().isDisplayed(),true);
//        login_password().clear();
//        login_password().sendKeys(password);
//    }

    @And("^I clicked login button$")
    public void iClickedLoginButton()
    {
        Assert.assertEquals(login_button().isDisplayed(),true);
        login_button().click();
    }

    @Then("^User should login and can see profile$")
    public void userShouldLoginAndCanSeeProfile()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(profile_button().isDisplayed(),true);

    }

    @Then("^([^\"]*) message should be displayed$")
    public void errormessageShouldBeDisplayed(String errorMessage)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals(pop_up().isDisplayed(),true);
        pop_up().getText().equals(errorMessage);
    }

    @And("^user completed facebook login$")
    public void userCompletedFacebookLogin() throws InterruptedException {

        Assert.assertEquals(true,Fb_button().isDisplayed());
        Fb_button().click();
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Set<String> st= driver.getWindowHandles();
        Iterator<String> it = st.iterator();
        String parent =  it.next();
        String child =it.next();
        driver.switchTo().window(child);
        email_FB().clear();
        email_FB().sendKeys(Fb_email);
        Assert.assertEquals(password_FB().isDisplayed(),true);
        password_FB().clear();
        password_FB().sendKeys(Fb_Password);
        Assert.assertEquals(true,Fb_Login().isDisplayed());
        Fb_Login().click();
        driver.switchTo().window(parent);
    }

    @Then("^navigated to homepage after login$")
    public void navigatedToHomepageAfterLogin()
    {
        /**
         * waiting for page to load
         */
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Then("^selected forgot password$")
    public void selectedForgotPassword()
    {
        Assert.assertEquals(true, forgot_PasswordButton().isDisplayed());
        forgot_PasswordButton().click();
    }

    @And("^enter email to send reset password link$")
    public void enterEmailToSendResetPasswordLink()
    {
        Assert.assertEquals(true, forgot_PasswordEmail().isDisplayed());
        forgot_PasswordEmail().click();
        forgot_PasswordEmail().sendKeys(google_email);
    }

    @Then("^click on send button and verify message displayed$")
    public void clickOnSendButtonAndVerifyMessageDisplayed()
    {
        Assert.assertEquals(true, forgotPassword_Send().isDisplayed());
        forgotPassword_Send().click();
        Assert.assertEquals(true, forgotPassword_Popup().isDisplayed());
        String PopupMessage=forgotPassword_Popup().getText();
        Assert.assertEquals(true,PopupMessage.equals(forgotPassword_repo.ForgotPopMessage));
        confirmAlert().click();
    }

    @Then("^user should be able to logout$")
    public void userShouldBeAbleToLogout()
    {
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        logout_button().click();
    }

    @When("^send button and cancel button should be displayed$")
    public void sendButtonAndCancelButtonShouldBeDisplayed()
    {
        Assert.assertEquals(true, forgotPassword_back().isDisplayed());
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Assert.assertEquals(true, forgotPassword_Send().isDisplayed());

    }

    @And("^user able to select profile$")
    public void userAbleToSelectProfile()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        profile_button().click();
    }

    @And("^user able to select signup option in login page$")
    public void userAbleToSelectSignupOptionInLoginPage()
    {
        signup_button().click();
    }

    @And("^In login page user entered login username and login password$")
    public void inLoginPageUserEnteredLoginUsernameAndLoginPassword() throws Throwable {
        Assert.assertEquals(login_email().isDisplayed(),true);
        login_email().clear();
        login_email().sendKeys(Login_email);
        Assert.assertEquals(login_password().isDisplayed(),true);
        login_password().clear();
        login_password().sendKeys(password);
    }
}
