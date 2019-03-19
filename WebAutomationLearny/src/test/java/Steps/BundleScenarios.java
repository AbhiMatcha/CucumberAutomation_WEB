package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Base.utils.*;
import static Objects.bundle_repo.*;

public class BundleScenarios {
    @And("^user able to select course 'Verify_CourseVideo_Test'$")
    public void userAbleToSelectCourseVerifyCourseVideoTest() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Verify_CourseVideo_Test().click();
    }

    @And("^user able to select video Lesson in syllabus section$")
    public void userAbleToSelectVideoLessonInSyllabusSection() throws InterruptedException {
        Thread.sleep(AddLongDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, video_Lesson().isDisplayed());
        video_Lesson().click();
    }

    @Then("^user able to play the video$")
    public void userAbleToPlayTheVideo() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        playVidoeButton().click();
        Thread.sleep(AddShortDelay);
    }

    @Then("^user able to select first lesson under syllabus tab$")
    public void userAbleToSelectFirstLessonUnderSyllabusTab() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select_first_lesson().click();
    }

    @And("^user able to select pdf Lesson in syllabus section$")
    public void userAbleToSelectPdfLessonInSyllabusSection() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, pdf_Lesson().isDisplayed());
        pdf_Lesson().click();
    }

    @And("^switch frame to access pdf lesson$")
    public void switchFrameToAccessPdfLesson() {
        driver.switchTo().frame(0);
    }

    @Then("^user able to click zoom in option$")
    public void userAbleToClickZoomInOption() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, PDF_zoomIn().isDisplayed());
        PDF_zoomIn().click();
        Thread.sleep(AddShortDelay);

    }

    @Then("^user able to click zoom out option$")
    public void userAbleToClickZoomOutOption() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, PDF_zoomOut().isDisplayed());
        PDF_zoomOut().click();
    }

    @Then("^user able to click bookmark option$")
    public void userAbleToClickBookmarkOption() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true, PDF_bookMark().isDisplayed());
        PDF_bookMark().click();
    }

    @Then("^user able to click toggle option$")
    public void userAbleToClickToggleOption() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, PDF_toggle().isDisplayed());
        PDF_toggle().click();
    }

    @Then("^user able to click thumbnail option$")
    public void userAbleToClickThumbnailOption() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, PDF_thumbNail().isDisplayed());
        PDF_thumbNail().click();
    }

    @Then("^user able to see total pages$")
    public void userAbleToSeeTotalPages() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, PDF_totalPages().isDisplayed());
        PDF_totalPages().click();
    }

    @Then("^user able to click find option$")
    public void userAbleToClickFindOption() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, PDF_Find().isDisplayed());
        PDF_Find().click();
    }

    @And("^user able to select slide Lesson in syllabus section$")
    public void userAbleToSelectSlideLessonInSyllabusSection() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, slide_Lesson().isDisplayed());
        slide_Lesson().click();
    }

    @Then("^user able to select previous slide button$")
    public void userAbleToSelectPreviousSlideButton() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true, previous_slide().isDisplayed());
        previous_slide().click();
    }

    @Then("^user able to select next slide button$")
    public void userAbleToSelectNextSlideButton() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true, next_slide().isDisplayed());
        next_slide().click();
    }

    @Then("^user able to select first slide button$")
    public void userAbleToSelectFirstSlideButton() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true, first_slide().isDisplayed());
        first_slide().click();
    }

    @Then("^user able to select last slide button$")
    public void userAbleToSelectLastSlideButton() {
        Assert.assertEquals(true, Last_slide().isDisplayed());
        Last_slide().click();
    }

    @And("^user able to select mark as complete option$")
    public void userAbleToSelectMarkAsCompleteOption() throws InterruptedException {

        Assert.assertEquals(true, YesMarkAsComplete().isDisplayed());
        YesMarkAsComplete().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to select previous button$")
    public void userAbleToSelectPreviousButton() throws InterruptedException {
        previous_button().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to select next button$")
    public void userAbleToSelectNextButton() {
        next_button().click();
    }

    @Then("^user able to see mark as complete and revise options$")
    public void userAbleToSeeMarkAsCompleteAndReviseOptions() throws InterruptedException {
        Thread.sleep(AddLongDelay);
        Assert.assertEquals(true, revise().isDisplayed());
        Assert.assertEquals(true, YesMarkAsComplete().isDisplayed());
    }

    @Then("^user able to move to next lesson on selecting mark as complete$")
    public void userAbleToMoveToNextLessonOnSelectingMarkAsComplete() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true, playVidoeButton().isDisplayed());
    }

    @Then("^user able to select second lesson under syllabus tab$")
    public void userAbleToSelectSecondLessonUnderSyllabusTab() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Select_second_lesson().click();

    }

    @And("^user able to select test Lesson in syllabus section$")
    public void userAbleToSelectTestLessonInSyllabusSection() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true, Bundle_cat_test_Lesson().isDisplayed());
        Bundle_cat_test_Lesson().click();
        Thread.sleep(AddShortDelay);
    }

    @Then("^user able to select option to change speed$")
    public void userAbleToSelectOptionToChangeSpeed() throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToElement(select_PlaySpeed_video()).perform();
    }


    @Then("^user able to change the speed of the video$")
    public void userAbleToChangeTheSpeedOfTheVideo() throws InterruptedException {
        select_random_PlaySpeed_video().click();
        Thread.sleep(AddLongDelay);
    }

    @Then("^user able to send report through lesson player$")
    public void userAbleToSendReportThroughLessonPlayer() throws InterruptedException {
        send_Logs_Video().click();
        Thread.sleep(AddShortDelay);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        confirm_send_Logs_Video().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to see video in full screen view$")
    public void userAbleToSeeVideoInFullScreenView() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        fullScreen().click();
    }

    @And("^user able to see the remaining time of the video$")
    public void userAbleToSeeTheRemainingTimeOfTheVideo() throws InterruptedException {

        Thread.sleep(AddLongDelay);
        String getInitialTIme = remainingTime().getText();
        Thread.sleep(AddShortDelay);
        System.out.println("getInitialTIme = "+getInitialTIme);

        String[] initialTime = getInitialTIme.split("\n" +
                "");
        Thread.sleep(AddShortDelay);
        System.out.println("initialTime.length = "+initialTime.length);

        System.out.println("initialTime[initialTime.length] = "+initialTime[1]);
        String StoreStartedTime=initialTime[1];
        Thread.sleep(AddShortDelay);
        String[] startedTime=StoreStartedTime.split("-");
        System.out.println("startedTime.length = "+startedTime.length);
        System.out.println("startedTime[startedTime.length-1] = "+startedTime[1]);
//        int StartTime=Integer.valueOf(startedTime[1]);
//        System.out.println(StartTime);
//        Thread.sleep(10000);
//        System.out.println("storeInitialTime " + storeInitialTime);
//        System.out.println("***************");
//        String getafterTime = remainingTime().getText();
//        System.out.println("getafterTime " + getafterTime);
//        System.out.println("***************");
//        String[] getafter = getafterTime.split("\n" +
//                "");
//        System.out.println("getafter " + getafter);
//        System.out.println("***************");
//        String timeafteruserwatched = getafter[1];
//        System.out.println("timeafteruserwatched " + timeafteruserwatched);
//        System.out.println("***************");
//        int result = Integer.valueOf(storeInitialTime) - Integer.valueOf(timeafteruserwatched);
//        System.out.println("result " + result);
//        System.out.println("***************");
//        String finalTime = remainingTime().getText();
//        System.out.println("finalTime " + finalTime);
//        System.out.println("***************");
//        String[] storeFinalTime = finalTime.split("\n" +
//                "");
//        System.out.println("storeFinalTime " + storeFinalTime);
//        System.out.println("***************");
//        int finalTimeVideo = Integer.valueOf(storeFinalTime[1]);
//        System.out.println("finalTimeVideo " + finalTimeVideo);
//        System.out.println("***************");
//        System.out.println(result == finalTimeVideo);
//        Thread.sleep(AddLongDelay);
    }

    @Then("^user able to change the quality of the video$")
    public void userAbleToChangeTheQualityOfTheVideo() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select_random_Quality_video().click();
        Thread.sleep(AddLongDelay);
    }

    @Then("^user able to select option to change quality$")
    public void userAbleToSelectOptionToChangeQuality() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Actions action = new Actions(driver);
        action.moveToElement(select_Quality_video()).perform();
        select_Quality_video().click();
        Thread.sleep(AddShortDelay);
    }

    @Then("^user able to play video in between$")
    public void userAbleToPlayVideoInBetween() {
    }
}
