package hexlet.code.games;


import java.util.Scanner;

public class GCD {
    public static void gameplay(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            int leftInt = (int) (Math.random() * 20);
            int rightInt = (int) (Math.random() * 20);
            System.out.println("Question: " + Integer.toString(leftInt) + " " + Integer.toString(rightInt));
            int rightAnswer = 0;
            int remainder = 1;
            if (rightInt == 0) {
                rightAnswer = leftInt;
            } else if (leftInt == 0) {
                rightAnswer = rightInt;
            } else {
                while (remainder != 0) {
                    remainder = leftInt % rightInt;
                    leftInt = rightInt;
                    rightInt = remainder;
                    rightAnswer = leftInt;
                }
            }

            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(Integer.toString(rightAnswer))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was \n"
                    + "'" + rightAnswer + "'");
                System.out.println("Let's try again, " + name  + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

