package LeetcodeQue;

public class MatrixDiagonalSum {
    // 1st approach
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        int m = mat[0].length;
        int n = m;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i==j){
                    ans += mat[i][j];
                }else{
                    if(i!=j && j==n-1-i){
                        ans += mat[i][j];
                    }
                }

            }
        }
        return ans;
    }

    //second approach
    class Solution {
        public int diagonalSum(int[][] mat) {
            int sum = 0;
            for(int i=0, end=mat.length -1; i<mat.length; i++, end--) {
                sum += mat[i][i] + mat[i][end];
                if (i == end)
                    sum -= mat[i][end];
            }
            return sum;
        }
    }
}
