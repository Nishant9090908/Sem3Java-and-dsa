public class SumOfElements {
    public static void main(String[] args) {
        int[] arrr = {1,2,3,4,5};
        int sum = 0;
        for (int i=0; i<arrr.length; i++){
            sum = arrr[i]+sum;
        }
        System.out.println(sum);
    }
}
