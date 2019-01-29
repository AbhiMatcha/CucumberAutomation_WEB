package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static Objects.CourseSyllabus_repo.*;
import static Objects.MockTest_repo.retakeTest;
import static Objects.MockTest_repo.takeTest;

public class SyllabusScenario
{
    @And("^user able to see the status of test completion$")
    public void userAbleToSeeTheStatusOfTestCompletion()
    {
        Assert.assertEquals(true,Syllabus_completeStatus().getText()!=null);

    }

    @Then("^verifu user navigated to take test page$")
    public void verifuUserNavigatedToTakeTestPage()
    {
        if(takeTest().isDisplayed())
        {
            Assert.assertEquals(true, takeTest().isDisplayed());
        }
        else{
            Assert.assertEquals(true, retakeTest().isDisplayed());
        }

    }
}
