package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class MockTest_repo extends BaseUtil
{
    public static WebElement saveButton(){
        element = driver.findElement(By.className("js_nextQuestn"));
        return element;
    }

    public static WebElement nextButton(){
        element = driver.findElement(By.className("js-practice-next"));
        return element;
    }

    public static WebElement submitButton(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

    public static WebElement solutions(){
        element = driver.findElement(By.id("js-viewAns"));
        return element;
    }

    public static WebElement retakeTest(){
        element = driver.findElement(By.id("js-revise"));
        return element;
    }

    public static WebElement resumeButton(){
        element = driver.findElement(By.linkText("RESUME"));
        return element;
    }


    public static WebElement takeTest(){
        element = driver.findElement(By.className("js-takeTest"));
        return element;
    }

    public static WebElement startTest(){
        element = driver.findElement(By.className("js-startTest"));
        return element;
    }

    public static WebElement startCourse(){
        element = driver.findElement(By.className("gotoPaidCourse"));
        return element;
    }

    public static WebElement enterContact(){
        element = driver.findElement(By.id("contact"));
        return element;
    }

    public static WebElement readInstructions(){
        element = driver.findElement(By.className("js_testInstructn"));
        return element;
    }

    public static WebElement BackToQuestionPage(){
        element = driver.findElement(By.className("js_backToQP"));
        return element;
    }

    public static WebElement AllQuestions(){
        element = driver.findElement(By.className("js_questnList"));
        return element;
    }

    public static WebElement TestTimer(){
        element = driver.findElement(By.id("timer"));
        return element;
    }

}
