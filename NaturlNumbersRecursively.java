
// Q.8. You are given an integer n. You have to print all numbers from 1 to n using recursion only.
public class NaturlNumbersRecursively {

    // Recursive method to print numbers from 1 to n
    public static void numbers(int n) {
        if (n == 0) {
            return; // Base case: stop when n is 0
        }
        numbers(n - 1); // Recursive call first
        System.out.print(n + " "); // Print after the recursive call
    }

    public static void main(String[] args) {
        int n = 10; // Set the value of n
        System.out.println("Numbers from 1 to " + n + " are:");
        numbers(n);
    }
}

