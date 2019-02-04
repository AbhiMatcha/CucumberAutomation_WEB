package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static Base.BaseUtil.driver;
import static Base.utils.*;
import static Objects.ProfilePage_repo.*;
import static Objects.ProfilePage_repo.errorMessage;
import static Objects.ProfilePage_repo.profile_alertMessage;
import static Objects.homeScreen_repo.profile_button;
import static Objects.homeScreen_repo.settings_button;
import static Objects.signup_repo.signupMethod;

public class profilePageScenarios {
    static String GetEmail = null;
    static String[] getUsername;

    @When("^get the email when user signup's in the application$")
    public void getTheEmailWhenUserSignupSInTheApplication() throws Exception {
        GetEmail = signupMethod();
        getUsername = GetEmail.split("@");
    }

    @And("^user able to select settings button$")
    public void userAbleToSelectSettingsButton() {
        settings_button().click();
    }

    @Then("^user able to see upload photo button$")
    public void userAbleToSeeUploadPhotoButton() {
        Assert.assertEquals(true, profile_uploadButton().isDisplayed());
//        Assert.assertEquals(true,profile_selectFileFromComputer().isDisplayed());
//        Thread.sleep(3000);
//        closeWindow_selectImage().click();
//        Thread.sleep(6000);
    }

    @And("^user able to enter student name in profile page$")
    public void userAbleToEnterStudentNameInProfilePage() {
        profile_studentName().clear();
        profile_studentName().sendKeys(userName);
    }

    @And("^user able to enter mobile number in profile page$")
    public void userAbleToEnterMobileNumberInProfilePage() {
        profile_Mobile().clear();
        profile_Mobile().sendKeys(randomMobile());
    }

    @And("^user able to see the email that he signedup in email address section$")
    public void userAbleToSeeTheEmailThatHeSignedupInEmailAddressSection() {
        Assert.assertEquals(true, profile_emailAddress().isDisplayed());
    }

    @And("^user able to enable the checkbox in profile page$")
    public void userAbleToEnableTheCheckboxInProfilePage() {
        Assert.assertEquals(true, profile_EmailCheckbox().isDisplayed());
        profile_EmailCheckbox().click();
    }

    @Then("^user able to select change password button in profile page$")
    public void userAbleToSelectChangePasswordButtonInProfilePage() throws InterruptedException {
        profile_changePassword().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to select show password option$")
    public void userAbleToSelectShowPasswordOption() {
        profile_changePassowrd_showpass().click();
    }

    @And("^user able to see the ([^\"]*) when he/she give wrong inputs$")
    public void userAbleToSeeTheErrorMessageWhenHeSheGiveWrongInputs(String errorMessage) {
        Assert.assertEquals(true, profile_changePassword_errormessage().getText().equals(errorMessage));
    }

    @And("^user able to enter old password ([^\"]*) in profile page$")
    public void userAbleToEnterOldPasswordInProfilePage(String oldPassword) {
        profile_chanePassword_oldPass().sendKeys(oldPassword);
    }

    @Then("^user able to save the updated password$")
    public void userAbleToSaveTheUpdatedPassword() throws InterruptedException {
        profile_changePassword_save().click();
        Thread.sleep(AddShortDelay);
    }

    @And("^user able to enter new password ([^\"]*) in profile page$")
    public void userAbleToEnterNewPasspwordInProfilePage(String newPassword) {
        profile_chanePassword_newPass().sendKeys(newPassword);
    }

    @And("^user able to enter confirm password ([^\"]*) in profile page$")
    public void userAbleToEnterConfirmPasswordInProfilePage(String confirmPassword) {
        profile_chanePassword_ConfirmNewPass().sendKeys(confirmPassword);
    }

    @And("^user able to see the password changed message$")
    public void userAbleToSeeThePasswordChangedMessage() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        Assert.assertEquals(true, profile_alertMessage().getText().equals(passwordChanged_Message));
    }

    @And("^user able to see signout button in profile page$")
    public void userAbleToSeeSignoutButtonInProfilePage() throws InterruptedException {
        Thread.sleep(AddShortDelay);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", profile_signout());
        Assert.assertEquals(true, profile_signout().isDisplayed());
    }

    @And("^user able to tap on save button in the profile page$")
    public void userAbleToTapOnSaveButtonInTheProfilePage() throws InterruptedException {
        profile_save().click();
        Thread.sleep(3000);
    }

    @Then("^user able to see the changes made based on success/error message$")
    public void userAbleToSeeTheChangesMadeBasedOnSuccessErrorMessage() throws InterruptedException
    {
        if (profile_alertMessage().getText().equals(errorMessage) || profile_alertMessage().getText().equals(SavedSuccessfulyMessage)) {
            if (profile_alertMessage().getText().equals(errorMessage)) {
                Thread.sleep(3000);
                driver.navigate().back();
                Thread.sleep(3000);
                Assert.assertEquals(true, profile_button().getText().equals(getUsername[0]));
            } else {
                Thread.sleep(3000);
                driver.navigate().back();
                Thread.sleep(3000);
                Assert.assertEquals(true, profile_button().getText().equals(userName));
                System.out.println("Im sucess");
            }
        }
    }
}
