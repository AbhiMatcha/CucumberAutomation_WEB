package Pages;

import Base.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Address extends utils
{
    @FindBy(id="learner-address1")
    private WebElement address1;

    @FindBy(id="learner-address")
    private WebElement address2;

    @FindBy(id="learner-city")
    private WebElement city;

    @FindBy(id="learner-pincode")
    private WebElement pincode;

    @FindBy(id="mobNumber")
    private WebElement mobileNumber;

    @FindBy(className="js-submit")
    private WebElement save;

    public WebElement Country(){
        element = driver.findElement(By.id("country-dd"));
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText("India");
        return element;
    }
    public  WebElement selectState(){
        element = driver.findElement(By.id("state-dd"));
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText(states());
        return element;
    }

    public  String states()
    {
        String selectAnswer[] = {"Andhra Pradesh","Pondicherry","Karnataka","Telangana"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }



}
