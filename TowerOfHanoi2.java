public class TowerOfHanoi2 {

    static class Move {
        int disk;
        char fromRod, toRod;

        Move(int disk, char fromRod, char toRod) {
            this.disk = disk;
            this.fromRod = fromRod;
            this.toRod = toRod;
        }
    }

    // Function to move disks iteratively
    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        int totalMoves = (int) (Math.pow(2, n) - 1);

        // Swap destination and auxiliary for even number of disks
        if (n % 2 == 0) {
            char temp = toRod;
            toRod = auxRod;
            auxRod = temp;
        }

        for (int i = 1; i <= totalMoves; i++) {
            if (i % 3 == 1) {
                moveDisk(fromRod, toRod);
            } else if (i % 3 == 2) {
                moveDisk(fromRod, auxRod);
            } else if (i % 3 == 0) {
                moveDisk(auxRod, toRod);
            }
        }
    }

    // Utility function to print the move
    static void moveDisk(char from, char to) {
        System.out.println("Move disk from " + from + " to " + to);
    }

    public static void main(String[] args) {
        int n = 10; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B'); // A=Source, C=Destination, B=Auxiliary
    }
}
