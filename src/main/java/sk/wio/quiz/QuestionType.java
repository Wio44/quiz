package sk.wio.quiz;

public enum QuestionType {
    SINGLE_ANSWER("(Question with single answer)"),
    MULTIPLE_ANSWERS("(Question with multiple answers)");

    private final String description;

    QuestionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
