package sk.wio.quiz;

import java.util.*;

public class Question {
    private final String question;
    private final List<Answer> answers = new ArrayList<>();
    private final QuestionType type;

    public Question(String question, QuestionType type) {
        this.question = question;
        this.type = type;
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public String getQuestion() {
        return this.question;
    }

    public int getCorrectAnswer() {
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).isCorrect()) {
                result = Integer.parseInt(String.valueOf(stringBuilder.append(i + 1)));
            }
        }
        return result;
    }

    public void printQuestionAndAnswer() {
        System.out.println();
        printCharacter();
        System.out.println("Question " + ": " + question + type.getDescription());
        printCharacter();

        int order = 1;
        for (Answer answer : answers) {
            System.out.println(order + ".) " + answer.getOption());
            order++;
        }
    }

    private void printCharacter() {
        for (int i = 0; i < question.length() + 11 + type.getDescription().length(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Question " + getQuestion();
    }
}