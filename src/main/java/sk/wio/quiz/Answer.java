package sk.wio.quiz;

public class Answer {
    private final String option;
    private final boolean isCorrect;

    public Answer(String option, boolean isCorrect) {
        this.option = option;
        this.isCorrect = isCorrect;
    }

    public String getOption() {
        return option;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    @Override
    public String toString() {
        return option;
    }
}

