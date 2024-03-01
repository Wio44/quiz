package sk.wio.quiz;

import java.util.*;

public class Question {
    private final String question;
    private final List<Answer> answers = new ArrayList<>();
    private final List<String> correctAnswers = new ArrayList<>();

    public Question(String question) {
        this.question = question;
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public String getQuestion() {
        return this.question;
    }

    public void addCorrectAnswer() {
        int j;
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).isCorrect()) {
                j = i + 1;
                result = String.valueOf(stringBuilder.append(j));
            }
        }
        this.correctAnswers.add(result);
    }

    public int getCorrectAnswers() {
        int result = 0;
        for (String correctAnswer : correctAnswers) {
            result = Integer.parseInt(correctAnswer);
        }
        return result;
    }

    public void printQuestionAndAnswer() {
        printCharacter();
        System.out.println("Question " + ": " + question);
        printCharacter();

        int order = 1;
        for (Answer answer : answers) {
            System.out.println(order + ".) " + answer.getOption());
            order++;
        }
    }

    private void printCharacter() {
        for (int i = 0; i < question.length() + 11; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Question " + getQuestion();
    }
}
