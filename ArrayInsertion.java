//Q.1. Write a Program to insert and delete an element in 1-D arrays.

import java.util.Scanner;
import java.util.Arrays;
public class ArrayInsertion {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before insertion: "+Arrays.toString(arr));

        System.out.println("Enter the element to add in the arr array: ");
        int element = sc.nextInt();

        System.out.println("Enter the position at which you want to insert the element in arr array: ");
        int position = sc.nextInt();

        // new array
        int[] arr1 = new int[size+1];

        for (int i=0; i<position; i++){
            arr1[i] = arr[i];
        }

        arr1[position] = element;

        for(int i=position; i<size; i++){
            arr1[i+1] = arr[i];
        }

        System.out.println("new array after inserting "+element+" at "+position+" in arr array: "+Arrays.toString(arr1));
    }
}