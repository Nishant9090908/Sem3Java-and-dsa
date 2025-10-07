// Elements at even indices

import java.util.Scanner;

public class EvenIndeces {
    public static void main(String[]args){
        System.out.println("Enter the size of th array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements: ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]+" ");
        }
        System.out.println("Elements at even indeces are: ");
        for(int i=0; i<n; i+=2){
            System.out.println(arr[i]+" ");
        }
        sc.close();

    }
}