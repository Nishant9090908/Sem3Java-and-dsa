// Deleting the first element of an array

//import java.util.Arrays;
//public class DeletionInArray{
//    public static void main(String[]args){
//        int[] arr = {10,20,30,40,50};
//
//        System.out.println("Original Array: " +Arrays.toString(arr));
//        int[] arr2 = new int[arr.length - 1];
//
//        for(int i=1; i<arr.length; i++){
//            arr2[i-1] = arr[i];
//        }
//        System.out.println("First element removed: "+ Arrays.toString(arr2));
//    }
//}

// removing an element from an array

import java.util.Arrays;
public class DeletionInArray{
    public static void main(String[]args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int n = arr.length;
        System.out.println("Original Array: "+ Arrays.toString(arr));

         int b = 4;

        for(int i=b; i<n-1; i++){
            arr[i] = arr[i+1];
        }

        System.out.println("Array after deleting the element at index value 4 : ");
        for (int i = 0; i < n-1; i++) {
            System.out.println(arr[i]+ "  ");

        }


    }
}

//public class Main5 {
//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50,60,70,80,90,100};
//        int n = arr.length;
//
//        // Print original array
//        System.out.println("Original array:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        // Index to delete (example: delete element at index 3 → value 40)
//        int pos = 3;
//
//        if (pos < 0 || pos >= n) {
//            System.out.println("Invalid index!");
//        } else {
//            // Shift elements left
//            for (int i = pos; i < n - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            n--; // reduce size after deletion
//
//            // Print updated array
//            System.out.println("Array after deletion at index " + pos + ":");
//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}

//import java.util.Arrays;
//public class Main5 {
//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50,60,70,80,90,100};
//        int n = arr.length;
//        System.out.println("Original Array: " + Arrays.toString(arr));
//
//        int deleteIndex = 4; // delete element at index 4 (value = 50)
//
//        // Shift elements left from deleteIndex
//        for (int i = deleteIndex; i < n - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        n--; // reduce size
//
//        // Print array only till new size
//        System.out.print("Array after deleting: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]);
//            if (i < n - 1) System.out.print(", ");
//        }
//        System.out.println("]");
//    }
//}