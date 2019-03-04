package Steps;

import Objects.resultPage_repo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import static Base.utils.*;
import static Objects.CourseCertificate_repo.Course_viewResult;
import static Objects.IITjeeMain_repo.*;
import static Objects.MockTest_repo.*;
import static Objects.quizRepo.*;
import static Objects.resultPage_repo.*;

public class ResultPageScenarios
{
    @And("^user able to select IITjee test$")
    public void userAbleToSelectIITjeeTest() throws InterruptedException {
        IITjeeMainQuiz().click();
        Thread.sleep(AddShortDelay);
    }


    @When("^user navigated to test he/she should be able to see read instructions$")
    public void userNavigatedToTestHeSheShouldBeAbleToSeeReadInstructions()
    {
        Assert.assertEquals(true,readInstructions().isDisplayed());
    }

    @And("^user able to click on read instructions$")
    public void userAbleToClickOnReadInstructions()
    {
        readInstructions().click();
    }

    @And("^user able to go back to test on tapping back button$")
    public void userAbleToGoBackToTestOnTappingBackButton()
    {
        BackToQuestionPage().click();
    }

    @And("^user able to see all questions button$")
    public void userAbleToSeeAllQuestionsButton()
    {
        Assert.assertEquals(true,AllQuestions().isDisplayed());
    }

    @And("^user able to see the timer displayed$")
    public void userAbleToSeeTheTimerDisplayed()
    {
        Assert.assertEquals(true,TestTimer().isDisplayed());
    }

    @Then("^user able to see all questions by tapping all questions button$")
    public void userAbleToSeeAllQuestionsByTappingAllQuestionsButton()
    {
        AllQuestions().click();
    }

    @And("^user able to see mark for review option$")
    public void userAbleToSeeMarkForReviewOption()
    {
        Assert.assertEquals(true,markForReview().isDisplayed());
    }

    @And("^user should be able to click mark for review option$")
    public void userShouldBeAbleToClickMarkForReviewOption()
    {
        markForReview().click();
    }

    @And("^user able to switch chemsitry section$")
    public void userAbleToSwitchChemsitrySection()
    {
        chemistryTab().click();
    }

    @And("^user able to exit from the test by tapping back button$")
    public void userAbleToExitFromTheTestByTappingBackButton() throws InterruptedException {
        backButton().click();
        Thread.sleep(AddShortDelay);
        exitFromTest().click();
    }

    @Then("^user able to restore the answered questions$")
    public void userAbleToRestoreTheAnsweredQuestions() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        restoreAnswers().click();
    }

    @And("^user able to switch mathematics section$")
    public void userAbleToSwitchMathematicsSection()
    {
        mathematicsTab().click();
    }

    @And("^user able to switch physics section$")
    public void userAbleToSwitchPhysicsSection()
    {
        physicsTab().click();
    }

    @And("^user able to click solutions button in result page$")
    public void userAbleToClickSolutionsButtonInResultPage()
    {
        solutions().click();
    }

    @Then("^user able to see the explanation of the answer$")
    public void userAbleToSeeTheExplanationOfTheAnswer()
    {
        Assert.assertEquals(false,(Answer_explanation().getText()).equals(""));
    }

    @And("^user able to see the count of correct section$")
    public void userAbleToSeeTheCountOfCorrectSection()
    {
        Assert.assertEquals(true, resultPage_repo.correctAnswerCount().isDisplayed());
    }

    @And("^user able to see the count of correct answers$")
    public void userAbleToSeeTheCountOfCorrectAnswers()
    {
        Assert.assertEquals(true,correctAnswerCount().getText()!="null");
    }

    @And("^user able to see the count of incorrect section$")
    public void userAbleToSeeTheCountOfIncorrectSection()
    {
        Assert.assertEquals(true, incorrectAnswerCount().isDisplayed());
    }

    @And("^user able to see the count of incorrect answers$")
    public void userAbleToSeeTheCountOfIncorrectAnswers()
    {
        Assert.assertEquals(true,incorrectAnswerCount().getText()!="null");
    }

    @And("^user able to see the count of skipped section$")
    public void userAbleToSeeTheCountOfSkippedSection()
    {
        Assert.assertEquals(true, skippedAnswerCount().isDisplayed());
    }

    @And("^user able to see the count of skipped aquestions$")
    public void userAbleToSeeTheCountOfSkippedAquestions()
    {
        Assert.assertEquals(true,skippedAnswerCount().getText()!="null");
    }

    @And("^user able to see the total marks section$")
    public void userAbleToSeeTheTotalMarksSection()
    {
        Assert.assertEquals(true, totalMarksScored().isDisplayed());
    }

    @And("^user able to see the total marks in result page$")
    public void userAbleToSeeTheTotalMarksInResultPage()
    {
        Assert.assertEquals(true,totalMarksScored().getText()!="null");
    }

    @And("^user able to see the detailed analysis button$")
    public void userAbleToSeeTheDetailedAnalysisButton()
    {
        Assert.assertEquals(true, DetailedAnalysis().isDisplayed());
    }

    @And("^user able to click detailed analysis button$")
    public void userAbleToClickDetailedAnalysisButton()
    {
        DetailedAnalysis().click();
    }

    @Then("^user able to click view result button$")
    public void userAbleToClickViewResultButton()
    {
        Course_viewResult().click();
    }
}
