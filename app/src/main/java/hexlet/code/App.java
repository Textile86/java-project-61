package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = Cli.getUserName();
        System.out.println("Hello, " + name);
    }
}
