import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
     Scanner console = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int first = Integer.parseInt(console.nextLine());

        System.out.print("Enter the second value: ");
        int second = Integer.parseInt(console.nextLine());

        System.out.print("Enter the third value: ");
        int third = Integer.parseInt(console.nextLine());

        // 1. Add decisions statements to determine if first, second, and third are in order.
        // 2. Print messages for both ordered and unordered cases.

        if (first < second && second < third) {
            System.out.println("Your numbers are in ascending order");
        } else if (first > second && second > third) {
            System.out.println("Your numbers are in descending order");
        } else {
            System.out.println("Your numbers are not in order");
        }
    }
}
