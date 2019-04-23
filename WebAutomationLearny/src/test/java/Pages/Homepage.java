package Pages;

import Base.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Homepage extends utils {

    @FindBy(id = "userProfileDiv")
    private WebElement profile_button;

    @FindBy(id = "settings")
    private WebElement settings_button;


    @FindBy(id = "nav-newsfeed")
    private WebElement Newsfeed_button;

    @FindBy(id = "js-refresh")
    private WebElement refresh_button;

    @FindBy(id = "nav-support")
    private WebElement support_button;

    @FindBy(id = "signOutID")
    private WebElement logout_button;

    @FindBy(id = "resendEmail")
    private WebElement EmailAlert;

    @FindBy(linkText = "Help")
    private WebElement help_button;

    @FindBy(xpath = "//*[@id='search-input']")
    private WebElement search_course;

    @FindBy(xpath = "//*[@id='userProfileDiv']/span")
    private WebElement userName_Homescreen;

    @FindBy(xpath = "//*[@id='dashTabs']/li[2]/a")
    private WebElement offeredCourse;

    @FindBy(xpath = "//*[@id='dashTabs']/li/a")
    private WebElement offeredCourse_trailUser;

    public void navigatedToHomescreen()
    {
        Assert.assertEquals(profile_button.isDisplayed(), true);
    }

    public void selectTestFromOfferecCourses()
    {
        offeredCourse.click();
    }

    public void InHomePage()
    {
        profile_button.isDisplayed();
    }
}
