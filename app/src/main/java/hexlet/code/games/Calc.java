package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MAX_LEFTINT = 20;
    private static final int MAX_RIGHTINT = 20;
    private static final String QUESTION = "What is the result of the expression?";

    public static void gameplay() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int leftInt =  Utils.generateInt(MAX_LEFTINT);
            int rightInt = Utils.generateInt(MAX_RIGHTINT);
            char operation = operator();
            int result = expressionCalculation(leftInt, rightInt, operation);
            rounds[i][0] = Integer.toString(leftInt) + " " + operation + " "
                    + Integer.toString(rightInt);
            rounds[i][1] = Integer.toString(result);
        }
        Engine.start(QUESTION, rounds);
    }

    private static char operator() {
        char[] operations = {'+', '-', '*'};
        int index = Utils.randInt(operations.length);
        return operations[index];
    }

    public static int expressionCalculation(int leftInt, int rightInt, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                return leftInt + rightInt;
            case '-':
                return leftInt - rightInt;
            case '*':
                return leftInt * rightInt;
            default:
                System.out.println("Error. Wrong operation symbol: " + operation);
                break;
        }
        return result;
    }
}
