package hexlet.code.games;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    String progression;

    public static String generateProgression() {
        int progressionLength = 5 + (int) (Math.random() * 6);
        int progressionStart = 1 + (int) (Math.random() * 20);
        int progressionStep = 1 + (int) (Math.random() * 10);
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
        for (int i = 0; i < 3; i++) {
            String firstProgression = generateProgression();
            String[] progressionWithAnswer = firstProgression.split(" ");
            String rightAnswer = progressionWithAnswer[progressionWithAnswer.length - 1];
            String[] correctProgression =
                Arrays.copyOfRange(progressionWithAnswer, 1, progressionWithAnswer.length - 1);
            String finalProg = "";
            for (String str: correctProgression) {
                finalProg = finalProg + " " + str;
            }
            System.out.println(finalProg.trim());
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
