package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MAX_LENGTH_FROM = 5;
    private static final int MAX_LENGTH_TO = 6;
    private static final int MAX_START = 20;
    private static final int MAX_STEP = 10;
    private static final String QUESTION = "What number is missing in the progression?";

    public static String[] generateProgression(int start, int step, int length) {
        String[] progNumbers = new String[length];
        for (int i = 0; i < length; i++) {
            progNumbers[i] = Integer.toString(i * step + start);
        }
        return progNumbers;
    }

    public static void gameplay() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int start = Utils.randInt(MAX_START);
            int step = Utils.randInt(MAX_STEP) + 1;
            int length = MAX_LENGTH_FROM + Utils.randInt(MAX_LENGTH_TO);
            String[] progNumbers = generateProgression(start, step, length);
            int randomIndex = Utils.randInt(progNumbers.length);
            String answer = progNumbers[randomIndex];
            progNumbers[randomIndex] = "..";
            String question = String.join(" ", progNumbers);
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.start(QUESTION, rounds);
    }
}
