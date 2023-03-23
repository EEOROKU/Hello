import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("You didn't enter a name.");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        scanner.close();
    }

}
