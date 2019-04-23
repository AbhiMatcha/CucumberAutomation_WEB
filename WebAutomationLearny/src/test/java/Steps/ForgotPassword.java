package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPassword {

    @When("^Learner selects forgot password button$")
    public void LearnerSelectsForgotPasswordButton() {

    }

    @And("^Learner enters valid email to request reset password$")
    public void learnerEntersValidEmailToRequestResetPassword() {
    }

    @Then("^Learner able to see the reset password link in his email$")
    public void learnerAbleToSeeTheResetPasswordLinkInHisEmail() {
    }

    @And("^Learner enters invalid email to request reset password$")
    public void learnerEntersInvalidEmailToRequestResetPassword() {
        
    }

    @Then("^Learner should see error message for invalid email input$")
    public void learnerShouldSeeErrorMessageForInvalidEmailInput() {

    }
}
