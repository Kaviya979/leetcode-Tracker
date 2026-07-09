// Last updated: 09/07/2026, 15:08:54
import java.util.Arrays;

class Solution {

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] a1 = new int[n - 1];
        int[] a2 = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            a1[i] = nums[i];
        }

        for (int i = 1; i < n; i++) {
            a2[i - 1] = nums[i];
        }

        int[] dp1 = new int[a1.length];
        int[] dp2 = new int[a2.length];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int ans1 = helper(a1, a1.length - 1, dp1);
        int ans2 = helper(a2, a2.length - 1, dp2);

        return Math.max(ans1, ans2);
    }

    public int helper(int[] nums, int i, int[] dp) {
        if (i < 0) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int take = nums[i] + helper(nums, i - 2, dp);
        int notTake = helper(nums, i - 1, dp);
        return dp[i] = Math.max(take, notTake);
    }
}