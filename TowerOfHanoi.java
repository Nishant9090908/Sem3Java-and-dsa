public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    static void towerOfHanoi(int n, char start, char end, char hrod) {
        // Base case: Only 1 disk left
        if (n == 1) {
            System.out.println("Move disk 1 from " + start + " to " + end);

            return;
        }

        // Step 1: Move top n-1 disks from source to auxiliary rod
        towerOfHanoi(n - 1, start, hrod, end);

        // Step 2: Move the nth disk from source to destination rod
        System.out.println("Move disk " + n + " from " + start + " to " + end);

        // Step 3: Move the n-1 disks from auxiliary to destination rod
        towerOfHanoi(n - 1, hrod, end, start );
    }

    public static void main(String[] args) {
        int n = 10; // number of disks
        towerOfHanoi(n, 'A', 'C', 'B');// A=Source, C=Destination, B=Helper
    }
}
