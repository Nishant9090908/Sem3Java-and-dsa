// write a program to reverse an array using a temporary third variable  or the swapping method

public class ReversingAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse using temporary variable
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];             // temporary variable
            arr[i] = arr[n - 1 - i];       // swap
            arr[n - 1 - i] = temp;
        }

        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}