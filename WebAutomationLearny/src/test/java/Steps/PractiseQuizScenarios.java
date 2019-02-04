package Steps;

import cucumber.api.java.en.And;

import static Objects.practiseQuiz_repo.*;

public class PractiseQuizScenarios
{
    @And("^user able to select the practise quiz$")
    public void userAbleToSelectThePractiseQuiz()
    {
        practiseQuiz().click();
    }
}
