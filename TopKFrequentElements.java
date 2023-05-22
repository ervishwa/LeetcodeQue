package LeetcodeQue;

public class TopKFrequentElements {
    //1 st approach

//    public int[] topKFrequent(int[] nums, int k) {
//        HashMap<Integer ,Integer>hs = new HashMap<>();
//
//
//        for(int i = 0 ;i < nums.length ;i++){
//            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
//        }
//
//        int ans[] = new int[k];
//        HashSet<Integer>hash = new HashSet<>();
//        int j = 0;
//
//        // int prev = Integer.MIN_VALUE;
//        int currElement = 0;
//        int curr = Integer.MIN_VALUE;
//
//        while(k-->0){
//            for(Integer num : hs.keySet()){
//                if(hs.get(num)>curr && !hash.contains(num)){
//                    //prev = curr;
//                    // hash.add(num);
//                    curr = hs.get(num);
//                    currElement = num;
//
//                }
//            }
//            System.out.println(currElement);
//            ans[j] = currElement;
//            hash.add(currElement);
//            curr = Integer.MIN_VALUE;
//            j++;
//
//        }
//
//
//
//        return ans ;
//    }

    //2 nd approach
}
