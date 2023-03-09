import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];

        // Input 10 numbers into the array
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextDouble();
        }

        // Find the smallest element in the array
        double min = findSmallestElement(arr);

        // Display the minimum value
        System.out.printf("The minimum value is %.2f.\n", min);
    }

    public static double findSmallestElement(double[] arr) {
        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
