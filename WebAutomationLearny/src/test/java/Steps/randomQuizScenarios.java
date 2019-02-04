package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import java.util.LinkedList;

import static Objects.RandomQuiz_repo.*;
import static Objects.RandomQuiz_repo.RandomQuiz;

public class randomQuizScenarios
{
    static LinkedList<String> QuestionForFirstAttempt = new LinkedList<>();
    static LinkedList<String> QuestionForSecondAttempt = new LinkedList<>();

    @And("^user able to select the random quiz$")
    public void userAbleToSelectTheRandomQuiz()
    {
        RandomQuiz().click();
    }

    @Then("^verify user able to see the shuffled questions while retaking the test$")
    public void verifyUserAbleToSeeTheShuffledQuestionsWhileRetakingTheTest()
    {
        for (int i=0,j=1,k=2;i<1;i++)
        {
            if(!QuestionForSecondAttempt.get(i).equals(QuestionForFirstAttempt.get(i)))
            {
                System.out.println("1");
                Assert.assertEquals(true, !QuestionForSecondAttempt.get(i).equals(QuestionForFirstAttempt.get(i)));
            }
            else if(!QuestionForSecondAttempt.get(j).equals(QuestionForFirstAttempt.get(j)))
            {
                System.out.println("2");
                Assert.assertEquals(true,!QuestionForSecondAttempt.get(j).equals(QuestionForFirstAttempt.get(j)));
            }
            else
            {
                System.out.println("3");
                Assert.assertEquals(true,!QuestionForSecondAttempt.get(k).equals(QuestionForFirstAttempt.get(k)));
            }
        }
    }

    @And("^user able to see the question in random quiz while doing first attempt$")
    public void userAbleToSeeTheQuestionInRandomQuizWhileDoingFirstAttempt()
    {
        QuestionForFirstAttempt.add(MultipleChoice_GetQuestion().getText());
    }

    @And("^user able to see the question in random quiz while doing second attempt$")
    public void userAbleToSeeTheQuestionInRandomQuizWhileDoingSecondAttempt()
    {
        QuestionForSecondAttempt.add(MultipleChoice_GetQuestion().getText());
    }
}
