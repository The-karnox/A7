import java.util.*;
public class Q11 {

    public static void OptimisedBubbleSort (int arr[]) {
        for(int turn = 0; turn<arr.length; turn++){
         boolean swapped = false;
         for(int j = 0; j<arr.length-1-turn; j++){
            if(arr[j]>arr[j+1]){
              //swap
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
              swapped = true;
               }
              }
           if(swapped == false){
              break; 
           }
        }
     }
    
     public static void main (String[] args){
          Scanner sc = new Scanner(System.in);

          int[] arr = new int[10];
          System.out.println("Enter ten double numbers:");
          for (int i = 0; i < 10; i++) {
              arr[i] = sc.nextInt();
          }
           OptimisedBubbleSort(arr);

           System.out.println("Sorted numbers:");
           for (int i = 0; i < 10; i++) {
               System.out.print(arr[i] + " ");
           }
   
           sc.close();
       }
}

