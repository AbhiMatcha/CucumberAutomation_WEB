package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import static Base.utils.*;
import static Objects.CourseOverview_repo.*;
import static Objects.CourseSyllabus_repo.*;
import static Objects.MockTest_repo.*;
import static Objects.TestSeries_repo.*;
import static Objects.resultPage_repo.*;

public class TestSeriesScenarios
{
    @And("^user able to select test series$")
    public void userAbleToSelectTestSeries()
    {
        TestSeries_test().click();
    }

    @And("^user able to see the course description of test series$")
    public void userAbleToSeeTheCourseDescriptionOfTestSeries() {
        Assert.assertEquals(true, Course_description().getText().equals(TestSeries_long_description));
    }

    @And("^user should be able to select the analytics tab$")
    public void userShouldBeAbleToSelectTheAnalyticsTab() throws InterruptedException {
        Assert.assertEquals(true, Analytics_tab().isDisplayed());
        Analytics_tab().click();
        Thread.sleep(AddShortDelay);
    }

    @Then("^user able to see the message before he/she buy the course$")
    public void userAbleToSeeTheMessageBeforeHeSheBuyTheCourse() {
        Analytics_Message_Before_buy().getText().equals(AnalyticsMessageBeforeBuy);
    }

    @Then("^user should be able to select the review tab$")
    public void userShouldBeAbleToSelectTheReviewTab() {
        Reviews_tab().click();
    }

    @And("^user able to scroll down to see the pricing details of test series$")
    public void userAbleToScrollDownToSeeThePricingDetailsOfTestSeries() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", courseActualPrice());

    }

    @Then("^user should see the actual and discount price for Test series")
    public void userShouldSeeTheActualAndDiscountPriceForTestSeries() {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, (Integer.parseInt(courseDiscountPrice().getText())) == (TestSeries_discountPrice));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, (Integer.parseInt(courseActualPrice().getText())) == (actualPrice));
    }

    @Then("^user able to see error message or change in price after applying coupon for test series$")
    public void userAbleToSeeErrorMessageOrChangeInPriceAfterApplyingCouponForTestSeries() throws InterruptedException {
        if (Coupon_error().isDisplayed()) {
            Assert.assertEquals(true, Coupon_error().getText().equals(Coupon_errorMessage));
        }
        if ((Integer.parseInt(courseDiscountPrice().getText())) != (TestSeries_discountPrice)) {
            int result = PriceCalculator(TestSeries_discountPrice);
            Assert.assertEquals(true, (Integer.parseInt(courseDiscountPrice().getText()) == result));
        }
    }

    @And("^user able to click buy button in sales page$")
    public void userAbleToClickBuyButtonInSalesPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        buynowButton().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user should navigate back to sales page from payment page and select syllabus tab$")
    public void userShouldNavigateBackToSalesPageFromPaymentPageAndSelectSyllabusTab() throws InterruptedException {
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        syllabusTab().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to select Math test under syllabus$")
    public void userAbleToSelectMathTestUnderSyllabus() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestSeries_Mathstest().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to select take test button under math test section in syllabus$")
    public void userAbleToSelectTakeTestButtonUnderTestSectionInSyllabus() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestSeries_Maths_taketest().click();
        Thread.sleep(AddShortDelay);

    }

    @And("^user able to select multiple choice question$")
    public void userAbleToSelectMultipleChoiceQuestion() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MultipleChoice_GetQuestion().click();
    }

    @And("^user able to navigate back$")
    public void userAbleToNavigateBack() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to select Chemsitry test under syllabus$")
    public void userAbleToSelectChemsitryTestUnderSyllabus() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestSeries_Chemistrytest().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to select take test button under chemistry test section in syllabus$")
    public void userAbleToSelectTakeTestButtonUnderChemistryTestSectionInSyllabus()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestSeries_chemistry_taketest().click();
    }

    @And("^user able to select take test button under physics test section in syllabus$")
    public void userAbleToSelectTakeTestButtonUnderPhysicsTestSectionInSyllabus()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestSeries_Physics_taketest().click();
    }

    @And("^user able to see score report$")
    public void userAbleToSeeScoreReport()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",  scoreReport());
        Assert.assertEquals(true, scoreReport().isDisplayed());
    }

    @And("^user able to see distribution section$")
    public void userAbleToSeeDistributionSection()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",  distribution());
        Assert.assertEquals(true, distribution().isDisplayed());
    }

    @And("^user able to see time heat chart$")
    public void userAbleToSeeTimeHeatChart()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",  TimeHeatChart());
        Assert.assertEquals(true, TimeHeatChart().isDisplayed());
    }

    @And("^user able to see comparision section$")
    public void userAbleToSeeComparisionSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",  comparision());
        Assert.assertEquals(true, comparision().isDisplayed());
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to see the analysis based on the section selected$")
    public void userAbleToSeeTheAnalysisBasedOnTheSectionSelected() throws InterruptedException
    {
//        Thread.sleep(AddShortDelay);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);",  section_Name());
//        Thread.sleep(AddShortDelay);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Assert.assertEquals(true,section_Name().isDisplayed());
        section_Name().click();
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true,VerbalAbilityAndReadingComprehension().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String section1=VerbalAbilityAndReadingComprehension().getText();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        VerbalAbilityAndReadingComprehension().click();
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true,section1.equalsIgnoreCase(section_Name().getText()));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        section_Name().click();
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true,DataInterpretationAndLogicalReasoning().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String section2=DataInterpretationAndLogicalReasoning().getText();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DataInterpretationAndLogicalReasoning().click();
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true,section2.equalsIgnoreCase(section_Name().getText()));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        section_Name().click();
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true,QuantitativeAbility().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String section3=QuantitativeAbility().getText();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        QuantitativeAbility().click();
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true,section3.equalsIgnoreCase(section_Name().getText()));
    }

    @And("^user able to see the information of each section under analytics tab$")
    public void userAbleToSeeTheInformationOfEachSectionUnderAnalyticsTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Analytics_TestTitle().isDisplayed();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Analytics_selectTest().click();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String Chemistry =Analytics_selectChemistryTest().getText();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String physics =Analytics_selectPhysicsTest().getText();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String maths=Analytics_selectMathsTest().getText();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Analytics_selectChemistryTest().click();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true,(Chemistry.toUpperCase().equals(Analytics_TestTitle().getText())));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true,Analytics_viewResult().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Analytics_selectTest().click();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Analytics_selectPhysicsTest().click();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true,(physics.toUpperCase().equals(Analytics_TestTitle().getText())));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true,Analytics_viewResult().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Analytics_selectTest().click();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Analytics_selectMathsTest().click();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true,(maths.toUpperCase().equals(Analytics_TestTitle().getText())));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true,Analytics_viewResult().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Analytics_viewResult().click();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true,solutions().isDisplayed());
    }
}
