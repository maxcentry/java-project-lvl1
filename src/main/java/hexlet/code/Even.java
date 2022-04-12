package hexlet.code;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static final int EXPECTED_SUCCESS_ATTEMPT = 3;
    public static final int MAX_RAND = 100;
    public static final int MIN_RAND = 1;

    public static final Random random = new Random();

    public static void play() {
        String username = Cli.greetingUser();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int successAttempt = 0;
        while (successAttempt < EXPECTED_SUCCESS_ATTEMPT) {
            int magicNumber = random.nextInt(MIN_RAND, MAX_RAND);
            System.out.println("Question: " + magicNumber);
            System.out.print("Answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            String correctAnswer = magicNumber % 2 == 0 ? "yes" : "no";
            if (Objects.equals(correctAnswer, answer)) {
                System.out.println("Correct!");
                successAttempt++;
            } else {
                System.out.println("Let's try again, " + username + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + username + "!");
    }
}
