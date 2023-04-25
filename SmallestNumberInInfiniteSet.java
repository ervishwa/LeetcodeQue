package LeetcodeQue;
import java.util.*;
import java.io.*;


public class SmallestNumberInInfiniteSet {
    class SmallestInfiniteSet {
        PriorityQueue<Integer>pq = null;
        Set<Integer>set = null;
        public SmallestInfiniteSet() {
            pq  = new PriorityQueue<>(1000);
            set = new HashSet<>(1000);

            for(int i = 1 ; i <= 1000 ; i++){
                pq.add(i);
                set.add(i);
            }

        }

        public int popSmallest() {
            int x = pq.poll();
            set.remove(x);
            return x;
        }

        public void addBack(int num) {
            if(!set.contains(num)){
                set.add(num);
                pq.add(num);
            }
        }
    }
    public static void main(String[]args){

    }
}
