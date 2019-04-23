package Steps;

import Base.utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends utils
{
    Pages.Login loginElements = new Pages.Login();

    @Given("^Learner is on the login page$")
    public void LearnerIsOnTheLoginPage()
    {
        driver.get(login_URL);
    }

    @When("^Learner enters email and password and clicks on Login$")
    public void learnerEntersEmailAndPasswordAndClicksOnLogin(String Login_email , String password)
    {
        loginElements.login(Login_email,password);
    }

    @And("^Learner clicks on Login with Google$")
    public void learnerClicksOnLoginWithGoogle() {
    }

    @And("^Learner clicks on Login with Facebook$")
    public void learnerClicksOnLoginWithFacebook() {

    }

    @When("^Learner enters invalid ([^\"]*) and ([^\"]*) and clicks on Login$")
    public void learnerEntersInvalidEmailAndPasswordAndClicksOnLogin(String invalidEmail, String invalidPassword)
    {
        loginElements.Invalidlogin(invalidEmail,invalidPassword);
        
    }

    @Then("^Learner should get an ([^\"]*) for login$")
    public void learnerShouldGetAnErrorMessageForLogin(String errorMessage)
    {

        loginElements.errorMessages(errorMessage);
    }
}
