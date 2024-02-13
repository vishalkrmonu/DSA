class Solution {
    public int uniquePaths(int m, int n) {
        // if(n==1 || m==1){
        //     return 1;
        // }
        // else{
        //     return uniquePaths(n-1,m) + uniquePaths(n,m-1);
        // }
        int[][] M = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0)
                M[i][j]=1;
                else
                M[i][j]=M[i-1][j]+M[i][j-1];
            }
        }
        return M[m-1][n-1];
    }
}