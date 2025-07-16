package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int GREET = 1;
    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;
    public static final int EXIT = 0;

    public static String greeetings() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = Cli.getUserName();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void startGame(int gameNumber) {
        switch (gameNumber) {
            case GREET: // select menu 1 - Greet
                greeetings();
                break;
            case EVEN_GAME: // select menu 2 - game Even
                String name2 = greeetings();
                Even.gameplay(name2);
                break;
            case CALC_GAME: // select menu 3 - game Calc
                String name3 = greeetings();
                Calc.gameplay(name3);
                break;
            case GCD_GAME: // select menu 4 - game GCD
                String name4 = greeetings();
                GCD.gameplay(name4);
                break;
            case PROGRESSION_GAME: // select menu 5 - game Progression
                String name5 = greeetings();
                Progression.gameplay(name5);
                break;
            case PRIME_GAME: // select menu 6 - game Prime
                String name6 = greeetings();
                Prime.gameplay(name6);
                break;
            case EXIT: // select menu 0 - Exit
                System.out.println("Goodbye !");
                break;
            default:
                System.out.println("incorrect input");
                break;
        }
    }
}
