package Pages;

import Base.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPlayer extends utils
{
    @FindBy(className = "palet_list")
    private WebElement paletList;

    @FindBy(className = "section-list")
    private WebElement sectionList;

    @FindBy(className = "js_submitAns")
    private WebElement submit;

    @FindBy(className = "js_markReview")
    private WebElement markforReview;

    @FindBy(className = "js_clearResp")
    private WebElement clearResponse;

    @FindBy(className = "js_questnList")
    private WebElement AllQuestions;

    @FindBy(className = "js_testInstructn")
    private WebElement readInstructions;

    @FindBy(className = "lr-btn-new-ghost")
    private WebElement exitInTestPlayer;

    @FindBy(className = "lr-nav-back")
    private WebElement backInTestPlayer;

    @FindBy(className = "swal2-confirm")
    private WebElement popUpConfirm;

    @FindBy(className = "swal2-cancel")
    private WebElement popUpCancel;

    @FindBy(className = "js_finalSubmit-cancel")
    private WebElement finalSubmit;

    @FindBy(className = "js_nextQuestn")
    private WebElement next;

    @FindBy(xpath = "//*[@id='all_buttonsDiv']/button[1]")
    private WebElement save;

    @FindBy(id = "js-show-calc")
    private WebElement calculator;





    private void selectInputAnswer(String QuestionType, String answer, String QuizType)
    {

        if (QuestionType.equalsIgnoreCase("FIB")) {
            element = driver.findElement(By.id("answer"));
            element.sendKeys(answer);
            if(QuizType.equalsIgnoreCase("gmat")) {
                popUpConfirm.click();
                next.click();
            }
            else if(QuizType.equalsIgnoreCase("practise"))
            {
                save.click();
                next.click();
            }
            else {
                next.click();
            }

        }
        if (QuestionType.equalsIgnoreCase("Numeric")) {
            int numericAnswer = Integer.parseInt(answer);
            element = driver.findElement(By.id("answer"));
            element.sendKeys(String.valueOf((numericAnswer)));
            if(QuizType.equalsIgnoreCase("gmat")) {
                popUpConfirm.click();
                next.click();
            }
            else if(QuizType.equalsIgnoreCase("practise"))
            {
                save.click();
                next.click();
            }
            else {
                next.click();
            }
        }
        if (QuestionType.equalsIgnoreCase("MCQ")) {
            if(answer.length()==1) {
                element = driver.findElement(By.xpath("//*[@id='optionsTpl']/div/div/div/div/ul/li[" + answer + "]/label/div[1]/label"));
                element.click();
                if(QuizType.equalsIgnoreCase("gmat")) {
                    popUpConfirm.click();
                    next.click();
                }
                else if(QuizType.equalsIgnoreCase("practise"))
                {
                    save.click();
                    next.click();
                }
                else {
                    next.click();
                }
            }
            else{System.out.println("Wrong input : Please check and modify the input");}
        }
        if (QuestionType.equalsIgnoreCase("Essay")) {
            element = driver.findElement(By.id("subjectiveAns"));
            element.sendKeys(answer);
            if(QuizType.equalsIgnoreCase("gmat")) {
                popUpConfirm.click();
                next.click();
            }
            else if(QuizType.equalsIgnoreCase("practise"))
            {
                save.click();
                next.click();
            }
            else {
                next.click();
            }
        }

        if (QuestionType.equalsIgnoreCase("MCQ_Muliple"))
        {
            String answers[]=answer.split(",");
            for(int i=0;i<answers.length;i++)
            {
                element = driver.findElement(By.xpath("//*[@id='optionsTpl']/div/div/div/div/ul/li["+answers[i]+"]/label/div[1]/label"));
                element.click();
                if(QuizType.equalsIgnoreCase("gmat")) {
                    popUpConfirm.click();
                    next.click();
                }
                else if(QuizType.equalsIgnoreCase("practise"))
                {
                    save.click();
                    next.click();
                }
                else {
                    next.click();
                }
            }

        }

    }

    public void inputAnswer(String QuestionType, String answer, String QuizType) {
        if (QuestionType.equalsIgnoreCase("FIB")) {
            selectInputAnswer(QuestionType, answer, QuizType);
        }
        if (QuestionType.equalsIgnoreCase("Numeric")) {
            selectInputAnswer(QuestionType, answer, QuizType);
        }
        if (QuestionType.equalsIgnoreCase("MCQ")) {
            selectInputAnswer(QuestionType, answer, QuizType);
        }
        if (QuestionType.equalsIgnoreCase("Essay")) {
            selectInputAnswer(QuestionType, answer, QuizType);
        }
        if (QuestionType.equalsIgnoreCase("MCQ_Muliple")) {
            selectInputAnswer(QuestionType, answer,QuizType);
        }
    }

    private void answerStatusInfo(String statusName, int status) {
        element = driver.findElement(By.xpath("//*[@id='quizMap']/div/div[1]/ul/li["+status+"]/p"));
        element.getText().equalsIgnoreCase(statusName);
    }

    public void checkAnswerStatus(String statusName, int status) {
        answerStatusInfo(statusName, status);
    }


}
