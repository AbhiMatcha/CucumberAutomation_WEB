package Objects;


import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class CourseCertificate_repo extends BaseUtil {
    public static String ErrorMessageTodownloadCert = "Please enrol or purchase the course to earn your certificate!";
    public static String FailMessageTodownloadCert = "Pass in all tests to earn your certificate!";
    public static String SucessMessageTodownloadCert = "You've passed all the tests! Well done!";
    public static String statusBeforeTakingTest = "Not yet taken";
    public static String statusAfterPassingTest = "PASS";
    public static String statusAfterFailingTest = "FAIL";

    public static WebElement Course_verifyCertificate() {
        element = driver.findElement(By.id("22663"));
        return element;
    }

    public static WebElement TakeTestThroughCertificateTab() {
        element = driver.findElement(By.xpath("//*[@id='certificateTestLists']/li/div/a/div[1]"));
        return element;
    }

    public static WebElement Course_viewResult() {
        element = driver.findElement(By.xpath("//*[@id='js-firstAttempt-score']/div/div/div[2]/button[1]"));
        return element;
    }

    public static WebElement Course_retakeCount() {
        element = driver.findElement(By.id("js-retakeCount"));
        return element;
    }


    public static WebElement CertificateTestName() {
        element = driver.findElement(By.xpath("//*[@id='certificateTestLists']/li/div/a/div[1]"));
        return element;
    }

    public static WebElement CertificateTestQualifyMarks() {
        element = driver.findElement(By.xpath("//*[@id='certificateTestLists']/li/div/a/div[2]"));
        return element;
    }

    public static WebElement CertificateTestStatus() {
        element = driver.findElement(By.xpath("//*[@id='certificateTestLists']/li/div/a/div[4]"));
        return element;
    }

    public static WebElement certificateBuyCoursePopUp() {
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

    public static WebElement certificateTestLists() {
        element = driver.findElement(By.id("certificateTestLists"));
        return element;
    }

    public static WebElement getCertificateTest_Answer1() {
        element = driver.findElement(By.xpath(getCertificateTest_randomAnswer1()));
        return element;
    }

    public static WebElement getCertificateTest_Answer2() {
        element = driver.findElement(By.xpath(getCertificateTest_randomAnswer2()));
        return element;
    }

    public static WebElement errorMessage_forDownload() {
        element = driver.findElement(By.className("redMsg"));
        return element;
    }

    public static WebElement TestMessage_forDownload() {
        element = driver.findElement(By.className("greenMsg"));
        return element;
    }

    public static WebElement downloadCertificate_button() {
        element = driver.findElement(By.id("certificateBtn"));
        return element;
    }


    public static String getCertificateTest_randomAnswer1() {    //correct answer option 2
        String option1 = "//*[@id='optionsTpl']/div/div/div/div/ul/li[1]/label/div[1]/label";
        String option2 = "//*[@id='optionsTpl']/div/div/div/div/ul/li[2]/label/div[1]/label";
        String option3 = "//*[@id='optionsTpl']/div/div/div/div/ul/li[3]/label/div[1]/label";
        String option4 = "//*[@id='optionsTpl']/div/div/div/div/ul/li[4]/label/div[1]/label";
//    	String selectAnswer[] = {option1,option2,option3,option4};
        String selectAnswer[] = {option2};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    public static String getCertificateTest_randomAnswer2() {    //correct answer option 4
        String option1 = "//*[@id='optionsTpl']/div/div/div/div/ul/li[1]/label/div[1]/label";
        String option2 = "//*[@id='optionsTpl']/div/div/div/div/ul/li[2]/label/div[1]/label";
        String option3 = "//*[@id='optionsTpl']/div/div/div/div/ul/li[3]/label/div[1]/label";
        String option4 = "//*[@id='optionsTpl']/div/div/div/div/ul/li[4]/label/div[1]/label";
//    	String selectAnswer[] = {option1,option2,option3,option4};
        String selectAnswer[] = {option4};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

}
