package Objects;
import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import java.util.Random;

import static Base.utils.*;

public class quizRepo extends BaseUtil
{
    /*########################### Quiz Templates components ###############################*/

    /* General quiz */


    public static WebElement fillInTheBlankAnswerInput(){
        element = driver.findElement(By.id("answer"));
        return element;
    }
    public static WebElement FeedbackInput(){
        element = driver.findElement(By.id("subjectiveAns"));
        return element;
    }
    public static WebElement finalSubmit(){
        element = driver.findElement(By.xpath("//*[@id='learnyContent']/div/div[1]/div[1]/div/div/div/div[1]/div[2]/div/button[1]"));
        return element;
    }
    /* UPSC paper 1*/

    public static WebElement UPSC1Quiz(){
        element = driver.findElement(By.id("24410"));
        return element;
    }
    public static WebElement UPSC1QuizQues1(){
        element = driver.findElement(By.xpath("//*[@for='"+ UPSC1QuizQues1Answer()+"']"));
        return element;
    }
    public static String UPSC1QuizQues1Answer()
    {
        String selectAnswer[] = { "shipadd5968973","shipadd5968974","shipadd5968975","shipadd5968976"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String UPSC1QuizQues2Answer()
    {
        String selectAnswer[] = { "100","50","70","30"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String UPSC1QuizQues3Answer()
    {
        String selectAnswer[] = { "India","USA","Canada","Singapore"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    /* CAT Quiz */


    public static WebElement CATQuizQues1(){
        element = driver.findElement(By.xpath("//*[@for='"+ CATQuizQues1Answer()+"']"));
        return element;
    }
    public static String CATQuizQues1Answer() {
        String selectAnswer[] = {"shipadd5969028", "shipadd5969029", "shipadd5969030", "shipadd5969031"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static WebElement CATQuizQues2(){
        element = driver.findElement(By.xpath("//*[@for='"+ CATQuizQues2Answer()+"']"));
        return element;
    }
    public static String CATQuizQues2Answer() {
        String selectAnswer[] = {"shipadd5969045", "shipadd5969046", "shipadd5969047", "shipadd5969048"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    public static WebElement CATQuizQues3(){
        element = driver.findElement(By.xpath("//*[@for='"+ CATQuizQues3Answer()+"']"));
        return element;
    }
    public static String CATQuizQues3Answer() {
        String selectAnswer[] = {"shipadd5969053", "shipadd5969054", "shipadd5969055", "shipadd5969056"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    public static WebElement CATQuizQues4(){
        element = driver.findElement(By.xpath("//*[@for='"+ CATQuizQues4Answer()+"']"));
        return element;
    }
    public static String CATQuizQues4Answer() {
        String selectAnswer[] = {"shipadd5969070", "shipadd5969071", "shipadd5969072", "shipadd5969073"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    /* UPSC Paper 2*/

    public static WebElement UPSC2Quiz(){
        element = driver.findElement(By.id("24411"));
        return element;
    }
    public static WebElement UPSC2QuizQues1(){
        element = driver.findElement(By.xpath("//*[@for='"+ UPSC2QuizQues1Answer()+"']"));
        return element;
    }
    public static String UPSC2QuizQues1Answer()
    {
        String selectAnswer[] = { "shipadd5968965","shipadd5968966","shipadd5968967","shipadd5968968"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String UPSC2QuizQues2Answer()
    {
        String selectAnswer[] = { "2","3","1","0"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String UPSC2QuizQues3Answer()
    {
        String selectAnswer[] = { "4","6","2","1"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    /*
    Practise Quiz */

    public static WebElement PractiseQuiz(){
        element = driver.findElement(By.id("24407"));
        return element;
    }
    public static String practiseQuizQues1Answer()
    {
        String selectAnswer[] = { "Alpha","java_automation","Beta","gama"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static WebElement practiseQuizQues2(){
        element = driver.findElement(By.xpath("//*[@for='"+ practiseQuizQues2Answer()+"']"));
        return element;
    }
    public static String practiseQuizQues2Answer()
    {
        String selectAnswer[] = { "shipadd5995409","shipadd5995410","shipadd5995411","shipadd5995412"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String practiseQuizQues3Answer()
    {
        String selectAnswer[] = { "54","63","36","54"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    /* CSAT Quiz */

    public static WebElement CSATquiz(){
        element = driver.findElement(By.id("24525"));
        return element;
    }
    public static WebElement CSATquizQues1(){
        element = driver.findElement(By.xpath("//*[@for='"+ CSATquizQues1Answer()+"']"));
        return element;
    }
    public static String CSATquizQues1Answer()
    {
        String selectAnswer[] = { "shipadd6003793","shipadd6003794","shipadd6003795","shipadd6003796"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String CSATquizQues2Answer()
    {
        String selectAnswer[] = { "3","4","1","5"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String CSATquizQues3Answer()
    {
        String selectAnswer[] = { "100 %","100%","20","100"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String CSATquizQues4Answer()
    {
        String selectAnswer[] = { "BABA","Pinky","Abhishek","abhay"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String CSATquizQues5Answer()
    {
        String selectAnswer[] = { "This is my feedback","I wont give","please go","why u need ?"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static WebElement exitFromTest(){
        element = driver.findElement(By.id("exitFromTest"));
        return element;
    }
    public static WebElement backButton(){
        element = driver.findElement(By.className("lr-nav-title"));
        return element;
    }

    /* IIT jee Main Paper 1 */



    /* IIT jee ADV Quiz */

    public static WebElement IITjeeADVQuiz(){
        element = driver.findElement(By.id("24730"));
        return element;
    }

    public static WebElement IITjeeAdvMultiplechoice_Ans(){
        element = driver.findElement(By.xpath(MultipleChoice_RandomAnswers()));
        return element;
    }

    /* SSC-CGL Tier 1 quiz */

    public static WebElement SSCcglTier1quiz(){
        element = driver.findElement(By.id("24733"));
        return element;
    }
    public static WebElement SSCcglTier1quizQues1(){
        element = driver.findElement(By.xpath("//*[@for='"+SSCcglTier1quizQues1Answer()+"']"));
        return element;
    }
    public static String SSCcglTier1quizQues1Answer()
    {
        String selectAnswer[] = { "shipadd6065685","shipadd6065686","shipadd6065687","shipadd6065688"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static WebElement SSCcglTier1quizQues2(){
        element = driver.findElement(By.xpath("//*[@for='"+SSCcglTier1quizQues2Answer()+"']"));
        return element;
    }
    public static String SSCcglTier1quizQues2Answer()
    {
        String selectAnswer[] = { "shipadd6065708","shipadd6065709","shipadd6065710","shipadd6065711"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    public static WebElement SSCcglTier1quizQues3(){
        element = driver.findElement(By.xpath("//*[@for='"+SSCcglTier1quizQues3Answer()+"']"));
        return element;
    }
    public static String SSCcglTier1quizQues3Answer()
    {
        String selectAnswer[] = { "shipadd6065747","shipadd6065748","shipadd6065749","shipadd6065750"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    /* SSC CGL tier 1 */

    public static WebElement cancelButton(){
        element=driver.findElement(By.className("swal2-cancel"));
        return element;
    }
    public static WebElement markForReview(){
        element=driver.findElement(By.className("Test_markedBtn"));
        return element;
    }
    public static WebElement quantitativeAbilitiesSection(){
        element=driver.findElement(By.id("71672"));
        return element;
    }
    public static WebElement SSCcglTier2quiz(){
        element = driver.findElement(By.id("24735"));
        return element;
    }
    public static WebElement SSCcglTier2quizQues1(){
        element = driver.findElement(By.xpath("//*[@for='"+SSCcglTier2quizQues1Answer()+"']"));
        return element;
    }
    public static String SSCcglTier2quizQues1Answer()
    {
        String selectAnswer[] = { "shipadd6066497","shipadd6066498","shipadd6066499","shipadd6066500"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String SSCcglTier2quizQues2Answer()
    {
        String selectAnswer[] = { "34","48","23","14"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    /*########################### Quiz Templates components ###############################*/
}
