// Last updated: 09/07/2026, 15:10:48
class Solution {
    public int uniquePaths(int m, int n) {
      int[][] dp = new int[m+1][n+1];
      for(int i = 0; i < m+1; i++){
        for(int j = 0; j < n+1; j++){
            dp[i][j] = -1;
        }
    }
     int ans = helper(0,0,m,n,dp);
        return ans;
}
        public int helper(int i,int j, int m,int n,int dp[][]){
         if(i >= m || j >= n)return 0;
         if(i == m - 1 && j == n - 1)return 1;
         if(dp[i][j] != -1)return dp[i][j];
         int x = helper(i+1,j,m,n,dp);
         int y = helper(i,j+1,m,n,dp);
         int result = x + y;
         dp[i][j] = result;
         return dp[i][j];
             }
      }
