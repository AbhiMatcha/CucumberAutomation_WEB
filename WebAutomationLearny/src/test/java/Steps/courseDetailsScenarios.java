package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import static Base.utils.*;
import static Objects.CourseCertificate_repo.*;
import static Objects.CourseDiscussion_repo.discussionAsk;
import static Objects.CourseNotes_repo.noteCreateTab;
import static Objects.CourseOverview_repo.*;
import static Objects.CourseSyllabus_repo.*;
import static Objects.homeScreen_repo.*;
import static Objects.payment_repo.paySecurely;
import static Objects.student_repo.confirmAlert;

public class courseDetailsScenarios
{
    @And("^user able to select the course$")
    public void userAbleToSelectTheCourse() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Course_verifyCertificate().click();
        Thread.sleep(AddLongDelay);
    }

    @Then("^user should see the actual and discount price for course$")
    public void userShouldSeeTheActualAndDiscountPriceForCourse() {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, (Integer.parseInt(courseDiscountPrice().getText())) == (MockTest_discountPrice));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, (Integer.parseInt(courseActualPrice().getText())) == (actualPrice));
    }

    @And("^user able to see the school name at the footer$")
    public void userAbleToSeeTheSchoolNameAtTheFooter() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Footer());
        Assert.assertEquals(true, Footer().isDisplayed());
        Assert.assertEquals(true, Footer().getText().equals(schoolName));

    }

    @Then("^user should be able to select the overview tab$")
    public void userShouldBeAbleToSelectTheOverviewTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        overviewTab().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to see description of the course$")
    public void userAbleToSeeDescriptionOfTheCourse() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, Course_description().getText().equals(long_description));
    }

    @And("^user able to see course expiry$")
    public void userAbleToSeeCourseExpiry() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, courseExpiry().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, courseExpiry().getText() != null);

    }

    @Then("^user should be able to select the syllabus tab$")
    public void userShouldBeAbleToSelectTheSyllabusTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        syllabusTab().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to see course title in syllabus section$")
    public void userAbleToSeeCourseTitleInSyllabusSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, syllabusCourseTitle().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        syllabusCourseTitle().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to see Lesson title in syllabus section$")
    public void userAbleToSeeLessonTitleInSyllabusSection() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, syllabusLessonTitle().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        syllabusLessonTitle().click();

    }

    @Then("^user tapping on confirm button should navigate to payment page$")
    public void userTappingOnConfirmButtonShouldNavigateToPaymentPage()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        confirmAlert().click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, paySecurely().isDisplayed());

    }

    @And("^user should navigate back to sales page from payment page$")
    public void userShouldNavigateBackToSalesPageFromPaymentPage()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.navigate().refresh();
        Assert.assertEquals(true,overviewTab().isDisplayed());
    }

    @And("^user able to see buy pop-up message with confirm and cancel button when clicks on lesson$")
    public void userAbleToSeeBuyPopUpMessageWithConfirmAndCancelButtonWhenClicksOnLesson()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, confirmAlert().isDisplayed());
        Assert.assertEquals(true, cancelButton().isDisplayed());
    }

    @Then("^user should be able to select the discussion tab$")
    public void userShouldBeAbleToSelectTheDiscussionTab() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, discussionTab().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        discussionTab().click();
        Thread.sleep(AddShortDelay);
    }

    @When("^user able to select ask option in discussion$")
    public void userAbleToSelectAskOptionInDiscussion() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        discussionAsk().click();
        Thread.sleep(AddLongDelay);
    }

    @Then("^user should be able to select the Notes tab$")
    public void userShouldBeAbleToSelectTheNotesTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, noteTab().isDisplayed());
        noteTab().click();
        Thread.sleep(AddShortDelay);
    }

    @When("^user able to select create option in notes$")
    public void userAbleToSelectCreateOptionInNotes() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        noteCreateTab().click();
        Thread.sleep(AddLongDelay);
    }

    @Then("^user should be able to select the Certificate tab$")
    public void userShouldBeAbleToSelectTheCertificateTab()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, certificateTab().isDisplayed());
        certificateTab().click();
    }

    @When("^user able to select download certificate option in certificate section$")
    public void userAbleToSelectDownloadCertificateOptionInCertificateSection()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, downloadCertificate_button().isDisplayed());
        downloadCertificate_button().click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @And("^user able to see buy pop-up message with confirm and cancel button when clicks on test under certificate section$")
    public void userAbleToSeeBuyPopUpMessageWithConfirmAndCancelButtonWhenClicksOnTestUnderCertificateSection()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, certificateTestLists().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        certificateTestLists().click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    @Then("^user able to see the buy button$")
    public void userAbleToSeeTheBuyButton()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, buynowButton().isDisplayed());
    }

    @And("^user able to enter the coupon$")
    public void userAbleToEnterTheCoupon() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true,enterCoupon().isDisplayed());
        enterCoupon().sendKeys(myCoupon);
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to apply the coupon$")
    public void userAbleToApplyTheCoupon() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true,applyCoupon().isDisplayed());
        applyCoupon().click();
        Thread.sleep(AddLongDelay);
    }

    @Then("^user able to see error message or change in price after applying coupon$")
    public void userAbleToSeeErrorMessageOrChangeInPriceAfterApplyingCoupon() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        if (Coupon_error().isDisplayed())
        {
            Assert.assertEquals(true,Coupon_error().getText().equals(Coupon_errorMessage));
        }
        if((Integer.parseInt(courseDiscountPrice().getText())) != (MockTest_discountPrice))
        {
            int result = PriceCalculator(MockTest_discountPrice);
            Assert.assertEquals(true, (Integer.parseInt(courseDiscountPrice().getText()) == result));
        }

    }

}