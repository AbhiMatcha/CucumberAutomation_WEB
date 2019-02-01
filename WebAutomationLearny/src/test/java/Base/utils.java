package Base;

import java.util.Random;

public class utils extends BaseUtil
{
    public static int actualPrice =1000;
    public static int AddLongDelay=5000;
    public static int AddShortDelay=3000;
    public static int GST_actualPrice =1000;
    public static int GST_Amount=(GST_actualPrice*18)/100;
    public static String userName="Abhishek";
    public static int MockTest_discountPrice =800;
    public static int defaultLength=7;
    public static int TestSeries_discountPrice =100;
    public static String myCoupon=randomCoupon();
    public static String scheduledTime="6th Apr, 2052";
    public static String Expired_Message="Expired";
    public static String evaluation_pending="Not evaluated";
    public static String schoolName="QualiCenter";
    public static String EnterPassword="abhi1234";
    public static String MobileNumber="9494900017";
    public static String email = "abhishek.matcha@learnyst.com";
    public static String Fb_email="tsetapp@gmail.com";
    public static String password="abhi1234";
    public static String google_email="testAppLearnyst@gmail.com";
    public static String google_password="learnyst***";
    public static String Fb_Password= "karaokegarage";
    public static String homepage_URL="https://learnnew.learnyst.com/learn";
    public static String login_URL="https://learnnew.learnyst.com/learn/login";
    public static String GST_login_URL="https://learnnew1.learnyst.com/learn/login";
    public static String signup_URL="https://learnnew.learnyst.com/learn/login?path=learn&state=12";
    public static String GST_signup_URL ="https://zubzubv7.learnyst.com/learn/login?path=learn&state=12";
    public static String google_URL="https://accounts.google.com";
    public static String Insert_URLlink ="https://learnnew.learnyst.com";
    public static String Insert_textLink ="for testing";
    public static String ticket_Title="This is my title for ticket";
    public static String ticket_Description="This is the long_description for testing in the ticket";
    public static String Passwords[] ={"abhi12345","abhi1234"};
    public static String pincode= "560098";
    public static String address1= "#110, 1st main";
    public static String address2= "sri krishna garden layout";
    public static String cityName="Bangalore";
    public static String long_description ="Best product, Best people. I am really finding Learnyst support very good. Learnyst team is always there to help in case of any query or problem.";
    public static String purchased_text=" PURCHASED";
    public static String Coupon_errorMessage="Coupon entered is not valid";

    public static String FeedBack_Essay_Ans()
    {
        String selectAnswer[] = { "This is my feedback","I wont give","please go","why u need ?"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    public static String Review_by_User()
    {
        String selectAnswer[] = { "This is my feedback and it is good","I wont give","please go","why u need ?"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }


    public static String fillInTheBlank_Ans()
    {
        String selectAnswer[] = { "2","1","3","4"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String MultipleChoice_RandomAnswers()
    {
        String option1="//*[@id='optionsTpl']/div/div/div/div/ul/li[1]/label/div[1]/label";
        String option2="//*[@id='optionsTpl']/div/div/div/div/ul/li[2]/label/div[1]/label";
        String option3="//*[@id='optionsTpl']/div/div/div/div/ul/li[3]/label/div[1]/label";
        String selectAnswer[] = {option1,option2,option3};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    public static String randomEmail(int EmailLength)
    {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder character = new StringBuilder();
        Random rnd = new Random();
        while (character.length() < EmailLength)
            { // length of the random string.
                int index = (int) (rnd.nextFloat() * chars.length());
                character.append(chars.charAt(index));
            }
        String email = character.toString();
        return email+"@yopmail.com";
    }

    public static String randomMobileNumber() {
        String chars="1234567890";
        StringBuilder character = new StringBuilder();
        Random rnd = new Random();
        while (character.length() <18 ) { // length of the random string.
            int charindex = (int) (rnd.nextFloat() * chars.length());
            character.append(chars.charAt(charindex));
        }
        String speacialChar = character.toString();
        return speacialChar;
    }

    public static String randomSpecialCharacter() {
        String chars = "~!@#$%^a&*()_+b=-{}|[]c\":;'?>d<,./`";
        StringBuilder character = new StringBuilder();
        Random rnd = new Random();
        while (character.length() <10 ) { // length of the random string.
            int index = (int) (rnd.nextFloat() * chars.length());
            character.append(chars.charAt(index));
        }
        String speacialChar = character.toString();
        return speacialChar;
    }


    public static String randomText(String module) {
        String chars = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder character = new StringBuilder();
        Random rnd = new Random();
        while (character.length() <10 ) { // length of the random string.
            int index = (int) (rnd.nextFloat() * chars.length());
            character.append(chars.charAt(index));
        }
        String speacialChar = character.toString();
        return "This is for testing"+ module+"  :"+speacialChar;
    }

    protected static String randomCoupon()
    {
        String selectCoupon[] = {"fifty","yeast","sixty"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectCoupon.length);
        return selectCoupon[randomIndex];
    }

    protected static String randomStarRating()
    {
        String selectAnswer[] = { "star5","star4half","star4","star3half","star3","star2half","star2","star1half","star1","starhalf"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    protected static String randomMobile()
    {
        String selectAnswer[] = { "+919494900017","9494900017"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    public static int PriceCalculator(int finalPrice) throws InterruptedException
    {
        int price = 0;
        String fiftyPercent="fifty";
        String sixtyPercent="sixty";
        if(myCoupon.equals(fiftyPercent))
        {
            price = finalPrice -(int) (finalPrice*0.50);
            Thread.sleep(4000);
        }
        else if(myCoupon.equals(sixtyPercent))
        {
            price = finalPrice - (int) (finalPrice*0.60);
            Thread.sleep(4000);
        }
        return price;
    }

}
