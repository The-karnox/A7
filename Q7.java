import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        // Convert the decimal integer to octal
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int digit = decimal % 8;
            octal.insert(0, digit);
            decimal /= 8;
        }

        // Display the octal representation of the decimal integer
        System.out.printf("The octal representation of %d is %s.\n", decimal, octal.toString());
    }
}

