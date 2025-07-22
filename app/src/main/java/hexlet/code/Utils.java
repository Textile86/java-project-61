package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int randInt(int number) {
        return RANDOM.nextInt(number);
    }

    public static int generateInt(int maxNumber) {
        return 1 + (int) (Math.random() * maxNumber);
    }
}
