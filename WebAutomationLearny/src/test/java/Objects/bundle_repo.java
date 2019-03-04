package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Base.utils.video_quality;
import static Base.utils.video_speed;

public class bundle_repo extends BaseUtil
{

    public static WebElement Verify_Bundle(){
        element = driver.findElement(By.id("31011"));
        return element;
    }

    public static WebElement coursesTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[2]/a"));
        return element;
    }

    public static WebElement Verify_CourseVideo_Test(){
        element = driver.findElement(By.id("31009"));
        return element;
    }

    public static WebElement Select_first_lesson()
    {
        element=driver.findElement(By.xpath("//*[@id='39801']/h3"));
        return  element;
    }

    public static WebElement Select_second_lesson()
    {
        element=driver.findElement(By.xpath("//*[@id='39802']/h3"));
        return  element;
    }

    public static WebElement video_Lesson(){
        element = driver.findElement(By.xpath("//*[contains(text(),'Video lesson 4')]"));
        return element;
    }

    public static WebElement Bundle_cat_test_Lesson(){
        element = driver.findElement(By.xpath("//*[contains(text(),'Mock CAT Paper 1')]"));
        return element;
    }

    public static WebElement slide_Lesson(){
        element = driver.findElement(By.xpath("//*[contains(text(),'Slides lesson 3')]"));
        return element;
    }

    public static WebElement pdf_Lesson(){
        element = driver.findElement(By.xpath("//*[contains(text(),'PDF lesson 2')]"));
        return element;
    }

    public static WebElement select_PlaySpeed_video(){
        element = driver.findElement(By.xpath("//*[@title='Playback Rate']"));
        return element;
    }

    public static WebElement select_Quality_video(){
        element = driver.findElement(By.className("vjs-icon-cog"));
        return element;
    }

    public static WebElement select_random_PlaySpeed_video(){
        element = driver.findElement(By.xpath("//*[@class='vjs-menu-item' and contains(text(),'"+video_speed()+"')]"));
        return element;
    }

    public static WebElement select_random_Quality_video(){
        element = driver.findElement(By.className("vjs-menu-item    "));
        System.out.println(element);
        return element;
    }

    public static WebElement playVidoeButton(){
        element = driver.findElement(By.className("vjs-big-play-button"));
        return element;
    }

    public static WebElement send_Logs_Video(){
        element = driver.findElement(By.id("js-send-logs"));
        return element;
    }

    public static WebElement confirm_send_Logs_Video(){
        element = driver.findElement(By.id("js-conform-send-logs"));
        return element;
    }

    public static WebElement previous_button(){
        element = driver.findElement(By.id("previousLesson"));
        return element;
    }

    public static WebElement next_button(){
        element = driver.findElement(By.id("nextLesson"));
        return element;
    }

    public static WebElement first_slide(){
        element = driver.findElement(By.id("FirstSlide"));
        return element;
    }
    public static WebElement Last_slide(){
        element = driver.findElement(By.id("LastSlide"));
        return element;
    }
    public static WebElement previous_slide(){
        element = driver.findElement(By.id("PrevSlide"));
        return element;
    }
    public static WebElement next_slide(){
        element = driver.findElement(By.xpath("//*[@id='NextSlide']"));
        return element;
    }
    public static WebElement fullScreen(){
        element = driver.findElement(By.id("fullScreenId"));
        return element;
    }

    public static WebElement videoPlayer(){
        element = driver.findElement(By.xpath("//*[@aria-label='Play']"));
        return element;
    }

    public static WebElement PDF_zoomIn(){
        element = driver.findElement(By.id("zoomIn"));
        return element;
    }

    public static WebElement PDF_zoomOut(){
            element = driver.findElement(By.id("zoomOut"));
        return element;
    }

    public static WebElement PDF_bookMark(){
        element = driver.findElement(By.id("viewBookmark"));
        return element;
    }
    public static WebElement PDF_toggle() {
        element = driver.findElement(By.id("sidebarToggle"));
        return element;
    }
    public static WebElement PDF_thumbNail(){
        element = driver.findElement(By.id("viewThumbnail"));
        return element;
    }

    public static WebElement PDF_totalPages(){
        element = driver.findElement(By.className("thumbnailSelectionRing"));
        return element;
    }

    public static WebElement PDF_Page(int i){
        element = driver.findElement(By.id("thumbnail"+i+""));
        return element;
    }

    public static WebElement PDF_Find(){
        element = driver.findElement(By.id("viewFind"));
        return element;
    }

    public static WebElement YesMarkAsComplete(){
        element = driver.findElement(By.id("primaryAction"));
        return element;
    }

    public static WebElement revise(){
        element = driver.findElement(By.id("secondaryAction"));
        return element;
    }

    public static WebElement remainingTime(){
        element = driver.findElement(By.className("vjs-remaining-time-display"));
        return element;
    }



}
