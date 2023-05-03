package LeetcodeQue;
import java.util.*;
import java.io.*;
public class FindtheDifferenceofTwoArrays {

    //my approach

    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>>ans = new ArrayList<>();
            HashSet<Integer>h1 = new HashSet<>();
            HashSet<Integer>h2 = new HashSet<>();

            for(int i = 0 ; i < nums1.length ; i++){
                h1.add(nums1[i]);
            }
            for(int i = 0 ; i < nums2.length ; i++){
                h2.add(nums2[i]);
            }
            List<Integer>l1 = new ArrayList<>();
            List<Integer>l2 = new ArrayList<>();
            for(Integer num : h1){
                if(!h2.contains(num)){
                    l1.add(num);
                }
            }

            ans.add(l1);

            for(Integer num : h2){
                if(!h1.contains(num)){
                    l2.add(num);
                }
            }
            ans.add(l2);

            return ans;





        }
    }
}
