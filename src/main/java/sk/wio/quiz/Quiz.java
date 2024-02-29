package sk.wio.quiz;

import java.util.*;

public class Quiz {
    private final String name;
    private final ArrayList<Question> questions = new ArrayList<>();

    public Quiz(String name) {
        this.name = name;

        printDescription();
    }

    private void printDescription() {
        System.out.println("+---------------------------------------------------------------------------------------------------+");
        System.out.println("|                              Welcome in quiz - " + getName() + "                                          |");
        System.out.println("+---------------------------------------------------------------------------------------------------+");
        System.out.println("\nThis quiz has 5 questions. Enter your choice (answer numbers from 1 to 4).");
        System.out.println("For a question with multiple answers, write together a combination of correct answers:");
        System.out.println("\t12,123,1234, etc...\n");
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    public String getName() {
        return name;
    }
}
