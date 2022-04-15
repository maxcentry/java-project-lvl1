package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd extends Engine {

    public Gcd() {
        setGameDescription("Find the greatest common divisor of given numbers.");
    }

    @Override
    protected final String getQuestion() {
        int first = RANDOM.nextInt(MAXIMUM);
        int second = RANDOM.nextInt(MAXIMUM);

        setRightAnswer(String.valueOf(findGCD(first, second)));

        return first + " " + second;
    }

    @Override
    protected final void getAnswerFromUser() {
        Scanner sc = new Scanner(System.in);
        setAnswer(String.valueOf(sc.nextInt()));
    }

    private int findGCD(int first, int second) {
        if (second == 0) {
            return first;
        }
        return findGCD(second, first % second);
    }
}
