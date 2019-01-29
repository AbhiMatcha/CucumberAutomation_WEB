package Objects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Base.utils.*;
import static Objects.homeScreen_repo.*;

public class support_repo extends BaseUtil
{
    public static WebElement supportTicket_title() {
        element = driver.findElement(By.id("title"));
        return element;
    }

    public static WebElement supportTicket_description() {
        element = driver.findElement(By.id("long_description"));
        return element;
    }

    public static WebElement supportTicket_checkBox() {
        element = driver.findElement(By.id("viewedhelp"));
        return element;
    }

    public static WebElement supportTicket_submit() {
        element = driver.findElement(By.id("submit-ticket"));
        return element;
    }

    public static WebElement supportTicket_confirmSubmit() {
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

    public static void raiseSupportTicket() throws InterruptedException
    {
        support_button().click();
        Thread.sleep(5000);
        supportTicket_title().click();
        supportTicket_title().sendKeys(ticket_Title);
        Thread.sleep(5000);
        supportTicket_description().click();
        supportTicket_description().sendKeys(ticket_Description);
        Thread.sleep(5000);
        supportTicket_checkBox().click();
        Thread.sleep(5000);
        supportTicket_submit().click();
        Thread.sleep(5000);
        supportTicket_confirmSubmit().click();
        Thread.sleep(4000);
    }

}

