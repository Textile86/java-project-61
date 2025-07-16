package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static String greeetings() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = Cli.getUserName();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void startGame(int gameNumber) {
        switch (gameNumber) {
            case 1:
                greeetings();
                break;
            case 2:
                String name2 = greeetings();
                Even.gameplay(name2);
                break;
            case 3:
                String name3 = greeetings();
                Calc.gameplay(name3);
                break;
            case 4:
                String name4 = greeetings();
                GCD.gameplay(name4);
                break;
            case 5:
                String name5 = greeetings();
                Progression.gameplay(name5);
                break;
            case 6:
                String name6 = greeetings();
                Prime.gameplay(name6);
                break;
            case 0:
                System.out.println("Good bye !");
                break;
            default:
                System.out.println("incorrect input");
                break;
        }
    }
}
