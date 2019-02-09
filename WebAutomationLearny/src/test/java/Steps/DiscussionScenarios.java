package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Base.utils.*;
import static Objects.CourseDiscussion_repo.*;
import static Objects.CourseNotes_repo.deleteConfirm;
import static Objects.CourseOverview_repo.*;
import static Objects.Redactor_repo.*;
import static Objects.bundle_repo.*;
import static Objects.student_repo.*;

public class DiscussionScenarios {

    static String moduleName = "discussion";
    static String edited_que = randomText(moduleName);

    @And("^user able to see the purchased message in course details$")
    public void userAbleToSeeThePurchasedMessageInCourseDetails() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, purchased().isDisplayed());
        Assert.assertEquals(true, purchased().getText().equals(purchased_text));
    }

    @Then("^user able to see the all fields of the redactor page$")
    public void userAbleToSeeTheAllFieldsOfTheRedactorPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_bold().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_italic().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_underline().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_lists().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_link().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_mathEquation().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_preview().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_uploadFile().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, postInput().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, cancelInput().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, enterInput().isDisplayed());
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to enter a question as input$")
    public void userAbleToEnterAQuestionAsInput() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(DiscussionQuestion_input);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(Keys.ENTER);
    }

    @And("^user able to select bold option in redactor and enter input$")
    public void userAbleToSelectBoldOptionInRedactorAndEnterInput() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_bold().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(DiscussionQuestion_input);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(Keys.ENTER);
    }

    @And("^user able to select bundle$")
    public void userAbleToSelectBundle() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, Verify_Bundle().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Verify_Bundle().click();
    }

    @And("^user able to select course 'Fill in the blank'$")
    public void userAbleToSelectCourseFillInTheBlank() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, fillInTheBlank_Course().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        fillInTheBlank_Course().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to select italic option in redactor and enter input$")
    public void userAbleToSelectItalicOptionInRedactorAndEnterInput() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_italic().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(DiscussionQuestion_input);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(Keys.ENTER);
    }

    @And("^user able to select underline option in redactor and enter input$")
    public void userAbleToSelectUnderlineOptionInRedactorAndEnterInput() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_underline().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(DiscussionQuestion_input);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(Keys.ENTER);
    }

    @And("^user able to select list option in redactor$")
    public void userAbleToSelectListOptionInRedactor() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_lists().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_lists().click();
    }

    @Then("^user able to enter input using both unordered list$")
    public void userAbleToEnterInputUsingBothUnorderedList() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_unorderedlist().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_unorderedlist().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(DiscussionQuestion_input);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_lists().click();
    }

    @Then("^user able to enter input using ordered list$")
    public void userAbleToEnterInputUsingOrderedList() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_orderedlist().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_orderedlist().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(DiscussionQuestion_input);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(Keys.ENTER);
    }

    @And("^user able to select link option in redactor$")
    public void userAbleToSelectLinkOptionInRedactor() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_link().click();
    }

    @And("^user able to use both text and URL link$")
    public void userAbleToUseBothTextAndURLLink() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_URLlink().sendKeys(Insert_URLlink);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_TextLink().sendKeys(Insert_textLink);

    }

    @And("^user able to see cancel and confirm option for inserting link$")
    public void userAbleToSeeCancelAndConfirmOptionForInsertingLink() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_insertCancel().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_insertConfirm().click();
        Thread.sleep(AddShortDelay);
    }

    @Then("^user able to see unlink option$")
    public void userAbleToSeeUnlinkOption() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_unLink().isDisplayed());
    }

    @And("^user able to post the question$")
    public void userAbleToPostTheQuestion() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, postInput().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        postInput().click();
        Thread.sleep(AddShortDelay);
    }

    @Then("^user able to the edit option$")
    public void userAbleToTheEditOption() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, discussionEditInput().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        discussionEditInput().click();
    }

    @And("^user able to edit the input and post the question$")
    public void userAbleToEditTheInputAndPostTheQuestion() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().clear();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(edited_que);
        enterInput().sendKeys(edited_que);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        postInput().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to see the reply option$")
    public void userAbleToSeeTheReplyOption() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, discussionReplyAsk().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        discussionReplyAsk().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to reply to the question posted$")
    public void userAbleToReplyToTheQuestionPosted() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().click();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        enterInput().sendKeys(DiscussionReply_input);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        postInput().click();
    }

    @Then("^user able to view the replies posted$")
    public void userAbleToViewTheRepliesPosted() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, viewReplies().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        viewReplies().click();
    }

    @And("^another user able to see the posted question$")
    public void anotherUserAbleToSeeThePostedQuestion() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(edited_que);
        System.out.println(viewFirstQuestion().getText());
        Assert.assertEquals(true, edited_que.equals(viewFirstQuestion().getText()));
    }

    @And("^user able to see the delete button in discussion$")
    public void userAbleToSeeTheDeleteButtonInDiscussion() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, discussionDeleteAsk().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        discussionDeleteAsk().click();
    }

    @And("^user able to delete the posted question$")
    public void userAbleToDeleteThePostedQuestion() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, deleteConfirm().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        deleteConfirm().click();

    }

    @And("^user able to select the courses tab$")
    public void userAbleToSelectTheCoursesTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, coursesTab().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        coursesTab().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to select insert link option$")
    public void userAbleToSelectInsertLinkOption() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, select_insertLink().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_insertLink().click();
        Thread.sleep(AddShortDelay);
    }
}
