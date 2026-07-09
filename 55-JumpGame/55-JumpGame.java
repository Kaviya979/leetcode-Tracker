// Last updated: 09/07/2026, 15:10:58
class Solution {
    public boolean canJump(int[] nums) {
       int maxReach = 0;
       for(int i = 0;i <= nums.length;i++){
        if(i > maxReach){
            return false;
        }
        maxReach = Math.max(maxReach,i + nums[i]);
        if(maxReach >= nums.length-1){
            return true;
           }
        }
        return true;
       } 
    }
