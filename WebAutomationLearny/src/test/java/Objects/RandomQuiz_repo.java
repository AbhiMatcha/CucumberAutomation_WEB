package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Base.utils.*;

public class RandomQuiz_repo  extends BaseUtil
{
    public static WebElement RandomQuiz(){
        /* using to Verify test details*/
        element = driver.findElement(By.id("30379"));
        return element;
    }
    public static WebElement MultipleChoice_GetQuestion(){
        /* using to Verify test details*/
        element = driver.findElement(By.xpath("//*[@id='questionTpl']/div[2]/p"));
        return element;
    }

    public static WebElement RandomQuizMultiplechoice_Ans(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }

}
