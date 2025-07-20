package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Prime {
    private static final int MAX_NUMBER = 100;
    static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void gameplay() {
        String[][] rounds = new String[App.ROUNDS][2];
        for (int i = 0; i < App.ROUNDS; i++) {
            int randomNumber = 1 + (int) (Math.random() * MAX_NUMBER);
            rounds[i][0] = "Question: " + Integer.toString(randomNumber);
            if (isPrime(randomNumber)) {
                rounds[i][1] = "yes";
            } else {
                rounds[i][1] = "no";
            }
        }
        Engine.start(question, rounds);
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

