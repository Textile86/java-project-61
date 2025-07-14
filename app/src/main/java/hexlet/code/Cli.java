package hexlet.code;
import java.util.Scanner;

public class Cli {
    static Scanner scanner = new Scanner(System.in);

    public static String getUserName() {
        return scanner.nextLine();
    }

    public static int getGameNumber() {
        return scanner.nextInt();
    }

}
