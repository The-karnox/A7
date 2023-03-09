import java.util.*;
public class Q12 {

    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos]< arr[j]) {
                   minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter ten double numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
         selectionSort(arr);

         System.out.println("Sorted numbers:");
         for (int i = 0; i < 10; i++) {
             System.out.print(arr[i] + " ");
         }
 
         sc.close();
     }
    
}
