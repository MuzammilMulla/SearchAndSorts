// Binary search in 1D array
public class BinarySearchIn1D {
    public static void main(String[] args) {
        int[] arr = {-92, -76, -65, 0, 32, 56, 23423, 45654};
        int target = 0; // target to search

        int ans = binarySearch(arr, target);
        System.out.println("target " + target + " index is " + ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;  // to find mid of array

            // if target is lesser than mid of the array
            if (target < arr[mid]) {
                end = mid - 1;

                // if target is greater than mid of the array
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

            // target is  mid of the array
            else {
                return mid;
            }
        }
        return -1; // if target not found return  -1
    }
}
