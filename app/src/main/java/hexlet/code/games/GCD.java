package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int MAX_LEFTINT = 20;
    private static final int MAX_RIGHTINT = 20;
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    public static final int GCD_GAME = 4;
    public static void gameplay() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int leftInt = (int) (Math.random() * MAX_LEFTINT); // generate int from 0 to 20
            int rightInt = (int) (Math.random() * MAX_RIGHTINT); // generate int from 0 to 20
            int rightAnswer = 0;
            int remainder = 1;
            int initalLeftInt = leftInt;
            int initalRightInt = rightInt;
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
            rounds[i][0] = Integer.toString(initalLeftInt) + " " + Integer.toString(initalRightInt);
            rounds[i][1] = Integer.toString(rightAnswer);
        }

        Engine.start(QUESTION, rounds);
    }
}

