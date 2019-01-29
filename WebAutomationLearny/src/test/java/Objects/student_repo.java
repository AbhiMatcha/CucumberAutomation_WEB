package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class student_repo extends BaseUtil
{
    public static WebElement confirmAlert(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

    public static WebElement skipLogin(){
        element = driver.findElement(By.className("js-skipLogin"));
        return element;
    }

    /* yop mail components */

    public static WebElement enterYopmail(){
        element = driver.findElement(By.id("login"));
        return element;
    }
    public static WebElement checkYopmailInbox(){
        element = driver.findElement(By.className("sbut"));
        return element;
    }
//    public static WebElement inboxMessage(){
//        element = driver.findElement(By.xpath("//*[@id='m2']/div/a/span[1]"));
//        return element;
//    }

    public static WebElement ActivateInInbox(){
        element = driver.findElement(By.xpath("//*[@id='mailmillieu']/div[2]/table/tbody/tr[2]/td/table/tbody/tr[3]/td/a"));
        return element;
    }
//    @FindBy(xpath = "//*[contains(text(), 'ACTIVATE ACCOUNT')]")
//	public static WebElement ActivateInInbox;

    /* yop mail components */

    /* ############################## Courses components ##############################*/

    public static WebElement fillInTheBlank_Course(){
        element = driver.findElement(By.id("22755"));
        return element;
    }

    /**
     * created course which have
     *  option to download certificate
     * on calling this Course_verifyCertificate()
     * we are clicking the course
     * but not getting the certificate
     */





    /* ############################## Courses components ##############################*/
    /* ------------------------------------------------------------------------------------------ */
    /*############################## tabs in course Notes & Discussion components ###############################*/
















    /*############################## tabs in course Notes & Discussion components ###############################*/
    /* ---------------------------------------------------------------------------------------------------------- */
    /* ################################## Answers for the tests #################################### */

    public static WebElement fillInTheBlankAnswerInput(){
        element = driver.findElement(By.id("answer"));
        return element;
    }





    /* ############################## Answers for the tests ############################### */
    /* ------------------------------------------------------------------------------------ */
    /*########################### Test components and payment###############################*/



















    public static WebElement certificate_page(){
        element = driver.findElement(By.xpath("//*[@id='plugin']"));
        return element;
    }

    /*########################### Test components and payment###############################*/

    public static WebElement finalAmount(){
        element = driver.findElement(By.xpath("//*[@id='js-scoreReportList']/tr[5]/td[2]/span"));
        return element;
    }

}
