package LeetcodeQue;
import java.util.*;
import java.io.*;
public class BulbSwitcher {
     //this method is working passing 33 out of 35 cases.. but giving mle in 34th case lets try to optimize it..
    public static int bulbSwitch(int n) {
        if(n==0){
            return 0;
        }
        int round = 0 ;
        int arr[] = new int[n];
        round++;

        //1st round
        for(int i =0;i<n;i++){
            arr[i] = 1;
        }
        round++;
        while(round<=n){
            if(round==n){
                if(arr[n-1]==0){
                    arr[n-1]=1;
                }else{
                    arr[n-1]=0;
                }
            }else if(round==2){
                for(int i=1;i<n;i+=2){
                    arr[i] = 0;
                }
            }else{
                for(int i = round-1 ; i < n ; i+=round){

                    if(arr[i]==0){
                        arr[i]= 1;

                    }else{
                        arr[i] = 0;
                    }
                }
            }
            round++;
        }

        int ans = 0 ;
        for(int i =0 ; i< n ; i++){
            if(arr[i]==1){
                ans++;
            }
        }

        return ans ;
    }
    //optimized way.
    public static int bulbSwitch2(int n) {
        return (int)Math.sqrt(n);
    }
    public static void main(String[]args){
        Scanner sc = new  Scanner(System.in);
        int  n = sc.nextInt();

        int ans = bulbSwitch(n);

        System.out.print(ans);

    }
}
