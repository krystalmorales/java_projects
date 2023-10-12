import java.util.Random;

public class Exercise12 {

    public static void main(String[] args) {
        int[] values = makeRandomArray();

        // 1. Count the number of positive and non-positive elements in `values`.
        int posCount = 0;
        int negCount = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
              posCount++;
            } else {
            negCount++;
            }
        }
        
        // 2. Create two new int[]s, one for positive elements and one for non-positive.
        // (We count first to determine the capacity to allocate.)
        int[] posIntArray = new int[posCount];
        int[] negIntArray = new int[negCount];

        // 3. Loop through `values` a second time. If an element is positive, add it to the positive array.
        // If it is non-positive, add it to the non-positive array.
        int posIndex = 0;
        int negIndex = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
              posIntArray[posIndex] = values[i];
              posIndex++;
            } else {
              negIntArray[negIndex] = values[i];
              negIndex++;
            }
        }
        // 4. Confirm that your secondary arrays are properly populated either by debugging or printing their elements.
        for (int i = 0; i < posIntArray.length; i++) {
            System.out.println("Positive array:" + posIntArray[i]);
        }
        for (int i = 0; i < negIntArray.length; i++) {
            System.out.println("Negative array:" + negIntArray[i]);
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
