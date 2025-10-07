//Q.7. You are given an integer n. You have to print all numbers from 1 to n using recursion only.
public class NaturalNumbers {

    static void natural(int n){
        if(n == 0)
            return;

        natural(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
       int n = 5;
       natural(n);
    }
}

