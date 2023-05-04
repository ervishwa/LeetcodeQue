package LeetcodeQue;
import java.util.*;
import java.io.*;
public class Dota2Senate {
    public static String predictPartyVictory(String senate) {
        Queue<Integer>qr = new LinkedList<>();
        Queue<Integer>qd = new LinkedList<>();

        int n = senate.length();

        for(int i = 0 ; i< n ; i++){
            if(senate.charAt(i)=='R'){
                qr.add(i);
            }else{
                qd.offer(i);
            }
        }

        while(!qr.isEmpty() && !qd.isEmpty()){
            int Rid = qr.poll();
            int Did = qd.poll();

            if(Rid<Did){
                qr.offer(Rid+n);
            }else{
                qd.offer(Did+n);
            }
        }

        // if(qr.size()>qd.size()){
        //     return "Radiant";
        // }else{
        //     return "Dire";
        // }
        return (qr.size() > qd.size())? "Radiant" : "Dire";
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String arr[] = s.split("");


    }
}
