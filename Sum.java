// Q.9. Sum of first N natural numbers.



public class Sum {
    static int Sum(int n){
        if (n <= 1){
            return n;
        }

        return n + Sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}

//public class Q9{
//    public static void main(String[] args) {
//        int n = 5;
//        int sum = 0;
//         for (int i=0; i<=n; i++){
//              sum = sum+i;
//         }
//        System.out.println(sum);
//    }
//}