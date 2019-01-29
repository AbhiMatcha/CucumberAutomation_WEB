package Objects;

import Base.BaseUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Base.utils.*;
import static Objects.CourseDiscussion_repo.*;
import static Objects.CourseNotes_repo.*;
import static Objects.CourseOverview_repo.*;
import static Objects.payment_repo.*;
import static Objects.student_repo.confirmAlert;

public class TestSeries_repo extends BaseUtil
{
    public static String TestSeries_long_description ="Let your plans be dark and impenetrable as night, and when you move, fall like a thunderbolt.";
    public static String AnalyticsMessageBeforeBuy="No reports to show";
    public static WebElement TestSeries_test(){
        element = driver.findElement(By.id("28539"));
        return element;
    }

    public static WebElement TestSeries_Mathstest(){
        element = driver.findElement(By.id("35072"));
        return element;
    }

    public static WebElement Analytics_Message_Before_buy(){
        element = driver.findElement(By.className("lesson-content-title"));
        return element;
    }

    public static WebElement TestSeries_Maths_taketest(){
        element = driver.findElement(By.id("54869"));
        return element;
    }

    public static WebElement TestSeries_Chemistrytest(){
        element = driver.findElement(By.id("35073"));
        return element;
    }

    public static WebElement TestSeries_chemistry_taketest(){
        element = driver.findElement(By.id("54870"));
        return element;
    }

    public static WebElement TestSeries_Physicstest(){
        element = driver.findElement(By.id("38568"));
        return element;
    }

    public static WebElement TestSeries_Physics_taketest(){
        element = driver.findElement(By.id("54871"));
        return element;
    }

    public static WebElement MultipleChoice_GetQuestion(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }

    public static WebElement Analytics_tab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[3]/a"));
        return element;
    }

    public static WebElement Reviews_tab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[6]/a"));
        return element;
    }

    public static WebElement Analytics_selectTest(){
        element = driver.findElement(By.xpath("//*[@id='js-seriesAnalytics']/div/div/div[3]/div/div/a/img"));
        return element;
    }

    public static WebElement Analytics_TestTitle(){
        element = driver.findElement(By.className("section-dd-name"));
        return element;
    }

    public static WebElement yourReviewTab(){
        element = driver.findElement(By.id("writeReview"));
        return element;
    }


    public static WebElement Analytics_selectMathsTest(){
        element = driver.findElement(By.xpath("//*[@class='category-list-item']//*[@id='35072']"));
        return element;
    }

    public static WebElement Analytics_selectChemistryTest(){
        element = driver.findElement(By.xpath("//*[@class='category-list-item']//*[@id='35073']"));
        return element;
    }

    public static WebElement Analytics_selectPhysicsTest(){
        element = driver.findElement(By.xpath("//*[@class='category-list-item']//*[@id='38568']"));
        return element;
    }


    public static WebElement QuantitativeAbility(){
        element = driver.findElement(By.id("92427"));
        return element;
    }

    public static WebElement VerbalAbilityAndReadingComprehension(){
        element = driver.findElement(By.id("92425"));
        return element;
    }

    public static WebElement DataInterpretationAndLogicalReasoning(){
        element = driver.findElement(By.id("92426"));
        return element;
    }



    public static WebElement Analytics_TakeTest(){
        element = driver.findElement(By.className("js-analytics-take"));
        return element;
    }
    public static WebElement Analytics_viewResult(){
        element = driver.findElement(By.className("js-analytics-result"));
        return element;
    }


//    public static WebElement Review_starRating(){
//        element = driver.findElement(By.id(randomStarRating()));
//        return element;
//    }

    public static WebElement Review_starRating(){
        element = driver.findElement(By.id("star4half"));
        return element;
    }

    public static WebElement StarRating_region(){
        element = driver.findElement(By.className("js-userRate"));
        return element;
    }




    public static void TestSeries_discussion() throws Exception
    {
        discussionTab().click();
        Thread.sleep(3000);
        Assert.assertEquals(true, discussionAsk().isDisplayed());
        discussionAsk().click();
        Thread.sleep(3000);
        Assert.assertEquals(true, confirmAlert().isDisplayed());
        org.testng.Assert.assertEquals(true, cancelButton().isDisplayed());
        confirmAlert().click();
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(true, paySecurely().isDisplayed());
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

    public static void TestSeries_notes() throws Exception
    {
        org.testng.Assert.assertEquals(true, noteTab().isDisplayed());
        Thread.sleep(4000);
        noteTab().click();
        Thread.sleep(3000);
        noteCreateTab().click();
        Thread.sleep(3000);
        org.testng.Assert.assertEquals(true, noteBuyCoursePopUp().isDisplayed());
        org.testng.Assert.assertEquals(true, cancelButton().isDisplayed());
        noteBuyCoursePopUp().click();
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(true, paySecurely().isDisplayed());
        driver.navigate().back();
        Thread.sleep(3000);
    }

    public static void TestSeries_Reviews() throws Exception
    {
        org.testng.Assert.assertEquals(true, Reviews_tab().isDisplayed());
        Thread.sleep(4000);
        Reviews_tab().click();
        Thread.sleep(3000);
        yourReviewTab().click();
        Thread.sleep(3000);
        org.testng.Assert.assertEquals(true, confirmAlert().isDisplayed());
        org.testng.Assert.assertEquals(true, cancelButton().isDisplayed());
        confirmAlert().click();
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(true, paySecurely().isDisplayed());
        driver.navigate().back();
        Thread.sleep(3000);
    }

}
