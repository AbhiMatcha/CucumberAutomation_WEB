package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup
{
        @Given("^Learner signs up for the GST enabled school$")
        public void LearnerSignsUpForTheGSTEnabledSchool()
        {

        }

        @Given("^Learner is on the signup page$")
        public void learnerIsOnTheSignupPage() {
        }

        @Then("^Learner should signup or skip the verification$")
        public void learnerShouldSignupOrSkipTheVerification() {
        }

        @When("^Learner enters <email> and <password> and clicks on signup for free$")
        public void learnerEntersEmailAndPasswordAndClicksOnSignupForFree() {
        }

        @Then("^Learner should see the message <errorMessage> or skip the verification$")
        public void learnerShouldSeeTheMessageErrorMessageOrSkipTheVerification() {

        }

    @When("^Learner enters random \"([^\"]*)\" and \"([^\"]*)\" and clicks on signup for free$")
    public void learnerEntersRandomAndAndClicksOnSignupForFree(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
