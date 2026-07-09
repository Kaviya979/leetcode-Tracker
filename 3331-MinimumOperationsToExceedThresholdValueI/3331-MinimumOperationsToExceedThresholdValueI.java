// Last updated: 09/07/2026, 15:05:47
class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for(int num : nums){
            if( num < k ){
                count ++;
            }
        }
          return count;
        }
    }
