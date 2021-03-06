package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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



    public static WebElement Verify_videoPDFslides_lesson(){
        element = driver.findElement(By.xpath("//*[@id='39801']"));
        return element;
    }

    public static WebElement verify_Test_lesson(){
        element = driver.findElement(By.xpath("//*[@id='39802']"));
        return element;
    }


    public static WebElement video_lesson(){
        element = driver.findElement(By.xpath("//*[contains(text(),'When to start taking Mock CATs?')]"));
        return element;
    }

    public static WebElement Pdf_lesson(){
        element = driver.findElement(By.xpath("//*[contains(text(),'PDF lesson 2')]"));
        return element;
    }

    public static WebElement slides_lesson(){
        element = driver.findElement(By.xpath("//*[contains(text(),'Slides lesson 3')]"));
        return element;
    }

    public static WebElement test_lesson(){
        element = driver.findElement(By.xpath("//h4[contains(text(),'Mock CAT Paper 1')]"));
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
    public static WebElement ok_button(){
        element = driver.findElement(By.id("primaryAction"));
        return element;
    }

    public static WebElement haha(){
        element = driver.findElement(By.xpath("//*[@id='lstSliderPlayer-0ETEPP2_Youtube_api']"));
        return element;
    }

    public static WebElement play_button(){
        element = driver.findElement(By.xpath("//*[@aria-label='Play']"));
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
        element = driver.findElement(By.xpath("//*[@id='zoomIn']"));
        return element;
    }

    public static WebElement PDF_zoomOut(){
            element = driver.findElement(By.xpath("//*[@id='zoomOut']"));
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

}
