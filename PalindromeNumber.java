package LeetcodeQue;
import java.io.*;
import java.util.*;
public class PalindromeNumber {

    public static boolean chqPalindrome(int x){
        boolean ans = true;
        String inp = Integer.toString(x);
        int i = 0;
        int j = inp.length()-1;
        while(i<=j){
            if(inp.charAt(i)!=inp.charAt(j)){
                ans = false;
                break;
            }
            i++;
            j--;
        }
       return ans ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
        System.out.println(chqPalindrome(n));

    }
}
