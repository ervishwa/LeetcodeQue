package LeetcodeQue;

public class SimilarStringGroups {
    boolean chqSmilarString(String str1, String str2){
        int count = 0;
        for(int i =0 ; i< str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) count ++;


        }
        return (count==2 || count==0);
    }

    public int numSimilarGroups(String[] strs) {
        int NoOfGroup = 0;
        int n = strs.length;
        boolean vis[] = new boolean[n];

        for(int i = 0 ; i < n ; i++){
            if(vis[i]) continue;
            NoOfGroup++;
            dfs(i,strs,vis);
        }
        return NoOfGroup;
    }

    void dfs(int i , String[] strs , boolean[] vis){
        vis[i] = true;

        for(int j=0;j<strs.length;j++){
            if(vis[j]) continue;

            if(chqSmilarString(strs[i],strs[j])){
                dfs(j,strs,vis);
            }
        }
    }
}
