package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static final int ROUNDS = 3;
    protected static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n");
        System.out.println("Your choice: ");
        int numberOfGame = App.SCANNER.nextInt();

        switch (numberOfGame) {
            case Cli.GREET:
                Cli.greet();
                break;
            case Even.EVEN_GAME:
                Even.gameplay();
                break;
            case Calc.CALC_GAME:
                Calc.gameplay();
                break;
            case GCD.GCD_GAME:
                GCD.gameplay();
                break;
            case Progression.PROGRESSION_GAME:
                Progression.gameplay();
                break;
            case Prime.PRIME_GAME:
                Prime.gameplay();
                break;
            case Cli.EXIT:
                System.out.println("Goodbye !");
                break;
            default:
                System.out.println("incorrect input");
                break;
        }
    }
}
