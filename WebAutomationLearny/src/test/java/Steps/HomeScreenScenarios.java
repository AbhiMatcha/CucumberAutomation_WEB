package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import java.util.concurrent.TimeUnit;
import static Base.BaseUtil.driver;
import static Base.utils.AddShortDelay;
import static Base.utils.MobileNumber;
import static Objects.homeScreen_repo.*;

public class HomeScreenScenarios
{
    @Given("^user navigated to offered courses$")
    public void userNavigatedToOfferedCourses() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        offeredCourse().click();
        Thread.sleep(AddShortDelay);
    }

    @Then("^user able to enter name$")
    public void userAbleToEnterName()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        inputName().click();
        inputName().sendKeys(name);
    }

    @Then("^user able to enter phone number$")
    public void userAbleToEnterPhoneNumber()
    {
        inputPhoneNumber().click();
        inputPhoneNumber().sendKeys(MobileNumber);
    }

    @Then("^user able to enter place$")
    public void userAbleToEnterPlace()
    {
        inputPlace().click();
        inputPlace().sendKeys(place);
    }

    @Then("^user able to enter city$")
    public void userAbleToEnterCity() {
        inputCity().click();
        inputCity().sendKeys(city);

    }

    @Then("^user able to enter state$")
    public void userAbleToEnterState() {
        inputState().click();
        inputState().sendKeys(state);

    }

    @Then("^user able to enter country$")
    public void userAbleToEnterCountry() {
        inputCountry().click();
        inputCountry().sendKeys(country);

    }

    @Then("^user able to enter institute$")
    public void userAbleToEnterInstitute() {
        inputInstitute().click();
        inputInstitute().sendKeys(institute);

    }

    @Then("^user able to enter Mobile number$")
    public void userAbleToEnterMobileNumber() {
        inputMobileNumber().click();
        inputMobileNumber().sendKeys(MobileNumber);

    }

    @Then("^user able to save the details$")
    public void userAbleToSaveTheDetails() {
        SubmitinputMobileNumber().click();
    }
}
