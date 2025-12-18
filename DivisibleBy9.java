public class DivisibleBy9 {

    public static boolean isDivisibleBy9(int n) {

        // Convert negative to positive WITHOUT Math.abs()
        if (n < 0) {
            n = -n;
        }

        int sum = 0;

        // Sum of digits
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        // Check if sum is divisible by 9
        return sum % 9 == 0;
    }

    public static void main(String[] args) {
        int num = -729;
        System.out.println(num + " divisible by 9? " + isDivisibleBy9(num));
    }
}
