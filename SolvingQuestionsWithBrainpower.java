package LeetcodeQue;

public class SolvingQuestionsWithBrainpower {
    public long mostPoints(int[][] questions) {
        int m = questions.length;
        //   int n = questions[0].length;


        long ans[] = new long[m+1];

        for(int i = m-1 ;  i >= 0 ; i--){

            int jump = questions[i][1] + i + 1;

            if(jump > m-1)  ans[i] = questions[i][0] ;

            else ans[i]  =  questions[i][0] + ans[jump] ;

            ans[i] = Math.max(ans[i],ans[i+1]);





        }
        return ans[0];
    }
}
