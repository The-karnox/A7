import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }

        int pivotIndex = partition(list);
        System.out.print("After the partition, the list is ");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static int partition(int[] list) {
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;
        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }
            while (low <= high && list[high] > pivot) {
                high--;
            }
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high >= 1 && list[high] >= pivot) {
            high--;
        }
        if (pivot > list[high]) {
            list[0] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return 0;
        }
    }
}
