package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static Base.utils.*;
import static Objects.CourseCertificate_repo.*;
//import static Objects.CourseOverview_repo.*;
import static Objects.CourseOverview_repo.certificateTab;
import static Objects.MockTest_repo.*;
import static Objects.homeScreen_repo.*;
import static Objects.payment_repo.*;
import static org.testng.Assert.assertTrue;

public class CertificateSceanrios
{
    public static JavascriptExecutor js = (JavascriptExecutor) driver;

    @And("^user should be able to select the course to test certificate$")
    public void userShouldBeAbleToSelectTheCourseToTestCertificate() throws InterruptedException
    {
        if(Course_verifyCertificate().isDisplayed())
        {
            Course_verifyCertificate().click();
        }
        else
        {
            js.executeScript("window.scrollBy(285,700)", "");
            Thread.sleep(AddShortDelay);
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            Course_verifyCertificate().click();
        }
    }

    @And("^user able to see error message when he/she didnt taken the test$")
    public void userAbleToSeeErrorMessageWhenHeSheDidntTakenTheTest()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        errorMessage_forDownload().getText().equals(ErrorMessageTodownloadCert);
    }

    @And("^user able to see test name under certificate section$")
    public void userAbleToSeeTestNameUnderCertificateSection()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true,CertificateTestName().getText()!=null);
    }

    @And("^user able to see the qualifying marks of the test to download certificate$")
    public void userAbleToSeeTheQualifyingMarksOfTheTestToDownloadCertificate()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true,CertificateTestQualifyMarks().getText()!=null);
    }

    @And("^user able to see the test status under certificate section$")
    public void userAbleToSeeTheTestStatusUnderCertificateSection()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, CertificateTestStatus().getText().equals(statusBeforeTakingTest));
    }

    @And("^user able to select the test under certificate tab$")
    public void userAbleToSelectTheTestUnderCertificateTab()
    {
        Assert.assertEquals(true,certificateTestLists().isDisplayed());
        certificateTestLists().click();
    }

    @And("^user able to see and confirm buy pop-up alert on selecting test$")
    public void userAbleToSeeAndConfirmBuyPopUpAlertOnSelectingTest()
    {
        Assert.assertEquals(true, certificateBuyCoursePopUp().isDisplayed());
        certificateBuyCoursePopUp().click();
    }

    @And("^user able to redirect to payment page and click pay securely button$")
    public void userAbleToRedirectToPaymentPageAndClickPaySecurelyButton() throws InterruptedException {
        Assert.assertEquals(true, paySecurely().isDisplayed());
        paySecurely().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^switch frame before selecting payment$")
    public void switchFrameBeforeSelectingPayment()
    {
        driver.switchTo().frame(0);
    }

    @And("^user able to enter mobile number$")
    public void userAbleToEnterMobileNumber()
    {
        Assert.assertEquals(true,enterContact().isDisplayed());
        enterContact().sendKeys(MobileNumber);
    }

    @Then("^user able to select net banking option$")
    public void userAbleToSelectNetBankingOption()
    {
        Netbanking().click();
    }

    @And("^user able to select any bank$")
    public void userAbleToSelectAnyBank()
    {
        selectDifferentBank();
    }

    @Then("^user able to click on paynow button$")
    public void userAbleToClickOnPaynowButton() throws InterruptedException
    {
        payNow().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to search for course$")
    public void userAbleToSearchForCourse() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, search_course().isDisplayed());
        search_course().click();
        search_course().sendKeys(verifyCertificateName);
    }

    @Then("^user able to see the start course option after completing payment$")
    public void userAbleToSeeTheStartCourseOptionAfterCompletingPayment() throws InterruptedException {
        Set<String> st= driver.getWindowHandles();
        Iterator<String> it = st.iterator();
        String parent =  it.next();
        String child =it.next();
        driver.switchTo().window(child);
        successButton().click();
        Thread.sleep(AddShortDelay);
        driver.switchTo().window(parent);
        driver.switchTo().window(parent);
        assertTrue(startCourse().isDisplayed());

    }

    @And("^user able to select the resume button in sales page$")
    public void userAbleToSelectTheResumeButtonInSalesPage() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true,resumeButton().isDisplayed());
        resumeButton().click();
    }

    @And("^user should be able to tap on next after saving the answer$")
    public void userShouldBeAbleToTapOnNextAfterSavingTheAnswer()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        nextButton().click();
    }

    @And("^user able to answer the first question in section one of practise test$")
    public void userAbleToAnswerTheFirstQuestionInSectionOneOfPractiseTest()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        getCertificateTest_Answer1().click();
    }

    @And("^user able to answer the second question in section one of practise test$")
    public void userAbleToAnswerTheSecondQuestionInSectionOneOfPractiseTest()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        getCertificateTest_Answer2().click();
    }

    @And("^user able to retake the test$")
    public void userAbleToRetakeTheTest() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        retakeTest().click();
    }

    @And("^user able to solutions button after completing test$")
    public void userAbleToSolutionsButtonAfterCompletingTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true,solutions().isDisplayed());
        Thread.sleep(AddShortDelay);
    }

    @Then("^user should navigate back to testplayer from result page$")
    public void userShouldNavigateBackToTestPlayerFromResultPage()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.navigate().back();
    }

    @And("^user able to view result$")
    public void userAbleToViewResult() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true,Course_viewResult().isDisplayed());
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to see retake count$")
    public void userAbleToSeeRetakeCount()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true,Course_retakeCount().isDisplayed());
    }

    @And("^user should be navigated to sales page and select certificate tab$")
    public void userShouldBeNavigatedToSalesPageAndSelectCertificateTab() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        driver.navigate().back();
        Thread.sleep(AddShortDelay);
        certificateTab().click();
    }

    @Then("^user able to download the certificate if he is eligible$")
    public void userAbleToDownloadTheCertificateIfHeIsEligible() throws InterruptedException {

        if(CertificateTestStatus().getText().equals(statusAfterPassingTest))
        {
            Assert.assertEquals(true,TestMessage_forDownload().getText().equals(SucessMessageTodownloadCert));
            Assert.assertEquals(true,downloadCertificate_button().isDisplayed());
            downloadCertificate_button().click();
            Thread.sleep(AddLongDelay);

            /**
             * uncomment below line when
             * you are testing in local machine
             */

            driver.navigate().back();
        }
        else
        {
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            Assert.assertEquals(true, errorMessage_forDownload().getText().equals(FailMessageTodownloadCert));
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            Assert.assertEquals(true, CertificateTestStatus().getText().equals(statusAfterFailingTest));
        }
    }

}
