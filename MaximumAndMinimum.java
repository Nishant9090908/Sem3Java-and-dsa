// Program to find te maximum and minimum element if an array

import java.util.Scanner;
public class MaximumAndMinimum {
    public static void main(String[]args){
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt(); // size of the array
        System.out.println("Size of the array: "+size);

        int[] arr = new int[size];// initializing the array
        System.out.println("Enter "+size+" Elements");
        for(int i=0; i<size; i++){ // loop to take the input of elements
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for(int i=0; i<size; i++) { // printing the elements of an array
            System.out.println(arr[i]);
        }
        //to find the maximum element of the array
        int max = arr[0];
        for(int i=1; i<size; i++){
            if(arr[i]>max){
                max = arr[i];// max ele
            }


        }
        //to find the minimum element of the array
        int min = arr[0];
        for(int i=1; i<size; i++){
            if(arr[i]<min){
                min = arr[i];// min ele
            }
        }
        System.out.println("Maximum element of the array: " + max);
        System.out.println("Minimum element of the array: " + min);

    }
}

