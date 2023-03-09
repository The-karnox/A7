import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int searchNum, count = 0;

        // Input 10 integers into the array
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        // Prompt the user to enter a number to search for
        System.out.print("Enter a number to search for: ");
        searchNum = input.nextInt();

        // Search for the number in the array
        for (int i = 0; i < 10; i++) {
            if (arr[i] == searchNum) {
                count++;
            }
        }

        if (count > 0) {
            System.out.printf("%d is present in the array %d time%s.\n", searchNum, count, count > 1 ? "s" : "");
        } else {
            System.out.printf("%d is not present in the array.\n", searchNum);
        }
    }
}
