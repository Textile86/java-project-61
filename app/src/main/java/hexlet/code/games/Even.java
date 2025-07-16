package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.ROUNDS;

public class Even {
    private static final int MAX_NUMBER = 100;

    public static void gameplay(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ROUNDS; i++) { // play 3 rounds
            int randomNumber = 1 + (int) (Math.random() * MAX_NUMBER); // generate int from 1 to 100
            System.out.println("Question: " + Integer.toString(randomNumber));
            String userAnswer = scanner.nextLine();
            String correctAnswer;
            if (isEven(randomNumber)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            }
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was "
                    + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + name  + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

