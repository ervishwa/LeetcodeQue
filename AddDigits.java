package LeetcodeQue;

import java.util.Scanner;

public class AddDigits {

    static int adddigits(int num){
        int n =(int) num / 10 ;
        if(n==0){
            return num ;
        }else{
            int p = num ;
            int sum = 0;
            while(p!=0){
                //System.out.println(p);
                int q = p % 10 ;
                sum += q;
                p = (int)p / 10;
            }
            //System.out.println(sum);

            if((int)sum/10!=0){
                //System.out.print("re");
                return adddigits(sum);
            }
            return sum;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int  n  =  sc.nextInt();

        int ans = adddigits(n);

        System.out.print(ans);
    }
}

//one  more better approach  Sc O(1)   Tc O(1)

//class Solution {
//    public int addDigits(int num) {
//        if(num == 0) return 0;
//        else if(num % 9 == 0) return 9;
//        else return num % 9;
//    }
//}
