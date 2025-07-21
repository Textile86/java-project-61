package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static final int PROGRESSION_GAME = 5;
    private static final int MAX_LENGTH_FROM = 5;
    private static final int MAX_LENGTH_TO = 6;
    private static final int MAX_START = 20;
    private static final int MAX_STEP = 10;
    private static final String QUESTION = "What number is missing in the progression?";



    public static String generateProgression(int start, int step, int length) {
        int secretIndex = (int) (Math.random() * length);
        String progression = "";
        int rightAnswer = 0;
        for (int i = 0; i <= length; i++) {
            if (i == secretIndex) {
                progression = progression + " ..";
                rightAnswer = i * step + start;
            } else {
                progression = progression + " " + Integer.toString(i * step + start);
            }
        }
        progression = progression + " " + Integer.toString(rightAnswer);
        return progression;
    }

    public static void gameplay() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int start = 1 + (int) (Math.random() * MAX_START);
            int step = 1 + (int) (Math.random() * MAX_STEP);
            int length = MAX_LENGTH_FROM + (int) (Math.random() * MAX_LENGTH_TO);
            String firstProgression = generateProgression(start, step, length);
            String[] progressionWithAnswer = firstProgression.split(" ");
            String rightAnswer = progressionWithAnswer[progressionWithAnswer.length - 1];
            String[] correctProgression =
                    Arrays.copyOfRange(progressionWithAnswer, 1, progressionWithAnswer.length - 1);
            String finalProg = "";
            for (String str : correctProgression) {
                finalProg = finalProg + " " + str;
            }
            rounds[i][0] = finalProg.trim();
            rounds[i][1] = rightAnswer;
        }

        Engine.start(QUESTION, rounds);
    }
}
