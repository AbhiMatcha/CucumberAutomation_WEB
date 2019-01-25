package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import static Base.utils.MultipleChoice_RandomAnswers;

public class CATquiz_testDetails_LeaderBoard_repo extends BaseUtil
{

    public static WebElement MockTest(){
        /* using to Verify test details*/
        element = driver.findElement(By.id("24409"));
        return element;
    }


    public static WebElement Student_cloumn() {
        element = driver.findElement(By.xpath("//*[@id='js-leader']/div/div/div[1]"));
        return element;
    }
    public static WebElement Rank_cloumn() {
        element = driver.findElement(By.xpath("//*[@id='js-leader']/div/div/div[2]"));
        return element;
    }
    public static WebElement Score_cloumn() {
        element = driver.findElement(By.xpath("//*[@id='js-leader']/div/div/div[3]"));
        return element;
    }

    public static WebElement MockTest_scheduledTest() {
        element = driver.findElement(By.id("30541"));
        return element;
    }

    public static WebElement MockTest_ExpiredTest() {
        element = driver.findElement(By.id("30550"));
        return element;
    }

    public static WebElement MockTest_scheduledTime_status() {
        element = driver.findElement(By.className("tp-timer"));
        return element;
    }

    public static WebElement parent() {
        element = driver.findElement(By.id("leaderTab"));
        return element;
    }

    public static WebElement TestDetails_testmarks(){
        element = driver.findElement(By.xpath("//*[@id='takeQuiz']/div/div/div/div/div[1]/table/tbody/tr[1]/td[1]/p"));
        return element;
    }
    public static WebElement TestDetails_testMinutes(){
        element = driver.findElement(By.xpath("//*[@id='takeQuiz']/div/div/div/div/div[1]/table/tbody/tr[1]/td[2]/p"));
        return element;
    }
    public static WebElement TestDetails_testLevel(){
        element = driver.findElement(By.xpath("//*[@id='takeQuiz']/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]/p"));
        return element;
    }

    public static WebElement TestDetails_backToCourse_button(){
        element = driver.findElement(By.id("backToCourse"));
        return element;
    }

    public static WebElement TestDetails_liveStatus(){
        element = driver.findElement(By.className("quiz-live-status"));
        return element;
    }

    public static WebElement TestDetails_LeaderBoardTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[2]/a"));
        return element;
    }

    public static WebElement TestDetails_LeaderBoardList(int i){
        String index= String.valueOf(i);
        element = driver.findElement(By.xpath("//*[@id='js-learderBoardList']/li["+index+"]/div/div/div[1]/div/div[2]/span"));
        return element;
    }

    public static WebElement TestDetails_LeaderBoardmarksList(int i){
        String index= String.valueOf(i);
        element = driver.findElement(By.xpath("//*[@id='js-learderBoardList']/li["+index+"]/div/div/div[3]/span"));
        return element;
    }

    public static WebElement mockTest_section1_Answer1(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }

    public static WebElement mockTest_section1_Answer2(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }


    public static WebElement mockTest_section2_Answer1(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }

    public static WebElement mockTest_section3_Answer1(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }

    public static WebElement calculator(){
        element = driver.findElement(By.id("js-show-calc"));
        return element;
    }
    public static WebElement value1(){
        element = driver.findElement(By.id("keyPad_btn1"));
        return element;
    }
    public static WebElement multiplication(){
        element = driver.findElement(By.xpath("//*[@id=\'keyPad_btnMult\']/div"));
        return element;
    }
    public static WebElement Equals(){
        element = driver.findElement(By.xpath("//*[@id=\'keyPad_btnEnter\']/div"));
        return element;
    }
    public static WebElement closeCalculator(){
        element = driver.findElement(By.id("closeButton"));
        return element;
    }

    public static WebElement UserName_leaderBoard(){
        element = driver.findElement(By.xpath("//*[@id='my-leader']/div/div/div[2]/div/div[2]/div/div/a"));
        return element;
    }

}
