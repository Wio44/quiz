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
        System.out.println("\n\t\t\tThis quiz has 5 questions. Enter your choice (answer numbers from 1 to 4).");
        System.out.println("\t\tFor a question with multiple answers, write together a combination of correct answers:");
        System.out.println("\t\t\t\t12,123,1234, etc...");
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
