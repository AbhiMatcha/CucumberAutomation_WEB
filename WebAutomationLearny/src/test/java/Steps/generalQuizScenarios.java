package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import static Objects.GeneralQuiz_repo.generalQuiz;

public class generalQuizScenarios {
    @And("^user able to select the general quiz$")
    public void userAbleToSelectTheGeneralQuiz()
    {
        generalQuiz().click();
    }
}
