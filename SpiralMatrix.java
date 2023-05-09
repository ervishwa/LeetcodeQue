package LeetcodeQue;
import java.util.*;
import java.io.*;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom = m-1;

        while(left<=right && top<=bottom){

            for(int i = left ; i <= right ; i++){
                ans.add(matrix[top][i]);
            }
            top++;


            for(int i = top ; i <= bottom ; i++){
                ans.add(matrix[i][right]);
            }
            right--;


            if(top<=bottom){
                for(int i = right ; i >= left ; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i = bottom ; i>= top ; i--){
                    ans.add(matrix[i][left]);
                }
                left ++;
            }
        }
        return ans;

    }
}
