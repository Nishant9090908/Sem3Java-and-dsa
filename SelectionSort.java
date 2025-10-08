// Selection sort program
//
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // assume current index is smallest

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // update smallest index
                }
            }

            // swap the found minimum with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}


