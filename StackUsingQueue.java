package LeetcodeQue;
import java.util.*;
import java.io.*;

public class StackUsingQueue {
    class MyStack {
        Queue<Integer>q1 ;

        public MyStack() {
            q1 = new LinkedList<>();
            // q2 = new LinkedList<>();
        }

        public void push(int x) {
            q1.add(x);
            int size = q1.size();
            while(size>1){
                q1.add(q1.remove());
                size--;
            }
        }

        public int pop() {
            return q1.remove();
        }

        public int top() {
            return q1.peek();
        }

        public boolean empty() {
            return q1.isEmpty()  ;
        }
    }
}
