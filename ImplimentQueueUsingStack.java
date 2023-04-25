package LeetcodeQue;
import java.util.*;
import java.io.*;

public class ImplimentQueueUsingStack {
    class MyQueue {
        Stack<Integer>s1 ;
        Stack<Integer>s2 ;
        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            s1.add(x);

        }

        public int pop() {
            while(!s1.isEmpty()){
                s2.add(s1.pop());
            }
            int ans = s2.pop();
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
            return ans;
        }

        public int peek() {
            while(!s1.isEmpty()){
                s2.add(s1.pop());
            }
            int ans = s2.peek();
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
            return ans;

        }

        public boolean empty() {
            if(s1.isEmpty() && s2.isEmpty()) return true;
            else return false;
        }
    }
}
