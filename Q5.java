import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        // Create an array of size n and input n elements into it
        int[] arr = new int[n];
        System.out.printf("Enter %d elements: ", n);
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Find the second largest value in the array
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.printf("The second largest value in the array is %d.\n", secondLargest);
    }
}
