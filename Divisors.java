// Q.11. Find all divisors of a number.

public class Divisors {

    // Recursive method to print divisors
    public static void divisor(int n, int i) {
        if (i > n) {
            return;
        }
        if (n % i == 0) {
            System.out.print(i + " "); // Print divisor
        }
        divisor(n, i + 1); // Recursive call
    }

    public static void main(String[] args) {
        int n = 12;

        System.out.print("Divisors of " + n + " are: ");
        divisor(n, 1);
    }
}
