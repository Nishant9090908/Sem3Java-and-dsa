import java.util.Arrays;

public class MergedArraySorting {
    public static void main(String[] args) {
        int[] arr1 = {10, 25, 30, 35};
        int[] arr2 = {20, 31, 38, 39, 40, 50};

        // Create merged array
        int[] mergedarray = new int[arr1.length + arr2.length];

        // Copy arr1 elements
        for (int i = 0; i < arr1.length; i++) {
            mergedarray[i] = arr1[i];
        }

        // Copy arr2 elements
        for (int i = 0; i < arr2.length; i++) {
            mergedarray[arr1.length + i] = arr2[i];
        }

        System.out.println("Merged array: " + Arrays.toString(mergedarray));

        // Sort merged array (Bubble Sort)
        for (int i = 0; i < mergedarray.length; i++) {
            for (int j = 0; j < mergedarray.length - 1 - i; j++) {
                if (mergedarray[j] > mergedarray[j + 1]) {
                    int temp = mergedarray[j];
                    mergedarray[j] = mergedarray[j + 1];
                    mergedarray[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(mergedarray));
    }
}
