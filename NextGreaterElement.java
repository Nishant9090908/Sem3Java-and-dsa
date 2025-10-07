// with o(n) complexity

import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25};
        int n = arr.length;
        int result[] = new int[n];

        // Stack to store array elements
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element to stack
            stack.push(arr[i]);
        }

        // Print result
        System.out.println("Element : Next Greater Element");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " --> " + result[i]);
        }
    }
}
