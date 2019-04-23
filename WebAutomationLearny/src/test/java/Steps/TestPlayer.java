package Steps;

import Base.utils;
import Pages.Homepage;
import Pages.Signup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestPlayer extends utils {
    Signup signupPageElements = new Signup();
    Homepage homepageElements = new Homepage();
    Pages.TestPlayer testplayers = new Pages.TestPlayer();

    @Given("^Learner is taking a test$")
    public void learnerIsTakingATest() {
        driver.get(signup_URL);
        signupPageElements.signupFunction();
        homepageElements.navigatedToHomescreen();

    }


    @When("^Learner answer <Question type> question with <answer> for <QUIZ type>$")
    public void learnerAnswerQuestionTypeQuestionWithAnswerForQuizType(String questiontype, String answer, String QuizType) {
        testplayers.inputAnswer(questiontype, answer, QuizType);
    }

    @Given("^Learner starts {} quiz$")
    public void learnerStartsQuiz(String page) {
    }
}