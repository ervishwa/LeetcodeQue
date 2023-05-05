package LeetcodeQue;

public class MaximumNumberofVowelsinaSubstringofGivenLength {
    //it is working but giving tle i have to optimized it more..
    //102 case passed out of 106.
//    static int countVowels(String s){
//        int ans = 0;
//        //String sample = "aeiou" ;
//        char arr[] = s.toCharArray();
//        for(int i = 0 ; i < arr.length ; i++){
//            char p = arr[i] ;
//            if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u'){
//                ans++;
//            }
//        }
//        return ans ;
//    }
//    public int maxVowels(String s, int k) {
//        int ans = Integer.MIN_VALUE ;
//
//        for(int i = 0 ; i < s.length() ; i++){
//            if(i+k<=s.length()){
//                int a = countVowels(s.substring(i,i+k));
//                if(a>ans){
//                    ans = a;
//                }
//            }
//
//        }
//
//        return ans;
//    }

    //optimized one

    static int chqVowels(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return 1;
        }else{
            return 0;
        }
    }
    public int maxVowels(String s, int k) {
        int ans = 0 ;
        int currvowel = 0;

        for(int i = 0 ; i < s.length() ; i++){
            currvowel += chqVowels(s.charAt(i));
            if(i>=k){
                currvowel -= chqVowels(s.charAt(i-k));
            }

            ans = Math.max(ans,currvowel);
        }

        return ans ;
    }
}
