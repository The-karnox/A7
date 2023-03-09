import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = null;
        int choice = 0;

        while (choice != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Create an array of N integers");
            System.out.println("2. Display the array elements");
            System.out.println("3. Insert an element at specific position");
            System.out.println("4. Delete an element at a given position");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    int size = sc.nextInt();
                    arr = new int[size];
                    System.out.println("Array of size " + size + " created successfully!");
                    break;

                case 2:
                    if (arr == null) {
                        System.out.println("Array not created yet!");
                    } else {
                        System.out.print("Array elements are: ");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    break;

                case 3:
                    if (arr == null) {
                        System.out.println("Array not created yet!");
                    } else {
                        System.out.print("Enter the position where you want to insert the element: ");
                        int pos = sc.nextInt();
                        if (pos < 1 || pos > arr.length + 1) {
                            System.out.println("Invalid position! Please enter a position between 1 and " + (arr.length + 1));
                        } else {
                            System.out.print("Enter the element to be inserted: ");
                            int element = sc.nextInt();
                            int[] newArr = new int[arr.length + 1];
                            for (int i = 0; i < pos - 1; i++) {
                                newArr[i] = arr[i];
                            }
                            newArr[pos - 1] = element;
                            for (int i = pos; i <= arr.length; i++) {
                                newArr[i] = arr[i - 1];
                            }
                            arr = newArr;
                            System.out.println("Element inserted successfully!");
                        }
                    }
                    break;

                case 4:
                    if (arr == null) {
                        System.out.println("Array not created yet!");
                    } else {
                        System.out.print("Enter the position of the element to be deleted: ");
                        int pos = sc.nextInt();
                        if (pos < 1 || pos > arr.length) {
                            System.out.println("Invalid position! Please enter a position between 1 and " + arr.length);
                        } else {
                            int[] newArr = new int[arr.length - 1];
                            for (int i = 0; i < pos - 1; i++) {
                                newArr[i] = arr[i];
                            }
                            for (int i = pos; i < arr.length; i++) {
                                newArr[i - 1] = arr[i];
                            }
                            arr = newArr;
                            System.out.println("Element deleted successfully!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a choice between 1 and 5.");
                    break;
            }
        }

        sc.close();
    }
}
