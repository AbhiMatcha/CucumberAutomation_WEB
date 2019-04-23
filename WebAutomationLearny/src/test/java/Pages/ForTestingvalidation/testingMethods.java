package Pages.ForTestingvalidation;

import org.w3c.dom.Node;

//import org.json.JSONArray;
//import org.json.JSONObject;
//
public class testingMethods {

//NO    final static String object = "{\"QuizType\":\"GMAT\",\"Answers\":{\"0\":[{\"answer\":\"2\",\"questionType\":\"MCQ\"}],\"1\":[{\"answer\":\"2\",\"questionType\":\"FIB\"}],\"2\":[{\"answer\":\"1\",\"questionType\":\"NUM\"}],\"3\":[{\"answer\":\"hre gjkerjkg eajbfgjk enaf gakjsgkna efkgja fgknafg sakj gkjsa fgsakjf gsdfogbs akf gsafjkg safgs dskj gasdkgf s\",\"questionType\":\"Essay\"}],\"4\":[{\"questionType\":\"Mcq_Multiple\",\"answer1\":1,\"answer2\":11,\"answer3\":4,\"answer4\":10,\"answer5\":21,\"answer6\":19}]}}";
//    final JSONObject answerdata = new JSONObject(object);
//    final String quizType = answerdata.getString("QuizType");
//    final JSONObject answers = answerdata.getJSONObject("Answers");
//
//    public static void useThis()
//    {
//        testingMethods t = new testingMethods();
//        for(int i=0;i<t.answers.length();i++)
//        {
//            final JSONArray dynamicAnswer= t.answers.getJSONArray(""+i+"");
//            final JSONObject answerList = dynamicAnswer.getJSONObject(dynamicAnswer.length()-1);
//            final JSONObject ewr=dynamicAnswer.getJSONObject(0);
//            final String answer_Option =answerList.getString("answer");
//
//            final String question_type =answerList.getString("questionType");
//            System.out.println(question_type);
//            int getLength=ewr.length();
//            if(question_type.equalsIgnoreCase("Mcq_Multiple"))
//            {
//                for(int i=0;i<getLength-1;i++){
//
//                }
//                final String answer_Options =answerList.getString("answer"+0+"");
//                t.selectInputAnswer(question_type, answer_Options, t.quizType,getLength);
//            }
//            if(question_type!=("Mcq_Multiple")){
//                t.selectInputAnswer(question_type, answer_Option, t.quizType);
//            }
//        }
//    }
//    public static void main(String[] args)
//    {
//        useThis();
//
//    }
//    private void selectInputAnswer(String QuestionType, String answer, String QuizType, int ewr)
//    {
//        if (QuestionType.equalsIgnoreCase("FIB")) {
//            System.out.println(answer);
//            if (QuizType.equalsIgnoreCase("gmat")) {
//                System.out.println("gmat");
//            } else if (QuizType.equalsIgnoreCase("practise")) {
//                System.out.println("prac");
//            } else {
//                System.out.println("everything else");
//            }
//
//        }
//        if (QuestionType.equalsIgnoreCase("Numeric")) {
//            int numericAnswer = Integer.parseInt(answer);
//            System.out.println(numericAnswer);
//            if (QuizType.equalsIgnoreCase("gmat")) {
//                System.out.println("gmat");
//            } else if (QuizType.equalsIgnoreCase("practise")) {
//                System.out.println("prac");
//            } else {
//                System.out.println("everything else");
//            }
//        }
//        if (QuestionType.equalsIgnoreCase("MCQ")) {
//            if (answer.length() == 1) {
//                System.out.println("//*[@id='optionsTpl']/div/div/div/div/ul/li[" + answer + "]/label/div[1]/label");
//                if (QuizType.equalsIgnoreCase("gmat")) {
//                    System.out.println("gmat");
//                } else if (QuizType.equalsIgnoreCase("practise")) {
//                    System.out.println("prac");
//                } else {
//                    System.out.println("everything else");
//                }
//            } else {
//                System.out.println("Wrong input : Please check and modify the input");
//            }
//        }
//        if (QuestionType.equalsIgnoreCase("Essay")) {
//            System.out.println(answer);
//            if (QuizType.equalsIgnoreCase("gmat")) {
//                System.out.println("gmat");
//            } else if (QuizType.equalsIgnoreCase("practise")) {
//                System.out.println("prac");
//            } else {
//                System.out.println("everything else");
//            }
//        }
//
//        if (QuestionType.equalsIgnoreCase("Mcq_Multiple")) {
//
//
//            for (int i = 0; i < ewr-1; i++)
//            {
//                System.out.println(ewr);
//                System.out.println("//*[@id='optionsTpl']/div/div/div/div/ul/li["+answer+"]/label/div[1]/label");
//
//                if (QuizType.equalsIgnoreCase("gmat")) {
//                    System.out.println("gmat");
//                } else if (QuizType.equalsIgnoreCase("practise")) {
//                    System.out.println("prac");
//                } else {
//                    System.out.println("everything else");
//                }
//            }
//
//        }
//    }
//    private void selectInputAnswer(String QuestionType, String answer, String QuizType)
//    {
//        if (QuestionType.equalsIgnoreCase("FIB")) {
//            System.out.println(answer);
//            if (QuizType.equalsIgnoreCase("gmat")) {
//                System.out.println("gmat");
//            } else if (QuizType.equalsIgnoreCase("practise")) {
//                System.out.println("prac");
//            } else {
//                System.out.println("everything else");
//            }
//
//        }
//        if (QuestionType.equalsIgnoreCase("Numeric")) {
//            int numericAnswer = Integer.parseInt(answer);
//            System.out.println(numericAnswer);
//            if (QuizType.equalsIgnoreCase("gmat")) {
//                System.out.println("gmat");
//            } else if (QuizType.equalsIgnoreCase("practise")) {
//                System.out.println("prac");
//            } else {
//                System.out.println("everything else");
//            }
//        }
//        if (QuestionType.equalsIgnoreCase("MCQ")) {
//            if (answer.length() == 1) {
//                System.out.println("//*[@id='optionsTpl']/div/div/div/div/ul/li[" + answer + "]/label/div[1]/label");
//                if (QuizType.equalsIgnoreCase("gmat")) {
//                    System.out.println("gmat");
//                } else if (QuizType.equalsIgnoreCase("practise")) {
//                    System.out.println("prac");
//                } else {
//                    System.out.println("everything else");
//                }
//            } else {
//                System.out.println("Wrong input : Please check and modify the input");
//            }
//        }
//        if (QuestionType.equalsIgnoreCase("Essay")) {
//            System.out.println(answer);
//            if (QuizType.equalsIgnoreCase("gmat")) {
//                System.out.println("gmat");
//            } else if (QuizType.equalsIgnoreCase("practise")) {
//                System.out.println("prac");
//            } else {
//                System.out.println("everything else");
//            }
//        }
//
////        if (QuestionType.equalsIgnoreCase("Mcq_Multiple")) {
////
////
////            for (int i = 0; i < ewr; i++) {
////                System.out.println("//*[@id='optionsTpl']/div/div/div/div/ul/li[" + answer + "]/label/div[1]/label");
////
////                if (QuizType.equalsIgnoreCase("gmat")) {
////                    System.out.println("gmat");
////                } else if (QuizType.equalsIgnoreCase("practise")) {
////                    System.out.println("prac");
////                } else {
////                    System.out.println("everything else");
////                }
////            }
//
//        }
    }
//
//
//
