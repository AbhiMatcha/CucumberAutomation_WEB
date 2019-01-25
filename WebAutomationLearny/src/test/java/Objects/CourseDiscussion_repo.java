package Objects;


import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class CourseDiscussion_repo extends BaseUtil
{
    public static String DiscussionQuestion_input ="This is discussion for testing";
    public static String DiscussionReply_input ="This is reply in discussion for testing";
//    public static String uplaodImageDIscussion="/UploadImages/good-morning-baby-images.jpg";
    public static WebElement discussionBuyCoursePopUp(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

    public static WebElement discussionAsk(){
        element = driver.findElement(By.id("askQ"));
        return element;
    }

    public static WebElement enterInput(){
        element = driver.findElement(By.id("postQuestionInput"));
        return element;
    }

    public static WebElement postInput(){
        element = driver.findElement(By.id("addPostQuestion"));
        return element;
    }

    public static WebElement cancelInput(){
        element = driver.findElement(By.xpath("//*[@id='discussionEditor']/div/div/div[3]/div/div[2]/button[1]"));
        return element;
    }

    public static WebElement discussionReplyAsk(){
        element = driver.findElement(By.className("replyClass"));
        return element;
    }

    public static WebElement discussionEditInput(){
        element = driver.findElement(By.className("editNote"));
        return element;
    }

    public static WebElement discussionDeleteAsk(){
        element = driver.findElement(By.className("js-removeDs"));
        return element;
    }

    public static WebElement viewReplies() {
        element = driver.findElement(By.className("js-replyOpen"));
        return element;
    }

    public static WebElement viewFirstQuestion() {
        element = driver.findElement(By.xpath("//*[@class='card lr-card-discussion'][1] //*[@class='ds-question'][1]"));
        return element;
    }

}
