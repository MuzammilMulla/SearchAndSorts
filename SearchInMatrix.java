import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {

        int[][] arr = {
                {-1, -2, 1, 2, 3},
                {4, 5, 6, 7},
                {10, 12, 546}
        };
        int target = -2;  //target to find
        int[] ans = search(arr, target);
        System.out.println("index of the target in [row, column] format" + Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {           // to iterate through the rows
            for (int col = 0; col < arr[row].length; col++) {  // to iterate through the columns
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};   // if target not found
    }
}


