package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Even {
    private static final int MAX_NUMBER = 100;
    static String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void gameplay() {
        String[][] rounds = new String[App.ROUNDS][2];
        for (int i = 0; i < App.ROUNDS; i++) {
            int randomNumber = 1 + (int) (Math.random() * MAX_NUMBER);
            rounds[i][0] = "Question: " + Integer.toString(randomNumber);
            if (isEven(randomNumber)) {
                rounds[i][1] = "yes";
            } else {
                rounds[i][1] = "no";
            }
        }
        Engine.start(question, rounds);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

