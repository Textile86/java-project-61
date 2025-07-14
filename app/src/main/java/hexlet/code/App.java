package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit\n");
        System.out.println("Your choice: ");
        int game = Cli.getGameNumber();

        Cli.scanner.nextLine();

        if (game == 1) {
            System.out.println("Welcome to the Brain Games!\nMay I have your name?");
            String name = Cli.getUserName();
            System.out.println("Hello, " + name + "!");
        }

        if(game == 2) {
            Even.gameplay();
        }
    }
}
