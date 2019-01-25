package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class resultPage_repo extends BaseUtil
{

    public static WebElement resultPage_LeaderBoardList(int i){
        String index= String.valueOf(i);
        element = driver.findElement(By.xpath("//*[@id='js-learderList']/li["+index+"]/div/div/div[2]/div/div[2]/div/div/a"));
        return element;
    }

    public static WebElement resultPage_LeaderBoardmarksList(int i){
        String index= String.valueOf(i);
        element = driver.findElement(By.xpath("//*[@id='js-learderList']/li["+index+"]/div/div/div[4]/span"));
        return element;
    }

    public static WebElement correctAnswerCount(){
        element = driver.findElement(By.xpath("//*[@id='learnyContent']/div/div/div[2]/div[1]/div/div[2]/div[1]"));
        return element;
    }
    public static WebElement incorrectAnswerCount(){
        element = driver.findElement(By.xpath("//*[@id='learnyContent']/div/div/div[2]/div[1]/div/div[3]/div[1]"));
        return element;
    }
    public static WebElement skippedAnswerCount(){
        element = driver.findElement(By.xpath("//*[@id='learnyContent']/div/div/div[2]/div[1]/div/div[4]/div[1]"));
        return element;
    }

    public static WebElement totalMarksScored(){
        element = driver.findElement(By.xpath("//*[@id='learnyContent']/div/div/div[2]/div[1]/div/div[1]/div[1]"));
        return element;
    }

    public static WebElement DetailedAnalysis(){
        element = driver.findElement(By.id("js-question-report"));
        return element;
    }

    public static WebElement section_Name(){
        element = driver.findElement(By.className("section-dd-name"));
        return element;
    }

    public static WebElement scoreReport(){
        element = driver.findElement(By.xpath("//*[@id='learnyContent']/div/div/div[3]/div[1]/div[2]/div/div/div[1]"));
        return element;
    }

    public static WebElement distribution(){
        element = driver.findElement(By.xpath("//*[@id='learnyContent']/div/div/div[3]/div[1]/div[3]/div/div[1]"));
        return element;
    }

    public static WebElement comparision(){
        element = driver.findElement(By.xpath("//*[@id='analyticsTab']/div/div[4]/div/div[1]"));
        return element;
    }

    public static WebElement TimeHeatChart(){
        element = driver.findElement(By.xpath("//*[@id='analyticsTab']/div/div[5]/div/div[1]"));
        return element;
    }


}
