// Sieve of Eratosthenes:- To optimize the time complexity of the program to count the number of primes upto n
// In this approach we mark every number in the array to be prime except 0 and 1 because they are not prime
// we start from 2 and eliminate all  the multiples of it
// same with three and all that
// we do not consider the number which is already eliminated
// now we know that all the numbers of less the square of a number are already
//

public class SieveOfEratosthenes {

    public static int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        // assume all numbers are prime initially
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // mark multiples of p as not prime
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Number of primes up to " + n + " = " + countPrimes(n));
    }
}
