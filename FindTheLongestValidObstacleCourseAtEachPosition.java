package LeetcodeQue;
import java.util.*;
import java.io.*;
public class FindTheLongestValidObstacleCourseAtEachPosition {
    //my approach
    class Solution {
        static int makeArrayInc(int arr[]){
            Stack<Integer>st = new Stack<>();
            for(int i = 0 ; i < arr.length ; i++){
                if(i==0){
                    st.push(arr[i]);
                }else{
                    if(arr[i]>=st.peek()){
                        st.push(arr[i]);
                    }
                }
            }
            return st.size();
        }
        public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
            int n = obstacles.length ;

            int ans[] = new int[n];

            for(int i = 0 ; i < n ; i++){
                int arr[] = new int[i];
                for(int j=0 ; j<=i ; j++){
                    arr[j] = obstacles[j];
                }
                ans[i] = makeArrayInc(arr);

            }
            return ans;
        }
    }
}
