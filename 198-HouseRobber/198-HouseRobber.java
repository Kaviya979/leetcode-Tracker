// Last updated: 09/07/2026, 15:09:06
class Solution {
    public int rob(int[] nums) {
            int n = nums.length;
            int[] dp = new int[n+1];
            Arrays.fill(dp, -1);
            int ans = helper(nums,n-1,dp);
            return ans;
        }
        int helper(int nums[], int i, int dp[]){
            if(i<0)return 0;
            if(dp[i] != -1) return dp[i];
                int take = nums[i] + helper(nums,i - 2,dp);
                int nottake = 0+helper(nums,i - 1,dp) ;
                int result = Math.max(take,nottake);
                dp[i] = result;
                return dp[i];
        }
        
    }
