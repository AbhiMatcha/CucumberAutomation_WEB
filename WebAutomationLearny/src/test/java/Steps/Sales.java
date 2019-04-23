package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sales
{


    @Given("^Learner takes test and answers few questions$")
    public void learnerTakesTestAndAnswersFewQuestions() {
    }

    @And("^clicks on Buy now$")
    public void clicksOnBuyNow() {
    }

    @When("^Learner enters a ([^\"]*)$")
    public void learnerEntersAValidCoupon() {

    }

    @And("^clicks on Apply button$")
    public void clicksOnApplyButton() {
    }

    @Then("^Learner has successfully applied the coupon$")
    public void learnerHasSuccessfullyAppliedTheCoupon() {
    }

    @And("^Learner should see change in price for GST enabled school$")
    public void learnerShouldSeeChangeInPriceForGSTEnabledSchool() {

    }

    @And("^Learner should see change in price for GST disabled school$")
    public void learnerShouldSeeChangeInPriceForGSTDisabledSchool() {

    }


    @Then("^Learner gets an ([^\"]*) for GST enabled school$")
    public void learnerGetsAnErrorMessageForGSTEnabledSchool() {
    }

    @Then("^Learner gets an ([^\"]*) for GST disabled school$")
    public void learnerGetsAnErrorMessageForGSTDisabledSchool() {
    }
}
