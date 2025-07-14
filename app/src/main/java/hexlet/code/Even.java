package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = Cli.getUserName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (int i = 0; i < 3; i++) {
            int randomNumber = 1 + (int) (Math.random() * 100);
            System.out.println("Question: " + Integer.toString(randomNumber)); ;
            String userAnswer = scanner.nextLine();
            if (isEven(randomNumber)) {
                if (userAnswer.equals("yes")) {
                    System.out.println("Correct!");
                } else if (!userAnswer.equals("yes")) {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + name);
                    return;
                }
            }
            else if (!isEven(randomNumber)) {
                if (userAnswer.equals("no")) {
                    System.out.println("Correct!");
                } else if (!userAnswer.equals("no")) {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + name);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

