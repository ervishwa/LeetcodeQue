package LeetcodeQue;
import java.util.*;
import java.io.*;


//approach -1 (using ArrayList)
public class LastStoneWeight {


    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

       ArrayList<Integer>array = new ArrayList<>();

       int n = sc.nextInt();

        for(int i =0;i<n;i++){
            array.add(sc.nextInt());
        }

        int ans = 0;


      System.out.print(array);
      //System.out.print(array.get(6));
        while(array.size() > 1){
            Collections.sort(array);
           int Y = array.get(array.size()-1);
           int X = array.get(array.size()-2);

           if(X==Y){
               array.remove(array.size()-1);
               array.remove(array.size()-1);
           }else{
               array.remove(array.size()-1);
               array.remove(array.size()-1);
               array.add(Y-X);
           }
        }
        if(array.size()==1){
            ans = array.get(0);
        }

        System.out.print(ans);

    }
}
