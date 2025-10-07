// A program to add elements to an array

//import java.util.Arrays;
//public class AdditionInArray {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5}; // Array in which we are gonna add two more elements
//        System.out.println("Original Array: "+ Arrays.toString(arr));
//
//        int[] arr1 = new int[arr.length+2]; // New array initialized with extended size
//
////        System.out.println(arr1.length);
//        // copy the elements of the original array into second array
//        for(int i=0; i<arr.length; i++){
//            arr1[i] = arr[i];
//        }
//
//        // Adding elements to the array
//        arr1[arr.length] = 6;
//        arr1[arr.length + 1] = 7;
//
//        System.out.println("New array after adding two more elements: "+Arrays.toString(arr1));
//    }
//}

import java.util.Arrays;

public class AdditionInArray {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.println("Original Array: "+ Arrays.toString(arr));

        int[] arr2 = new int[n+1];
        int idx = 3;
        for(int i=0; i<idx; i++){
            arr2[i] = arr[i];
        }


        for(int i=idx; i<n+1; i++){
            arr2[i] = arr[i-1];
            arr2[idx] = 99;
        }
        System.out.println("Array after adding 100 aat index 2: "+ Arrays.toString(arr2));


    }
}