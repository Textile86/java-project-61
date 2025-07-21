package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static final int CALC_GAME = 3;
    private static final Random RANDOM = new Random();
    private static final int MAX_LEFTINT = 20;
    private static final int MAX_RIGHTINT = 20;
    public static int getRandom(int length) {
        return RANDOM.nextInt(length);
    }
    private static final String QUESTION = "What is the result of the expression?";

    public static void gameplay() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int leftInt = 1 + (int) (Math.random() * MAX_LEFTINT); // generate int from 1 to 20
            int rightInt = 1 + (int) (Math.random() * MAX_RIGHTINT); // generate int from 1 to 20
            char[] operations = {'+', '-', '*'};
            int index = getRandom(operations.length);
            System.out.println();
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
            rounds[i][0] = Integer.toString(leftInt) + " " + operations[index] + " "
                    + Integer.toString(rightInt);
            rounds[i][1] = Integer.toString(result);
        }
        Engine.start(QUESTION, rounds);
    }
}
