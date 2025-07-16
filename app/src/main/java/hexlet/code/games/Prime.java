package hexlet.code.games;

import java.util.Scanner;

public class Prime {
    public static void gameplay(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) { // play 3 rounds
            int randomNumber = 1 + (int) (Math.random() * 50); // generate int from 1 to 50
            System.out.println("Question: " + Integer.toString(randomNumber));
            String userAnswer = scanner.nextLine();
            String correctAnswer;
            if (isPrime(randomNumber)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            }
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was " + "'"
                    + correctAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= (int) (Math.sqrt(number)); i++) {
            if (number == 1) {
                return false;
            }
            if (number == 2) {
                return true;
            }
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

