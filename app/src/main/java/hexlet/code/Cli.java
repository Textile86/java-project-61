package hexlet.code;

import java.util.Scanner;

public class Cli {
    Scanner scanner = new Scanner(System.in);

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
