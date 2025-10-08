// Bubble sort program

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 11, 9, 1};

        for (int i=0; i<arr.length; i++){ // loop for no of iterations

            for (int j=0; j<arr.length-1-i; j++){ //
                int current = arr[j];
                int next = arr[j+1];
                if (current>next){
                    int temp = arr[j+1];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}