import java.util.Random;

public class Exercise16 {

    public static void main(String[] args) {
        // MERGE
        int[] one = makeRandomAscendingArray();
        int[] two = makeRandomAscendingArray();

        // 1. Create a new int[] with capacity for all elements from `one` and `two`.
        int[] merged = new int[one.length + two.length];

        // 2. Merge elements from `one` and `two` into the new array so that its values are sorted.
        int oneIndex = 0;
        int twoIndex = 0;
        int mergedIndex = 0;

        while (oneIndex < one.length && twoIndex < two.length) {
            if (one[oneIndex] < two[twoIndex]) {
                merged[mergedIndex] = one[oneIndex];
                oneIndex++;
            } else {
                merged[mergedIndex] = two[twoIndex];
                twoIndex++;
            }
            mergedIndex++;
        }

        // If there are remaining elements in `one`, add them to the merged array.
        while (oneIndex < one.length) {
            merged[mergedIndex] = one[oneIndex];
            oneIndex++;
            mergedIndex++;
        }

        // If there are remaining elements in `two`, add them to the merged array.
        while (twoIndex < two.length) {
            merged[mergedIndex] = two[twoIndex];
            twoIndex++;
            mergedIndex++;
        }

        // Print the merged array.
        System.out.println("Merged array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }
    }

    public static int[] makeRandomAscendingArray() {
        Random random = new Random();
        int[] result = new int[random.nextInt(100) + 50];
        int current = random.nextInt(11);
        for (int i = 0; i < result.length; i++) {
            result[i] = current;
            current += random.nextInt(4);
        }
        return result;
    }
}
