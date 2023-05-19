package LeetcodeQue;

public class IsGraphBipartite {
    public boolean dfs(int[][] graph , int[]coloArr,int node , int color){
        if(coloArr[node]!=0){
            return coloArr[node]==color;
        }
        coloArr[node] = color;

        for(int num : graph[node]){
            if(!dfs(graph,coloArr,num,-color)){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        int color[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            if(color[i]==0){
                if(!dfs(graph,color,i,1)){
                    return false;
                }
            }
            //  if(color[i]==0 && !dfs(graph,color,i,1)){
            //      return false;
            //  }
        }
        return true;
    }
}
