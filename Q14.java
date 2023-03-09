import java.util.Arrays;
import java.util.Random;

public class Q14 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        int key = rand.nextInt(100);

        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Estimate execution time of linearSearch
        long startTime = System.nanoTime();
        int index = linearSearch(arr, key);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        if (index != -1) {
            System.out.println("Linear search found the key at index " + index + ".");
        } else {
            System.out.println("Linear search did not find the key.");
        }
        System.out.println("Linear search took " + duration + " nanoseconds.");

        // Sort the array and estimate execution time of binarySearch
        Arrays.sort(arr);
        startTime = System.nanoTime();
        index = Arrays.binarySearch(arr, key);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        if (index >= 0) {
            System.out.println("Binary search found the key at index " + index + ".");
        } else {
            System.out.println("Binary search did not find the key.");
        }
        System.out.println("Binary search took " + duration + " nanoseconds.");
    }

    public static int linearSearch(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
