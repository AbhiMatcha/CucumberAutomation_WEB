package Objects;


import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class CourseSyllabus_repo extends BaseUtil
{
    public static WebElement syllabusCourseTitle(){
        element = driver.findElement(By.className("syllabus-section-title"));
        return element;
    }

    public static WebElement courseDiscountPrice(){
        element = driver.findElement(By.className("course-price-val"));
        return element;
    }

    public static WebElement courseActualPrice(){
        element = driver.findElement(By.className("course-orig-amnt"));
        return element;
    }


    public static WebElement syllabusLessonTitle(){
        element = driver.findElement(By.className("syllabus-lesson-title"));
        return element;
    }

    public static WebElement Syllabus_completeStatus(){
        element = driver.findElement(By.className("lesson-count"));
        return element;
    }

}
