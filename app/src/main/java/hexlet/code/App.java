package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
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
        String numberOfGame = App.SCANNER.nextLine();

        switch (numberOfGame) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.gameplay();
                break;
            case "3":
                Calc.gameplay();
                break;
            case "4":
                GCD.gameplay();
                break;
            case "5":
                Progression.gameplay();
                break;
            case "6":
                Prime.gameplay();
                break;
            case "0":
                Cli.exit();
                break;
            default:
                System.out.println(numberOfGame + " is incorrect input.\nTry again!");
                break;
        }
    }
}
