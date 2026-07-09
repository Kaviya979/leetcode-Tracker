// Last updated: 09/07/2026, 15:05:36
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle = nums[nums.length / 2];
        int count = 0;
        for(int num:nums){
            if(num == middle){
                count++;
            }
                
        }
        return count == 1;
        
    }
}