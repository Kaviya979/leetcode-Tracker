// Last updated: 09/07/2026, 15:10:37
class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        return helper(n, dp);

       }
       int helper(int n ,int dp[]){
        if(n <= 2){
            dp[n] = n;
            return dp[n];
        }
            if(dp[1] != 0){
                return dp[n];
            }
            else{
        dp[n] =  helper(n - 1,dp)+helper(n - 2,dp);
       return dp [n];
            }
        }
    }
