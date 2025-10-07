//Q.3. Write a Program to implement addition and multiplication of two 2D arrays.

public class AddAndMultiplyOf2DArray {
    public static void main(String[] args) {
        // Define two 2D arrays
        int[][] arr1 = { {1, 2}, {3, 4} };
        int[][] arr2 = { {5, 6}, {7, 8} };

        int rows = arr1.length;
        int cols = arr1[0].length;

        // Addition of two 2D arrays
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of the arrays:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        
        // Multiplication of two 2D arrays
        int[][] product = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("\nProduct of the arrays:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}

