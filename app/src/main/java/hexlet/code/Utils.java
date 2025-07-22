package hexlet.code;

import java.util.Random;

public class Utils {

    public static int randInt(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public static int generateInt(int maxNumber) {
        return 1 + (int) (Math.random() * maxNumber);
    }
}
