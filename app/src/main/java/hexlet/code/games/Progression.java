package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static final int PROGRESSION_GAME = 5;
    private static final int MAX_LENGTH_FROM = 5;
    private static final int MAX_LENGTH_TO = 6;
    private static final int MAX_START = 20;
    private static final int MAX_STEP = 10;
    private static final String QUESTION = "What number is missing in the progression?";

    public static String generateProgression() {
        int progressionLength = MAX_LENGTH_FROM + (int) (Math.random() * MAX_LENGTH_TO); // generate int from 5 to 10
        int progressionStart = 1 + (int) (Math.random() * MAX_START); // generate int from 1 to 20
        int progressionStep = 1 + (int) (Math.random() * MAX_STEP); // generate int from 1 to 10
        int secretIndex = (int) (Math.random() * progressionLength);
        String progression = "";
        int rightAnswer = 0;
        for (int i = 0; i <= progressionLength; i++) {
            if (i == secretIndex) {
                progression = progression + " ..";
                rightAnswer = i * progressionStep + progressionStart;
            } else {
                progression = progression + " " + Integer.toString(i * progressionStep + progressionStart);
            }
        }
        progression = progression + " " + Integer.toString(rightAnswer);
        return progression;
    }

    public static void gameplay() {
        String[][] rounds = new String[App.ROUNDS][2];
        for (int i = 0; i < App.ROUNDS; i++) {
            String firstProgression = generateProgression();
            String[] progressionWithAnswer = firstProgression.split(" ");
            String rightAnswer = progressionWithAnswer[progressionWithAnswer.length - 1];
            String[] correctProgression =
                    Arrays.copyOfRange(progressionWithAnswer, 1, progressionWithAnswer.length - 1);
            String finalProg = "";
            for (String str : correctProgression) {
                finalProg = finalProg + " " + str;
            }
            rounds[i][0] = "Question: " + finalProg.trim();
            rounds[i][1] = rightAnswer;
        }

        Engine.start(QUESTION, rounds);
    }
}
