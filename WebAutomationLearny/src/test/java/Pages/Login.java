package Pages;

import Base.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends utils
{

    @FindBy(id = "lernystLogin_new_user_user_email")
    private WebElement login_email;

    @FindBy(id = "lernystLogin_new_user_user_password")
    private WebElement login_password;

    @FindBy(className = "learnyst-btn-temporary")
    private WebElement login_button;

    @FindBy(className = "learnyst-forgot-pwd")
    private WebElement forgot_PasswordButton;

    @FindBy(xpath = "//*[@id='js-signin-form']/div/div/div/p/a")
    private WebElement signup_button;

//    @FindBy(xpath = "//*[@id='js-signin-form']/div/div/div/p/a")
//    private WebElement faceBook_button;
//
//    @FindBy(xpath = "//*[@id='js-signin-form']/div/div/div/p/a")
//    private WebElement google_button;

    @FindBy(id = "swal2-content")
    private WebElement pop_up;

//    @FindBy(id = "swal2-content")
//    private WebElement skipLogin_button;

    public void login(String username, String password)
    {
        login_email.sendKeys(username);
        login_password.sendKeys(password);
        login_button.click();
    }
    public void Invalidlogin(String username, String password)
    {
        login_email.sendKeys(username);
        login_password.sendKeys(password);
        login_button.click();
    }
    public void errorMessages(String errorMessage)
    {

        pop_up.getText().equals(errorMessage);
    }


}

























































//
//    public void login(String mail, String password) {
//        login_email.sendKeys(mail);
//        login_password.sendKeys(password);
//        login_button.click();
//    }
//
//    public void Invalidlogin(String mail, String password)
//    {
//        login_email.sendKeys(mail);
//        login_password.sendKeys(password);
//        login_button.click();
//
//    }
//
//    public void errorText(String errorMessage)
//    {
//        pop_up.getText().equals(errorMessage);
//    }
//
//
//}
