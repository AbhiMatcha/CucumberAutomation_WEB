package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import static Base.utils.*;

public class practiseQuiz_repo extends BaseUtil
{

        public static WebElement practiseQuiz(){
            element = driver.findElement(By.id("30365"));
            return element;
        }

        public static WebElement PractiseQuizMultiplechoice_Ans(){
            element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
            return element;
        }


    }

