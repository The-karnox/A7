import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] count = new int[101]; // An array to store the count of each integer
        int num;

        System.out.print("Enter integers between 1 and 100 (0 to end): ");

        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100) {
                count[num]++; // Increment the count of the entered number
            }
        } while (num != 0);

        System.out.println("Occurrences of each integer:");

        for (int i = 1; i <= 100; i++) {
            if (count[i] > 0) {
                System.out.printf("%d occurs %d time%s\n", i, count[i], count[i] > 1 ? "s" : "");
            }
        }
    }
}
