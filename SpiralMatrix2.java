package LeetcodeQue;
import java.util.*;
public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        Queue<Integer> qu = new LinkedList<>();
        int ans[][] = new int[n][n];
        int max = n * n;
        int fill = 1;
        int start = 1;

        while (fill <= max) {
            qu.add(fill);
            fill++;
        }

        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        //System.out.print(qu);
        while (!qu.isEmpty() && start <= max) {
            //System.out.print("asn");
            for (int i = left; i <= right && start <= max; i++) {
                ans[top][i] = qu.peek();
                qu.remove();
                start++;
            }
            top++;
            for (int i = top; i <= bottom && start <= max; i++) {
                ans[i][right] = qu.peek();
                qu.remove();
                start++;
            }
            right--;
            for (int i = right; i >= left && start <= max; i--) {
                ans[bottom][i] = qu.peek();
                qu.remove();
                start++;
            }
            bottom--;
            for (int i = bottom; i >= top && start <= max; i--) {
                ans[i][left] = qu.peek();
                qu.remove();
                start++;
            }
            left++;
        }

        return ans;
    }
}
