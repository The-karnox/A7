import java.util.*;

public class Q9 {

    public static double Mean(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double Deviation(double[] arr, double mean) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow((arr[i] - mean), 2);
        }
        return Math.sqrt(sum / arr.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextDouble();
        }

        double mean = Mean(arr);
        System.out.println("Mean: " + mean);

        double deviation = Deviation(arr, mean);
        System.out.println("Standard Deviation: " + deviation);

        sc.close();
    }

  
}

