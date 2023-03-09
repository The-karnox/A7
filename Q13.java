import java.util.*;

public class Q13 {

    public static boolean isSorted(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (Double.parseDouble(arr[i]) > Double.parseDouble(arr[i+1])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a list of numbers:");
        String input = sc.nextLine();
        String[] arr = input.split(" ");

        boolean sorted = isSorted(arr);

        if (sorted) {
            System.out.println("The list is sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }

        sc.close();
    }

   
}
