package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static Base.utils.*;
import static Objects.CourseOverview_repo.Coupon_error;
import static Objects.CourseSyllabus_repo.*;
import static Objects.GST_MockTest_repo.*;
import static Objects.checkoutPage_repo.*;
import static Objects.payment_repo.*;

public class CheckoutPageSceanrios
{
    public static int coursePrice_courseDetail;
    public static int TotalPayableAMount;

    @Given("^I navigated to signup page for GST enable school$")
    public void iNavigatedToSignupPageForGSTEnableSchool()
    {
        driver.get(GST_signup_URL);
    }

    @And("^user able to select test from GST enabled school$")
    public void userAbleToSelectTestFromGSTEnabledSchool()
    {
        GST_mockTest().click();
    }

    @And("^user able to see course price is sales page$")
    public void userAbleToSeeCoursePriceIsSalesPage()
    {
        Assert.assertEquals(true,courseDiscountPrice().isDisplayed());
        coursePrice_courseDetail=Integer.parseInt(courseDiscountPrice().getText());
    }

    @Then("^user able to select country in address form$")
    public void userAbleToSelectCountryInAddressForm()
    {
        selectCountry();
    }

    @And("^user able to enter his/her username in address form$")
    public void userAbleToEnterHisHerUsernameInAddressForm()
    {
        learnerName().clear();
        learnerName().sendKeys(userName);
    }

    @And("^user able to enter address in the address form$")
    public void userAbleToEnterAddressInTheAddressForm()
    {
        address1().sendKeys(address1);
        address2().sendKeys(address2);
       }

    @And("^user able to select the city in address form$")
    public void userAbleToSelectTheCityInAddressForm()
    {
        city().sendKeys(cityName);
    }

    @And("^user able to select the state in address form$")
    public void userAbleToSelectTheStateInAddressForm()
    {
        selectState();
    }

    @And("^user able to enter the pincode in the address form$")
    public void userAbleToEnterThePincodeInTheAddressForm()
    {
        pincode().sendKeys(pincode);
    }

    @And("^user able to enter the mobile number in the address form$")
    public void userAbleToEnterTheMobileNumberInTheAddressForm()
    {
        mobileNumber().sendKeys(MobileNumber);
    }

    @And("^user able to save the details entered in the address form$")
    public void userAbleToSaveTheDetailsEnteredInTheAddressForm()
    {
        save().click();
    }

    @And("^user able to see the GST price of the course/Test in checkout page$")
    public void userAbleToSeeTheGSTPriceOfTheCourseTestInCheckoutPage()
    {
        Assert.assertEquals(true, (Integer.parseInt(GST_courseActualPrice().getText())) == (GST_actualPrice) && Integer.parseInt(GST_courseActualPrice().getText()) == (coursePrice_courseDetail));
        TotalPayableAMount=GST_actualPrice+(GST_Amount);
    }

    @Then("^user able to see error message or change in price after applying coupon in GST enabled school$")
    public void userAbleToSeeErrorMessageOrChangeInPriceAfterApplyingCouponInGSTEnabledSchool() throws InterruptedException
    {
        if (Coupon_error().isDisplayed())
        {
            Coupon_error().getText().equals(Coupon_errorMessage);
            Assert.assertEquals(true, (Integer.parseInt(GST_courseActualPrice().getText())) == (GST_actualPrice));
        }

        if((Integer.parseInt(GST_AmountPayable().getText())) != (TotalPayableAMount))
        {
            int result = PriceCalculator(TotalPayableAMount);
            Assert.assertEquals(true, (Integer.parseInt(GST_AmountPayable().getText()) == result));
        }

    }

    @And("^user able to see the refund policy$")
    public void userAbleToSeeTheRefundPolicy()
    {
        Assert.assertEquals(true,refundPolicy().isDisplayed());
    }
}
