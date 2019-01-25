package Objects;


import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CourseNotes_repo extends BaseUtil

{
    public static String NotestQuestion_input="This is notes for testing";
    public static WebElement noteEditInput()
    {
        element = driver.findElement(By.className("js-editNote"));
        return element;
    }

    public static WebElement noteBuyCoursePopUp(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

    public static WebElement noteCreateTab(){
        element = driver.findElement(By.id("createNote"));
        return element;
    }
    
    public static WebElement noteDeleteAsk(){
        element = driver.findElement(By.className("js-removeNote"));
        return element;
    }

    public static WebElement deleteConfirm(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

}
