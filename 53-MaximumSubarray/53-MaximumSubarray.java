// Last updated: 09/07/2026, 15:11:00
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            if(currSum>maxSum)
            maxSum=currSum;
            if(currSum < 0)
            currSum = 0;

        }
        return maxSum;
    }
}