package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Payment {


    @And("^Learner selects razorpay method$")
    public void LearnerSelectsRazorpayMethod() {

    }


    @Then("^Learner bought a course using razorpay payment method$")
    public void learnerBoughtACourseUsingRazorpayPaymentMethod() {
    }

    @And("^Learner selects PayU method$")
    public void learnerSelectsPayUMethod() {
        
    }

    @Then("^Learner bought a course using payU payment method$")
    public void learnerBoughtACourseUsingPayUPaymentMethod() {
        
    }

    @And("^Learner selects Instamojo method$")
    public void learnerSelectsInstamojoMethod() {


    }

    @Then("^Learner bought a course using Instamojo payment method$")
    public void learnerBoughtACourseUsingInstamojoPaymentMethod() {
        
    }

    @And("^Learner selects CC-Avenue method$")
    public void learnerSelectsCCAvenueMethod() {
        
    }

    @Then("^Learner bought a course using CC-Avenue payment method$")
    public void learnerBoughtACourseUsingCCAvenuePaymentMethod() {
    }
}
