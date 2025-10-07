//Q.5. Write a program to find fibonacci series till a number using iteration and recursion.

//public class Q5{
//    public static int rec(int n){
//        int sum = 0;
//
//        if (n == 0){
//            return 0;
//        }
//
//        if (n == 1){
//            return 1;
//        }
//
//        return rec(n-1)+rec(n-2);
//    }
//
//    public static void main(String[] args){
//        int till = 10;
//
//        int i = 0;
//        int series;
//        while(true){
//            series = rec(i);
//            if (series > till){
//                break;
//            }
//            System.out.println(series);
//            i++;
//        }
//    }
//}

//Using iteration
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value till oyu want the fibonacci series to be printed: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i=0; i<=n; i++){
            System.out.println(a + " ");
            int temp = a+b;
            a = b;
            b = temp;
        }


    }
}