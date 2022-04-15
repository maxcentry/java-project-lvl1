package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calc extends Engine {

    public Calc() {
        setGameDescription("What is the result of the expression?");
    }

    @Override
    protected final String getQuestion() {
        int operand1 = RANDOM.nextInt(MAXIMUM);
        int operand2 = RANDOM.nextInt(MAXIMUM);

        List<String> availableOperations = Arrays.asList("+", "-", "*");
        String randomOperation = availableOperations.get(RANDOM.nextInt(availableOperations.size()));

        switch (randomOperation) {
            case "+":
                setRightAnswer(String.valueOf(operand1 + operand2));
                break;
            case "-":
                setRightAnswer(String.valueOf(operand1 - operand2));
                break;
            case "*":
                setRightAnswer(String.valueOf(operand1 * operand2));
                break;
            default:
                break;
        }

        return operand1 + randomOperation + operand2;
    }

    @Override
    protected final void getAnswerFromUser() {
        Scanner sc = new Scanner(System.in);
        setAnswer(String.valueOf(sc.nextInt()));
    }
}
