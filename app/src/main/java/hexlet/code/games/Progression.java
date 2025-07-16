package hexlet.code.games;

import java.util.Arrays;
import java.util.Scanner;

import static hexlet.code.Engine.ROUNDS;

public class Progression {
    private static final int MAX_LENGTH_FROM = 5;
    private static final int MAX_LENGTH_TO = 6;
    private static final int MAX_START = 20;
    private static final int MAX_STEP = 10;

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

    public static void gameplay(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < ROUNDS; i++) { // play 3 rounds
            String firstProgression = generateProgression();
            String[] progressionWithAnswer = firstProgression.split(" ");
            String rightAnswer = progressionWithAnswer[progressionWithAnswer.length - 1];
            String[] correctProgression =
                Arrays.copyOfRange(progressionWithAnswer, 1, progressionWithAnswer.length - 1);
            String finalProg = "";
            for (String str: correctProgression) {
                finalProg = finalProg + " " + str;
            }
            System.out.println("Question: " + finalProg.trim());
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was " + "'"
                        + rightAnswer + "'");
                System.out.println("Let's try again, " + name  + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

}
