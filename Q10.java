import java.util.*;


public class Q10 {
    public static double[] eliminateDuplicates(double[] arr) {
        double[] temp = new double[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }
        double[] uniqueArr = new double[count];
        for (int i = 0; i < count; i++) {
            uniqueArr[i] = temp[i];
        }
        return uniqueArr;
    }

    public static double calculateMean(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double calculateDeviation(double[] arr, double mean) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow((arr[i] - mean), 2);
        }
        return Math.sqrt(sum / arr.length);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextDouble();
        }

        double[] uniqueArr = eliminateDuplicates(arr);
        double mean = calculateMean(uniqueArr);
        double deviation = calculateDeviation(uniqueArr, mean);

        System.out.println("Unique numbers: " + Arrays.toString(uniqueArr));
        System.out.println("Mean: " + mean);
        System.out.println("Standard deviation: " + deviation);

        sc.close();
    }

    
}
