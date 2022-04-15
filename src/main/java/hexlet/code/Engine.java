package hexlet.code;

import java.util.Objects;
import java.util.Random;

public abstract class Engine {
    private static final int EXPECTED_SUCCESS_ATTEMPT = 3;

    protected static final int MAXIMUM = 100;
    protected static final Random RANDOM = new Random();

    private String gameDescription;
    private String username;
    private String answer;
    private String rightAnswer;

    private String getGameDescription() {
        return gameDescription;
    }

    protected final void setGameDescription(String val) {
        gameDescription = val;
    }

    private String getUsername() {
        return username;
    }

    protected final void setUsername(String val) {
        username = val;
    }

    private String getAnswer() {
        return answer;
    }

    protected final void setAnswer(String val) {
        answer = val;
    }

    private String getRightAnswer() {
        return rightAnswer;
    }

    protected final void setRightAnswer(String val) {
        rightAnswer = val;
    }

    public final void play() {
        greetingUser();
        showGameDescription();
        for (int i = 0; i < EXPECTED_SUCCESS_ATTEMPT; i++) {
            askQuestion();
            requestAnswer();
            if (isRightAnswer()) {
                successAttempt();
            } else {
                wrongAttempt();
            }
        }
        goodGame();
    }

    private void greetingUser() {
        setUsername(Cli.greetingUser());
    }

    private void showGameDescription() {
        System.out.println(getGameDescription());
    }

    private void askQuestion() {
        System.out.println("Question: " + getQuestion());
    }

    private void requestAnswer() {
        System.out.print("Your answer: ");
        getAnswerFromUser();
    }

    private void successAttempt() {
        System.out.println("Correct!");
    }

    private void wrongAttempt() {
        System.out.println("'" + getAnswer() + "' is wrong answer ;(. Correct answer was '" + getRightAnswer() + "'.");
        System.out.println("Let's try again, " + getUsername() + "!");
        System.exit(0);
    }

    private void goodGame() {
        System.out.println("Congratulations, " + getUsername() + "!");
    }

    protected final boolean isRightAnswer() {
        return Objects.equals(getRightAnswer(), getAnswer());
    }

    protected abstract String getQuestion();

    protected abstract void getAnswerFromUser();
}
