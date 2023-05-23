package LeetcodeQue;
import java.io.*;
import java.util.*;
public class KthLargestElementinaStream {
    class KthLargest {
        ArrayList<Integer>al;
        //int nums[];
        int largest;
        public KthLargest(int k, int[] nums) {
            al = new ArrayList<>();
            for(int i = 0 ; i < nums.length ;i++){
                al.add(nums[i]);
            }
            largest = k;
        }

        public int add(int val) {
            al.add(val);
            Collections.sort(al);
            return al.get(al.size()-largest);
        }
    }
}
