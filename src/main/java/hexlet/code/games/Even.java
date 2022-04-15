package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even extends Engine {

    public Even() {
        setGameDescription("Answer 'yes' if number even otherwise answer 'no'.");
    }

    @Override
    protected final String getQuestion() {
        int magicNumber = RANDOM.nextInt(MAXIMUM);

        setRightAnswer(magicNumber % 2 == 0 ? "yes" : "no");

        return String.valueOf(magicNumber);
    }

    @Override
    protected final void getAnswerFromUser() {
        Scanner sc = new Scanner(System.in);
        setAnswer(sc.nextLine());
    }
}
