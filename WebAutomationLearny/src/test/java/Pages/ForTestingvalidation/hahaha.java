package Pages.ForTestingvalidation;


public class hahaha {

    public static void main(String[] agrs) {
        hahaha h = new hahaha();

        h.inputAnswer("mcq_multiple", "1,16,15,14,1,12,13", "gmat");
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
        if (QuestionType.equalsIgnoreCase("mcq_multiple")) {
            selectInputAnswer(QuestionType, answer, QuizType);
        }
    }

    private void selectInputAnswer(String QuestionType, String answer, String QuizType) {
        if (QuestionType.equalsIgnoreCase("FIB")) {
            System.out.println(answer);
            if (QuizType.equalsIgnoreCase("gmat")) {
                System.out.println("gmat");
            } else if (QuizType.equalsIgnoreCase("practise")) {
                System.out.println("prac");
            } else {
                System.out.println("everything else");
            }

        }
        if (QuestionType.equalsIgnoreCase("Numeric")) {
            int numericAnswer = Integer.parseInt(answer);
            System.out.println(numericAnswer);
            if (QuizType.equalsIgnoreCase("gmat")) {
                System.out.println("gmat");
            } else if (QuizType.equalsIgnoreCase("practise")) {
                System.out.println("prac");
            } else {
                System.out.println("everything else");
            }
        }
        if (QuestionType.equalsIgnoreCase("MCQ")) {
            if (answer.length() == 1) {
                System.out.println("//*[@id='optionsTpl']/div/div/div/div/ul/li[" + answer + "]/label/div[1]/label");
                if (QuizType.equalsIgnoreCase("gmat")) {
                    System.out.println("gmat");
                } else if (QuizType.equalsIgnoreCase("practise")) {
                    System.out.println("prac");
                } else {
                    System.out.println("everything else");
                }
            } else {
                System.out.println("Wrong input : Please check and modify the input");
            }
        }
        if (QuestionType.equalsIgnoreCase("Essay")) {
            System.out.println(answer);
            if (QuizType.equalsIgnoreCase("gmat")) {
                System.out.println("gmat");
            } else if (QuizType.equalsIgnoreCase("practise")) {
                System.out.println("prac");
            } else {
                System.out.println("everything else");
            }
        }
        if (QuestionType.equalsIgnoreCase("mcq_multiple")) {
            String answers[] = answer.split(",");
            for (int i = 0; i < answers.length; i++) {
                System.out.println("//*[@id='optionsTpl']/div/div/div/div/ul/li[" + answers[i] + "]/label/div[1]/label");

                if (QuizType.equalsIgnoreCase("gmat")) {
                    System.out.println("gmat");
                } else if (QuizType.equalsIgnoreCase("practise")) {
                    System.out.println("prac");
                } else {
                    System.out.println("everything else");
                }
            }

        }
    }
}



