// with o(n^2) complexity
public class NextGreaterElement2 {
    public static void main(String[] args) {
        // Input array
        int arr[] = {4, 5, 2, 25};
        int n = arr.length;

        // Result array
        int result[] = new int[n];

        // Outer loop → pick one element
        for (int i = 0; i < n; i++) {
            int nextGreater = -1; // default value if no greater element is found

            // Inner loop → search to the right of arr[i]
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j]; // found next greater
                    break; // stop after finding the first greater element
                }
            }

            // Save the result
            result[i] = nextGreater;
        }

        // Print results
        System.out.println("Element : Next Greater Element");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " --> " + result[i]);
        }
    }
}
