package Pages;

import Base.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Autosave extends utils
{
    @FindBy(id = "restoreAns")
    private WebElement restoreAnswers;

    @FindBy(id = "clearAnswers")
    private WebElement clearAnswers;



}
