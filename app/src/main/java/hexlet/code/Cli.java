package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void greet() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = SCANNER.nextLine();
        System.out.println("Hello, " + name + "!");
    }
    public static void exit() {
        System.out.println("Goodbye !");
    }
}
