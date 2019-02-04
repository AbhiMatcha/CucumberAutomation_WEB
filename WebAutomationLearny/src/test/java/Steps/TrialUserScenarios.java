package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gherkin.lexer.Th;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Base.BaseUtil.*;
import static Base.utils.*;
import static Objects.TestSeries_repo.*;
import static Objects.homeScreen_repo.*;
import static Objects.login_repo.login_email;
import static Objects.student_repo.confirmAlert;

public class TrialUserScenarios
{
    @Given("^user navigated to homepage of the school$")
    public void userNavigatedToHomepageOfTheSchool()
    {
        driver.get(homepage_URL);
    }

    @And("^user able to see newsfeed option$")
    public void userAbleToSeeNewsfeedOption()
    {
        Newsfeed_button().isDisplayed();
    }

    @And("^user able to see login button in homescreen$")
    public void userAbleToSeeLoginButtonInHomescreen()
    {
        Login_Homescreen_Visitor().isDisplayed();
    }

    @And("^user able to see Help option in home screen$")
    public void userAbleToSeeHelpOptionInHomeScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        help_button().isDisplayed();
        Thread.sleep(AddShortDelay);
    }


    @And("^user able to see offered courses tab$")
    public void userAbleToSeeOfferedCoursesTab()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        offeredCourse().isDisplayed();
    }

    @And("^user able to see newsfeeds on click newsfeed option$")
    public void userAbleToSeeNewsfeedsOnClickNewsfeedOption()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Newsfeed_button().click();
    }

    @And("^user should be navigated to login page$")
    public void userShouldBeNavigatedToLoginPage() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true,login_email().isDisplayed());

    }

    @And("^user able to select your review option in review$")
    public void userAbleToSelectYourReviewOptionInReview()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        yourReviewTab().click();
    }

    @And("^user able to confirm buy in popup message$")
    public void userAbleToConfirmBuyInPopupMessage()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        confirmAlert().click();
    }

    @And("^user able to click on login button in homescreen$")
    public void userAbleToClickOnLoginButtonInHomescreen()
    {
        Login_Homescreen_Visitor().click();

    }

    @And("^user should not able to select take test button under math test section in syllabus$")
    public void userShouldNotAbleToSelectTakeTestButtonUnderMathTestSectionInSyllabus() throws Throwable {
       Assert.assertEquals(false,TestSeries_Maths_taketest().isEnabled());
    }

    @And("^user should not able to select take test button under chemistry test section in syllabus$")
    public void userShouldNotAbleToSelectTakeTestButtonUnderChemistryTestSectionInSyllabus() throws Throwable {
        Assert.assertEquals(false,TestSeries_chemistry_taketest().isEnabled());
    }

    @And("^user should not able to select take test button under physics test section in syllabus$")
    public void userShouldNotAbleToSelectTakeTestButtonUnderPhysicsTestSectionInSyllabus() throws Throwable {
        Assert.assertEquals(false,TestSeries_Physics_taketest().isEnabled());
    }

    @And("^user able to see offered courses tab for trail user$")
    public void userAbleToSeeOfferedCoursesTabForTrailUser()
    {
        offeredCourse_trailUser().isDisplayed();
    }
}
