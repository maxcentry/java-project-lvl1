package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Objects;
import java.util.Scanner;

public class Even extends Engine {
    private String answer = "";
    private String rightAnswer = "";

    public Even() {
        setGameDescription("Answer 'yes' if number even otherwise answer 'no'.");
    }

    @Override
    protected final String getQuestion() {
        int magicNumber = RANDOM.nextInt(MAXIMUM);

        rightAnswer = magicNumber % 2 == 0 ? "yes" : "no";

        return String.valueOf(magicNumber);
    }

    @Override
    protected final void getAnswer() {
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
    }

    @Override
    protected final boolean isRightAnswer() {
        return Objects.equals(rightAnswer, answer);
    }
}
