package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import org.testng.Assert;

import static Base.utils.*;
import static Objects.homeScreen_repo.*;
import static Objects.support_repo.*;

public class SupportTicketScenarios
{
    @And("^user able to see the support option$")
    public void userAbleToSeeTheSupportOption()
    {
        Assert.assertEquals(true,support_button().isDisplayed());
    }

    @And("^user able to select the support option$")
    public void userAbleToSelectTheSupportOption()
    {
        support_button().click();
    }

    @And("^user able to see the field for subject$")
    public void userAbleToSeeTheFieldForSubject()
    {
        supportTicket_title().click();
    }

    @And("^user able to enter the title of ticket in subject field$")
    public void userAbleToEnterTheTitleOfTicketInSubjectField() throws InterruptedException
    {
        supportTicket_title().sendKeys(ticket_Title);
        Thread.sleep(AddShortDelay);

    }

    @And("^user able to see the field for description$")
    public void userAbleToSeeTheFieldForDescription()
    {
        Assert.assertEquals(true,supportTicket_description().isDisplayed());
        supportTicket_description().click();
    }

    @And("^user able to enter the description of the ticket in description field$")
    public void userAbleToEnterTheDescriptionOfTheTicketInDescriptionField()
    {
        supportTicket_description().sendKeys(ticket_Description);
    }

    @And("^user should be able to select the checkbox$")
    public void userShouldBeAbleToSelectTheCheckbox()
    {
        supportTicket_checkBox().click();
    }

    @And("^user able to submit the ticket$")
    public void userAbleToSubmitTheTicket()
    {
        supportTicket_submit().click();
    }

    @And("^user should be able to confrim the submission of the raised ticket$")
    public void userShouldBeAbleToConfrimTheSubmissionOfTheRaisedTicket()
    {
        supportTicket_confirmSubmit().click();
    }
}
