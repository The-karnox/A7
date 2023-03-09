import java.util.Scanner;

public class Q6 {
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

        // Reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Display the reversed array
        System.out.print("The reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
