package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import static Base.utils.*;

public class GeneralQuiz_repo extends BaseUtil
{
    public static WebElement generalQuiz(){
        element = driver.findElement(By.id("24413"));
        return element;
    }

    public static WebElement GenralQuizMultiplechoice_Ans(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }

}
