package Steps;

import Pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homescreen
{
    Homepage homescreenElements = new Homepage();

    @Given("^Learner is on the home page for GST enable school$")
    public void LearnerIsOnTheHomePageForGSTEnableSchool() {
    }

    @Then("^Learner is on home page$")
    public void learnerIsOnHomePage() {
        homescreenElements.navigatedToHomescreen();
    }

    @Given("^Learner is already logged in and is on home page$")
    public void learnerIsAlreadyLoggedInAndIsOnHomePage() {
    }

    @And("^Learner goes to offered courses$")
    public void learnerGoesToOfferedCourses() {
    }

    @And("^Learner selects a course from GST disabled school$")
    public void learnerSelectsACourseFromGSTDisabledSchool() {

    }

    @And("^Learner selects a course from GST enabled school$")
    public void learnerSelectsACourseFromGSTEnabledSchool() {
    }

    @And("^Learner selects a test series$")
    public void learnerSelectsATestSeries() {

    }

    @When("^Learner selects a paid bundle$")
    public void learnerSelectsAPaidBundle() {
        
    }

    @When("^Learner selects a free bundle$")
    public void learnerSelectsAFreeBundle() {
        
    }

    @When("^Learner selects a paid course$")
    public void learnerSelectsAPaidCourse() {
        
    }

    @When("^Learner selects a free course$")
    public void learnerSelectsAFreeCourse() {
        
    }

    @When("^Learner selects a scheduled course$")
    public void learnerSelectsAScheduledCourse() {
        
    }

    @When("^Learner selects a paid mock test$")
    public void learnerSelectsAPaidMockTest() {
        
    }

    @When("^Learner selects a free mock test$")
    public void learnerSelectsAFreeMockTest() {


    }

    @When("^Learner selects a scheduled mock test$")
    public void learnerSelectsAScheduledMockTest() {
        
    }

    @When("^Learner selects a paid test series$")
    public void learnerSelectsAPaidTestSeries() {
        
    }

    @When("^Learner selects a free test series$")
    public void learnerSelectsAFreeTestSeries() {
        
    }

    @When("^Learner selects a scheduled test series$")
    public void learnerSelectsAScheduledTestSeries() {

    }

    @When("^Learner selects a course$")
    public void learnerSelectsACourse() {
    }

    @And("^Learner is in home page$")
    public void learnerIsInHomePage()
    {
        homescreenElements.InHomePage();
    }
}
