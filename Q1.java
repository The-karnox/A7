import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int N = sc.nextInt(); // size of array
        int[] arr = new int[N]; // create an array of size N

        // fill the array with random values
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(100);
        }

        // calculate the sum and average
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / N;

        // print the array, sum, and average
        System.out.print("Array: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + avg);
    }
}
