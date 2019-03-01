package Steps;

import java.util.concurrent.TimeUnit;
import static Base.BaseUtil.driver;
import static Base.utils.AddLongDelay;
import static Base.utils.AddShortDelay;
import static Objects.bundle_repo.*;

public class VideoScenarios
{
//    @Then("^user able to play the video$")
//    public void userAbleToPlayTheVideo() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        playVidoeButton().click();
//        Thread.sleep(AddShortDelay);
//    }
//
//    @Then("^user able to change the speed of the video$")
//    public void userAbleToChangeTheSpeedOfTheVideo() throws InterruptedException {
//        select_random_PlaySpeed_video().click();
//        Thread.sleep(AddLongDelay);
//    }
//
//    @And("^user able to see video in full screen view$")
//    public void userAbleToSeeVideoInFullScreenView()
//    {
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        fullScreen().click();
//    }
//
//    @And("^user able to see the remaining time of the video$")
//    public void userAbleToSeeTheRemainingTimeOfTheVideo() throws InterruptedException {
//        String getbeforeTime=remainingTime().getText();
//        String[] getpresent=getbeforeTime.split("\n" +
//                "");
//        String getPresntTime=getpresent[1];
//        Thread.sleep(10000);
//
//        String getafterTime=remainingTime().getText();
//        String[] getafter=getafterTime.split("\n" +
//                "");
//        String timeafteruserwatched=getafter[1];
//
//        int result= Integer.valueOf(getPresntTime)-Integer.valueOf(timeafteruserwatched);
//
//        String finalTime=remainingTime().getText();
//        String[] storeFinalTime=finalTime.split("\n" +
//                "");
//        int finalTimeVideo= Integer.valueOf(storeFinalTime[1]);
//        System.out.println(result==finalTimeVideo);
//        Thread.sleep(AddLongDelay);
//    }

//    @Then("^user able to select option to change speed$")
//    public void userAbleToSelectOptionToChangeSpeed() throws InterruptedException
//    {
//        Actions action = new Actions(driver);
//        action.moveToElement(select_PlaySpeed_video()).perform();
//    }

}
