import java.util.Random;
import java.util.Arrays;

public class Exercise15 {

    public static void main(String[] args) {
        int[] one = makeRandomArray();
        int[] two = makeRandomArray();

        // 1. Create a new int[] with room enough for all elements in `one` and `two`.
        int[] combined = new int[one.length + two.length];

        // 2. Copy elements from `one` into the beginning of the array.
        System.arraycopy(one, 0, combined, 0, one.length);

        // 3. Copy elements from `two` at the end of the array.
        System.arraycopy(two, 0, combined, one.length, two.length);

        // 4. Print the results to confirm that it worked.
        System.out.println("Combined array:");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(combined[i]);
        }
    }

    public static int[] makeRandomArray() {
        Random random = new Random();
        int[] result = new int[random.nextInt(100) + 50];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(1000) - 500;
        }
        return result;
    }
}
