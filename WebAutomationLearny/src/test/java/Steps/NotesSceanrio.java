package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Base.utils.*;
import static Objects.CourseDiscussion_repo.*;
import static Objects.CourseNotes_repo.*;
import static Objects.Redactor_repo.*;
import static Objects.Redactor_repo.select_uploadFile;

public class NotesSceanrio {
    @And("^user able to delete the notes$")
    public void userAbleToDeleteTheNotes()
    {
        Assert.assertEquals(true,noteDeleteAsk().isDisplayed());
        noteDeleteAsk().click();
        Assert.assertEquals(true,deleteConfirm().isDisplayed());
        deleteConfirm().click();
    }

    @And("^user able to enter a notes as input$")
    public void userAbleToEnterANotesAsInput() throws InterruptedException
    {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        enterInput().sendKeys(NotestQuestion_input);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        enterInput().sendKeys(Keys.ENTER);

    }

    @Then("^user able to see the all fields of the redactor page for notes$")
    public void userAbleToSeeTheAllFieldsOfTheRedactorPageForNotes() throws InterruptedException {
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
        Assert.assertEquals(true, postInput().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, cancelInput().isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, enterInput().isDisplayed());
        Thread.sleep(AddShortDelay);
    }

    @Then("^user able to see the input as a note$")
    public void userAbleToSeeTheInputAsANote()
    {
        Assert.assertEquals(true,!(enterInput().getText()).equals(""));
    }
}
