package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Base.utils.*;

public class GST_MockTest_repo extends BaseUtil
{
    public static WebElement GST_mockTest(){
        element = driver.findElement(By.id("15331"));
        return element;
    }
}
