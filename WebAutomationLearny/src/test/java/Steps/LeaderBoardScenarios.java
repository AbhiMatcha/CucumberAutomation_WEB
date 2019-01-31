package Steps;

import Objects.resultPage_repo;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import static Base.utils.*;
import static Objects.CATquiz_testDetails_LeaderBoard_repo.*;
import static Objects.CourseOverview_repo.*;
import static Objects.IITjeeMain_repo.CancelrestoreAnswers;
import static Objects.MockTest_repo.*;
import static Objects.homeScreen_repo.profile_button;
import static Objects.quizRepo.*;
import static Objects.student_repo.*;

public class LeaderBoardScenarios
{
    private static String userName;
    private LinkedList<String> Course_LeaderBoardMarkList = new LinkedList<>();
    private LinkedList<String> Course_LeaderBoardList = new LinkedList<>();
    private LinkedList<String> ResultPage_LeaderBoardList = new LinkedList<>();
    private LinkedList<String> ResultPage_LeaderBoardMarkList = new LinkedList<>();

    @And("^user should be able to select the CAT MockTest$")
    public void userShouldBeAbleToSelectTheCATMockTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, MockTest().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MockTest().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^c$")
    public void userAbleToSeeTheEnrollFreeCourseButton() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, enrollFreeCourse().isDisplayed());
    }

    @And("^user able to see take test button$")
    public void userAbleToSeeTakeTestButton() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, takeTest().isDisplayed());
    }

    @And("^user able to see live status of the test$")
    public void userAbleToSeeLiveStatusOfTheTest() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, TestDetails_liveStatus().isDisplayed());

    }

    @And("^user able to see the test marks$")
    public void userAbleToSeeTheTestMarks() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, TestDetails_testmarks().isDisplayed());

    }

    @And("^user able to see the test minutes$")
    public void userAbleToSeeTheTestMinutes() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, TestDetails_testMinutes().isDisplayed());

    }

    @Then("^verify test minutes contains some value$")
    public void verifyTestMinutesContainsSomeValue() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, TestDetails_testMinutes().getText() != null);
    }

    @And("^user able to see the test level$")
    public void userAbleToSeeTheTestLevel() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, TestDetails_testLevel().isDisplayed());
    }

    @Then("^verify test level contains some value$")
    public void verifyTestLevelContainsSomeValue() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, TestDetails_testLevel().getText() != null);
    }

    @Then("^Verify test marks contains some value$")
    public void verifyTestMarksContainsSomeValue() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, TestDetails_testmarks().getText() != null);
    }

    @Then("^user should be able to select the Leader board tab$")
    public void userShouldBeAbleToSelectTheLeaderBoardTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestDetails_LeaderBoardTab().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to see student name under leader board section$")
    public void userAbleToSeeStudentNameUnderLeaderBoardSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, Student_cloumn().isDisplayed());
    }

    @And("^user able to see Rank under leader board section$")
    public void userAbleToSeeRankUnderLeaderBoardSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, Rank_cloumn().isDisplayed());
    }

    @And("^user able to see score under leader board section$")
    public void userAbleToSeeScoreUnderLeaderBoardSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, Score_cloumn().isDisplayed());

    }

    @And("^user able to click enrol for free course button$")
    public void userAbleToClickEnrolForFreeCourseButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enrollFreeCourse().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to click take test button$")
    public void userAbleToClickTakeTestButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        takeTest().click();
        Thread.sleep(AddLongDelay);
    }

    @And("^user able to click start test button$")
    public void userAbleToClickStartTestButton() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        startTest().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to answer the first question in section one of CAT test$")
    public void userAbleToAnswerTheFirstQuestionInSectionOneOfCATTest()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        mockTest_section1_Answer1().click();
    }

    @And("^user should be able to save the answered question$")
    public void userShouldBeAbleToSaveTheAnsweredQuestion() {
        saveButton().click();
    }

    @And("^user able to answer the second question in section one of CAT test$")
    public void userAbleToAnswerTheSecondQuestionInSectionOneOfCATTest() {
        mockTest_section1_Answer2().click();
    }

    @And("^user able to submit$")
    public void userAbleToSubmit() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        submitButton().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to click final submit$")
    public void UserAÂbleToClickFinalSubmit() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        finalSubmit().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to confirm the submit$")
    public void userAbleToConfirmTheSubmit() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        confirmAlert().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to answer the first question in second section of CAT test$")
    public void userAbleToAnswerTheFirstQuestionInSecondSectionOfCATTest()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        mockTest_section2_Answer1().click();
    }

    @Then("^user able to select calculator while taking the test$")
    public void userAbleToSelectCalculatorWhileTakingTheTest()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        calculator().click();
    }

    @And("^user able to perform multiplication of two values$")
    public void userAbleToPerformMultiplicationOfTwoValues()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        value1().click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        multiplication().click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        value1().click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Equals().click();
    }

    @And("^user able to close the calculator$")
    public void userAbleToCloseTheCalculator()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        closeCalculator().click();
    }

    @And("^user able to answer the first question in third section of CAT test$")
    public void userAbleToAnswerTheFirstQuestionInThirdSectionOfCATTest()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        mockTest_section3_Answer1().click();
    }

    @Then("^collect the details the top ten students in result page under leaderboard section$")
    public void CollectTheDetailsTheTopTenStudentsInResultPageUnderLeaderboardSection() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(1148,747);");
        Thread.sleep(AddShortDelay);
        for (int i = 1; i <= 10; i++) {
            ResultPage_LeaderBoardList.add(resultPage_repo.resultPage_LeaderBoardList(i).getText());
            ResultPage_LeaderBoardMarkList.add(resultPage_repo.resultPage_LeaderBoardmarksList(i).getText());
        }
    }

    @And("^user able to see his/her name in the leader board section in result page$")
    public void userAbleToSeeHisHerNameInTheLeaderBoardSectionInResultPage() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true, (UserName_leaderBoard().getText()).equalsIgnoreCase(userName));
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to navigate back to leaderBoard page in sales page$")
    public void userAbleToNavigateBackToLeaderBoardPageInSalesPage()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        TestDetails_LeaderBoardTab().click();
    }

    @And("^collect the details the top ten students in leaderboard section$")
    public void collectTheDetailsTheTopTenStudentsInLeaderboardSection()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        for (int i = 1; i <= 10; i++) {
            Course_LeaderBoardList.add(TestDetails_LeaderBoardList(i).getText());
            Course_LeaderBoardMarkList.add(TestDetails_LeaderBoardmarksList(i).getText());
        }
    }

    @Then("^the details of top ten students should match both in result page and sales page$")
    public void theDetailsOfTopTenStudentsShouldMatchBothInResultPageAndSalesPage()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        for (int i = 1; i <= 10; i++)
        {
            Assert.assertEquals(true, (Course_LeaderBoardList.get(i)).equalsIgnoreCase(ResultPage_LeaderBoardList.get(i)));
            Assert.assertEquals(true, (Course_LeaderBoardMarkList.get(i)).equalsIgnoreCase(ResultPage_LeaderBoardMarkList.get(i)));
        }
    }

    @And("^user should be able to select the expired mock test$")
    public void userShouldBeAbleToSelectTheExpiredMockTest() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MockTest_ExpiredTest().click();
    }

    @And("^user able to see the expired message for particular mock test$")
    public void userAbleToSeeTheExpiredMessageForParticularMockTest()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, MockTest_scheduledTime_status().getText().equals(Expired_Message));
    }

    @And("^user should be able to select the scheduled mock test$")
    public void userShouldBeAbleToSelectTheScheduledMockTest()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MockTest_scheduledTest().click();
    }

    @And("^user able to see the scheduled time for particular mock test$")
    public void userAbleToSeeTheScheduledTimeForParticularMockTest()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, MockTest_scheduledTime_status().getText().equals(scheduledTime));
    }

    @And("^save the user name from profile$")
    public void saveTheUserNameFromProfile() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        userName=profile_button().getText();
    }

    @And("^user able to cancel the restoring answer option if it displays$")
    public void userAbleToCancelTheRestoringAnswerOptionIfItDisplays()
    {
        try {
            if (CancelrestoreAnswers().isDisplayed()) {
                CancelrestoreAnswers().click();
            }
        }catch (Exception e)
        {
            System.out.println("");
        }

    }

}
