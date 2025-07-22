package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_NUMBER = 100;
    private static final int NEGATIVE_NUMBER = -30;
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void gameplay() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = NEGATIVE_NUMBER + Utils.randInt(MAX_NUMBER);
            rounds[i][0] = Integer.toString(randomNumber);
            rounds[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.start(QUESTION, rounds);
    }

    public static boolean isPrime(int number) {

        if (number == 1 || number < 0) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= (int) (Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

