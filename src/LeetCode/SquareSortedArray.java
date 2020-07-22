package LeetCode;

import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] num = {-4,-1,0,3,10};
      sortedSquares(num);

    }

    public static void  sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i)
            ans[i] = A[i] * A[i];
//Below we are using Array.sort method directly to sort the array
        Arrays.sort(ans);
        System.out.println(ans);
    }
}