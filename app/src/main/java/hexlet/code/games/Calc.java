package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    private static final Random RANDOM = new Random();

    public static int getRandom(int length) {
        return RANDOM.nextInt(length);
    }

    public static void gameplay(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            int leftInt = 1 + (int) (Math.random() * 20);
            int rightInt = 1 + (int) (Math.random() * 20);
            char[] operations = {'+', '-', '*'};
            int index = getRandom(operations.length);
            System.out.println("Question: " + Integer.toString(leftInt) + " " + operations[index] + " "
                + Integer.toString(rightInt));
            int result = 0;
            switch (operations[index]) {
                case '+':
                    result = leftInt + rightInt;
                    break;
                case '-':
                    result = leftInt - rightInt;
                    break;
                case '*':
                    result = leftInt * rightInt;
                    break;
                default:
                    System.out.println("Error");
                    return;
            }
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(Integer.toString(result))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was " + "'" + result + "'");
                System.out.println("Let's try again, " + name  + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
