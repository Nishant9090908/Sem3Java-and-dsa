//  Binary search by recursion

public class BinarySearch2 {
    static boolean binarysearch(int[] arr, int target, int start, int end){
        if (start <= end){
            int mid = (start + (end-start)/2);
            if (target > arr[mid]){
                return binarysearch(arr, target, mid+1, end);
            }else if (target < arr[mid]){
                return binarysearch(arr, target,start,mid-1);
            } else {   //(target == arr[mid])
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,3,4,7,8,56};
        int n = arr1.length;
        int target2 = 90;
        System.out.println(binarysearch(arr1, target2, 0, n-1));
    }
}
