package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class Redactor_repo extends BaseUtil
{
    public static WebElement select_bold(){
        element = driver.findElement(By.className("re-icon-bold"));
        return element;
    }

    public static WebElement select_italic(){
        element = driver.findElement(By.className("re-italic"));
        return element;
    }

    public static WebElement select_underline(){
        element = driver.findElement(By.className("re-underline"));
        return element;
    }

    public static WebElement select_lists(){
        element = driver.findElement(By.className("re-lists"));
        return element;
    }

    public static WebElement select_unorderedlist(){
        element = driver.findElement(By.className("redactor-dropdown-item-unorderedlist"));
        return element;
    }

    public static WebElement select_orderedlist(){
        element = driver.findElement(By.className("redactor-dropdown-item-orderedlist"));
        return element;
    }

    public static WebElement select_outdent(){
        element = driver.findElement(By.className("redactor-dropdown-item-outdent"));
        return element;
    }
    public static WebElement select_indent(){
        element = driver.findElement(By.className("redactor-dropdown-item-indent"));
        return element;
    }

    public static WebElement select_link(){
        element = driver.findElement(By.className("re-link"));
        return element;
    }

    public static WebElement select_insertLink(){
        element = driver.findElement(By.className("redactor-dropdown-item-link"));
        return element;
    }

    public static WebElement select_URLlink(){
        element = driver.findElement(By.id("modal-link-url"));
        return element;
    }

    public static WebElement select_TextLink(){
        element = driver.findElement(By.id("modal-link-text"));
        return element;
    }

    public static WebElement select_unLink(){
        element = driver.findElement(By.className("redactor-dropdown-item-unlink"));
        return element;
    }

    public static WebElement select_insertConfirm(){
        element = driver.findElement(By.xpath("//*[@id='redactor-modal']/div/div[3]/button[1]"));
        return element;
    }

    public static WebElement select_insertCancel(){
        element = driver.findElement(By.xpath("//*[@id='redactor-modal']/div/div[3]/button[2]"));
        return element;
    }

    public static WebElement select_mathEquation(){
        element = driver.findElement(By.xpath("//*[@id='toolbar']/div/a[6]/span"));
        return element;
    }

    public static WebElement select_preview(){
        element = driver.findElement(By.id("js-show-preview"));
        return element;
    }

    public static WebElement select_closePreview(){
        element = driver.findElement(By.id("js-hide-preview"));
        return element;
    }

    public static WebElement select_uploadFile() {
        element = driver.findElement(By.id("js-upload_file_discussion"));
        return element;
    }

}
