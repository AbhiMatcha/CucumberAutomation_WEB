package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Base.utils.*;
import static Objects.CATquiz_testDetails_LeaderBoard_repo.*;
import static Objects.CourseOverview_repo.*;
import static Objects.Gmat_repo.*;
import static Objects.MockTest_repo.*;
import static Objects.homeScreen_repo.refresh_button;
import static Objects.quizRepo.*;
import static Objects.student_repo.*;

public class GmatTestSceanrios
{
    @And("^user should be able to select Gmat test$")
    public void userShouldBeAbleToSelectGmatTest()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        GmatTest().click();
    }

    @And("^user able to click the enroll free course button$")
    public void userAbleToClickTheEnrollFreeCourseButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        enrollFreeCourse().click();
        Thread.sleep(AddShortDelay);

    }

    @And("^user able to see error message when user save the question without answering$")
    public void userAbleToSeeErrorMessageWhenUserSaveTheQuestionWithoutAnswering()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        saveButton().click();
        Assert.assertEquals(true,(GmatTest_SaveWithoutAns_ErrorMessage().getText()).equals(errorMessage_without_Ans));

    }

    @And("^user able to confirm the alert$")
    public void userAbleToConfirmTheAlert() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        confirmAlert().click();
        Thread.sleep(AddShortDelay);
    }

    @Then("^user able to answer the multiple choice question$")
    public void userAbleToAnswerTheMultipleChoiceQuestion() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        GmatMultiplechoice_Ans().click();
    }

    @Then("^user able to answer the feedback question$")
    public void userAbleToAnswerTheFeedbackQuestion() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        FeedbackInput().sendKeys(FeedBack_Essay_Ans());
    }

    @Then("^user able to answer the fill in the blank question$")
    public void userAbleToAnswerTheFillInTheBlankQuestion()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        fillInTheBlankAnswerInput().sendKeys(fillInTheBlank_Ans());
    }

    @Then("^user able to see refresh button after submitting the test$")
    public void userAbleToSeeRefreshButtonAfterSubmittingTheTest()
    {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(true,refresh_button().isDisplayed());
    }

    @And("^user able to navigate back and see the mock test status as evaluation pending$")
    public void userAbleToNavigateBackAndSeeTheMockTestStatusAsEvaluationPending()
    {
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        MockTest_scheduledTime_status().getText().equals(evaluation_pending);
    }
}
