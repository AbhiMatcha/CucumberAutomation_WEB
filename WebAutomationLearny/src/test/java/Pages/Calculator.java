package Pages;

import Base.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calculator extends utils
{
    @FindBy(id = "js-show-calc")
    private WebElement calculator;

    @FindBy(id = "keyPad_btn1")
    private WebElement value1;

    @FindBy(xpath = "//*[@id=\'keyPad_btnMult\']/div")
    private WebElement multiplication;

    @FindBy(xpath = "//*[@id=\'keyPad_btnEnter\']/div")
    private WebElement Equals;

    @FindBy(id = "closeButton")
    private WebElement closeCalculator;

}
