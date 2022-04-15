package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calc extends Engine {
    private int answer = 0;
    private int rightAnswer = 0;

    public Calc() {
        setGameDescription("What is the result of the expression?");
    }

    @Override
    protected final String getQuestion() {
        int op1 = RANDOM.nextInt(MAXIMUM);
        int op2 = RANDOM.nextInt(MAXIMUM);

        List<String> operations = Arrays.asList("+", "-", "*");
        String randomOperation = operations.get(RANDOM.nextInt(operations.size()));

        switch (randomOperation) {
            case "+":
                rightAnswer = op1 + op2;
                break;
            case "-":
                rightAnswer = op1 - op2;
                break;
            case "*":
                rightAnswer = op1 * op2;
                break;
            default:
                break;
        }

        return op1 + randomOperation + op2;
    }

    @Override
    protected final void getAnswer() {
        Scanner sc = new Scanner(System.in);
        answer = sc.nextInt();
    }

    @Override
    protected final boolean isRightAnswer() {
        return answer == rightAnswer;
    }
}
