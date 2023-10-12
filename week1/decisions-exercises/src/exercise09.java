/*
# Exercise09

1. Add a class, `Exercise09`, to this project.
2. Add a `main` method.
3. Declare a `Scanner` variable.
4. Collect three pieces of data from the user: a minimum value, a maximum value, and an actual value.
5. Add `if/else` statements to determine if the actual value is between the min and max.
6. Print messages for both true and false cases.
*/
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(console.nextLine());

        System.out.println("Enter a smaller number:");
        int smallNumber = Integer.parseInt(console.nextLine());

        System.out.println("Enter a larger number:");
        int largeNumber = Integer.parseInt(console.nextLine());

        if (number > smallNumber && (number < largeNumber)){
            System.out.println("Your number is between " + smallNumber + " and " + largeNumber);
        } else {
            System.out.println("Your number is not between " + smallNumber + " and " + largeNumber);
        }
    }
}
