package hexlet.code;
import java.util.Scanner;

public class Cli {
    protected static final Scanner SCANNER = new Scanner(System.in);

    public static String getUserName() {
        return SCANNER.nextLine();
    }

    public static int getGameNumber() {
        return SCANNER.nextInt();
    }

}
