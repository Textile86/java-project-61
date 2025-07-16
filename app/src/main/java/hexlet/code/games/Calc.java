package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import static hexlet.code.Engine.ROUNDS;

public class Calc {

    private static final Random RANDOM = new Random();
    private static final int MAX_LEFTINT = 20;
    private static final int MAX_RIGHTINT = 20;

    public static int getRandom(int length) {
        return RANDOM.nextInt(length);
    }

    public static void gameplay(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < ROUNDS; i++) { // play 3 rounds
            int leftInt = 1 + (int) (Math.random() * MAX_LEFTINT); // generate int from 1 to 20
            int rightInt = 1 + (int) (Math.random() * MAX_RIGHTINT); // generate int from 1 to 20
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
