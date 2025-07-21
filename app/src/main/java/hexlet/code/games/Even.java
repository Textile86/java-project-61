package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static final int EVEN_GAME = 2;
    private static final int MAX_NUMBER = 100;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void gameplay() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = 1 + (int) (Math.random() * MAX_NUMBER);
            rounds[i][0] = Integer.toString(randomNumber);
            rounds[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.start(QUESTION, rounds);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

