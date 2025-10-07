public class BinarySearch {
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,3,4,5,6};
        int target1 = 6;

        System.out.println(binarysearch(arr1, target1));
    }
}