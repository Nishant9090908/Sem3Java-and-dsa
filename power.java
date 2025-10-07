import org.w3c.dom.ls.LSOutput;

public class power {
    public static int pow(int n, int e){
        if (e == 0){
            return 1;
        }
        return n*pow(n, e-1);
    }
    public static void main(String[]args){
        System.out.println(pow(2,10));
    }
}
