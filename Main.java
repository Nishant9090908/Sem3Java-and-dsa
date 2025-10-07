//Q.1. Write a Program to insert and delete an element in 1-D arrays.
//.Q.2. Write a Program to reverse an arrays.
//Q.3. Write a Program to implement addition and multiplication of two 2D arrays.
//Q.4. Write a Program to implement max and min in arrays.
//Q.5. Write a program to find fibonacci series till a number using iteration and recursion.
//Q.6. Write a program to implement Tower of Hanoi problem.
//Q.7. You are given an integer n. You have to print all numbers from 1 to n using recursion only.
// Q.9. Sum of first N natural numbers.
//Q.10. Binary to Decimal and vice versa.  // not completed
// Q.11. Find all divisors of a number.
// Q.8. You are given an integer n. You have to print all numbers from 1 to n using recursion only.


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 6, 5};
        int n = arr.length;
        int a = 19;
        boolean check = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
