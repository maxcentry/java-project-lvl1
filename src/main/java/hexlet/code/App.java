package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    private static final int GREET_GAME = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int EXIT_GAME = 0;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        switch (gameNumber) {
            case GREET_GAME:
                Cli.greetingUser();
                break;
            case EVEN_GAME:
                Even even = new Even();
                even.play();
                break;
            case CALC_GAME:
                Calc calc = new Calc();
                calc.play();
                break;
            case EXIT_GAME:
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
