package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_LEFTINT = 20;
    private static final int MAX_RIGHTINT = 20;
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    public static void gameplay() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int leftInt = Utils.generateInt(MAX_LEFTINT); // generate int from 0 to 20
            int rightInt = Utils.generateInt(MAX_RIGHTINT); // generate int from 0 to 20
            int rightAnswer = gcdCalculation(leftInt, rightInt);
            rounds[i][0] = Integer.toString(leftInt) + " " + Integer.toString(rightInt);
            rounds[i][1] = Integer.toString(rightAnswer);
        }

        Engine.start(QUESTION, rounds);
    }

    public static int gcdCalculation(int leftInt, int rightInt) {
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
        return rightAnswer;
    }
}

