package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        switch (game) {
            case 1:
                Greet.play();
                break;
            case 2:
                Even.play();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
