package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void start(String question, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(question);
        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(round[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was "
                        + "'" + round[1] + "'");
                System.out.println("Let's try again, " + name  + "!");
                return;
            }
            System.out.println("Correct !");
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
