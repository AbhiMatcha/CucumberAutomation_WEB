package Objects;


import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import static Base.utils.MultipleChoice_RandomAnswers;

public class Gmat_repo extends BaseUtil
{
    public  static String errorMessage_without_Ans="You have not choosen answer";
    public static WebElement GmatTest(){
        element = driver.findElement(By.id("27850"));
        return element;
    }

    public static WebElement GmatTest_SaveWithoutAns_ErrorMessage(){
        element = driver.findElement(By.id("swal2-title"));
        return element;
    }

    public static WebElement GmatMultiplechoice_Ans(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }


}
