import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        // SWITCH OPPOSITES
        // Given a word, print its opposite using a switch statement.
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = console.nextLine();
        String opposite = null;

        // 1. Re-implement Exercise08 using a switch statement.

        switch (word.toLowerCase()) {
            case "high":
                opposite = "low";
                break;
            case "cold":
                opposite = "hot";
                break;
            case "little":
                opposite = "big";
                break;
            case "hi":
                opposite = "bye";
                break;
            case "hand":
                opposite = "foot";
                break;
            default:
                System.out.printf("I don't have an opposite for %s.%n", word);
        }
        if (opposite != null) {
            System.out.printf("The opposite of %s is %s.%n", word, opposite);
        }
    }
}
