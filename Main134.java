import java.util.Scanner;

public class Main134 {
    public static void main(String[]args) {
        int[][] A = {{5,6,7}, {8,9,10}, {11,12,13}};
        int s = 0;
        int count = 0;

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                int num = A[i][j];
                s+=num;
                if(num%2 == 0){
                    count++;
                }
                System.out.println(num);
            }
        }

        System.out.println("sum of all elements of 3D array: "+ s);
        System.out.println("Count of evens are: "+ count);
    }
}