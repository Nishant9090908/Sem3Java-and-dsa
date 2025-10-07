import java.util.Arrays;

public class Main6 {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.println("Original Array: "+ Arrays.toString(arr));

        int[] arr2 = new int[n+1];
        int idx = 3;
        for(int i=0; i<idx; i++){
            arr2[i] = arr[i];
        }


        for(int i=idx; i<n+1; i++){
            arr2[i] = arr[i-1];
            arr2[idx] = 100;
        }
        System.out.println("Array after adding 100 aat index 2: "+ Arrays.toString(arr2));


    }
}
