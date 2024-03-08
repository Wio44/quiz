package sk.wio;

import sk.wio.quiz.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Quiz quiz = getQuiz();
        boolean quizEnded = false;

        int userInput;
        int result;
        int score = 0;

        while (!quizEnded) {
            for (int i = 0; i < quiz.getQuestions().size(); ) {
                quiz.getQuestions().get(i).printQuestionAndAnswer();
                result = quiz.getQuestions().get(i).getCorrectAnswer();
                try {
                    System.out.print("Enter number of answer: ");
                    userInput = scanner.nextInt();
                    i++;

                    if (userInput == result) {
                        score++;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                    scanner.nextLine();
                }
            }
            System.out.println("\nYou had " + score + "/5 answers correct");
            quizEnded = true;
            scanner.close();
        }
    }

    private static Quiz getQuiz() {
        Question question1 = getQuestion1();
        question1.getCorrectAnswer();
        Question question2 = getQuestion2();
        question2.getCorrectAnswer();
        Question question3 = getQuestion3();
        question3.getCorrectAnswer();
        Question question4 = getQuestion4();
        question4.getCorrectAnswer();
        Question question5 = getQuestion5();
        question5.getCorrectAnswer();

        Quiz quiz = new Quiz("Math Quiz");
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);
        quiz.addQuestion(question4);
        quiz.addQuestion(question5);
        return quiz;
    }

    private static Question getQuestion5() {
        Answer answer5_1 = new Answer("4^0", true);
        Answer answer5_2 = new Answer("1^8", true);
        Answer answer5_3 = new Answer("3^1", false);
        Answer answer5_4 = new Answer("7^0", true);

        Question question5 = new Question("1 = ? ", QuestionType.MULTIPLE_ANSWERS);

        question5.addAnswer(answer5_1);
        question5.addAnswer(answer5_2);
        question5.addAnswer(answer5_3);
        question5.addAnswer(answer5_4);
        return question5;
    }

    private static Question getQuestion4() {
        Answer answer4_1 = new Answer("1", true);
        Answer answer4_2 = new Answer("2", true);
        Answer answer4_3 = new Answer("3", true);
        Answer answer4_4 = new Answer("4", false);

        Question question4 = new Question("What 3 numbers result in the same answer when they are added or ",
                QuestionType.MULTIPLE_ANSWERS);

        question4.addAnswer(answer4_1);
        question4.addAnswer(answer4_2);
        question4.addAnswer(answer4_3);
        question4.addAnswer(answer4_4);
        return question4;
    }

    private static Question getQuestion3() {
        Answer answer3_1 = new Answer("1000", true);
        Answer answer3_2 = new Answer("100", false);
        Answer answer3_3 = new Answer("3000", false);
        Answer answer3_4 = new Answer("2000", false);

        Question question3 = new Question("From the number 0 to the number 1000, the letter A appears only in? ",
                QuestionType.SINGLE_ANSWER);

        question3.addAnswer(answer3_1);
        question3.addAnswer(answer3_2);
        question3.addAnswer(answer3_3);
        question3.addAnswer(answer3_4);
        return question3;
    }

    private static Question getQuestion2() {
        Answer answer2_1 = new Answer("105", false);
        Answer answer2_2 = new Answer("100", true);
        Answer answer2_3 = new Answer("101", false);
        Answer answer2_4 = new Answer("110", false);

        Question question2 = new Question("123+4-5+67-89 = ? ", QuestionType.SINGLE_ANSWER);

        question2.addAnswer(answer2_1);
        question2.addAnswer(answer2_2);
        question2.addAnswer(answer2_3);
        question2.addAnswer(answer2_4);
        return question2;
    }

    private static Question getQuestion1() {
        Answer answer1_1 = new Answer("6", true);
        Answer answer1_2 = new Answer("7", false);
        Answer answer1_3 = new Answer("3", false);
        Answer answer1_4 = new Answer("1", false);

        Question question1 = new Question("What is the highest common factor of the numbers 30 and 132? ",
                QuestionType.SINGLE_ANSWER);
        question1.addAnswer(answer1_1);
        question1.addAnswer(answer1_2);
        question1.addAnswer(answer1_3);
        question1.addAnswer(answer1_4);
        return question1;
    }
}

