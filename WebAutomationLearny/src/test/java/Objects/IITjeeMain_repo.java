package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import static Base.utils.MultipleChoice_RandomAnswers;

public class IITjeeMain_repo extends BaseUtil
{
    public static WebElement IITjeeMainQuiz(){
        element = driver.findElement(By.id("24557"));
        return element;
    }
    public static WebElement IITjeeMain_Multiplechoice_Ans(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }

    public static WebElement physicsTab()
    {
        element = driver.findElement(By.id("71087"));
        return element;
    }
    public static WebElement chemistryTab()
    {
        element = driver.findElement(By.id("71088"));
        return element;
    }
    public static WebElement mathematicsTab()
    {
        element = driver.findElement(By.id("71089"));
        return element;
    }

    public static WebElement Answer_explanation()
    {
        element = driver.findElement(By.id("quizExplanId"));
        return element;
    }

    public static WebElement restoreAnswers(){
        element = driver.findElement(By.className("btn-success"));
        return element;
    }

}
