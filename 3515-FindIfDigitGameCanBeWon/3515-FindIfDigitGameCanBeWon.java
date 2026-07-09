// Last updated: 09/07/2026, 15:05:40
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0, doubleSum = 0, totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
            if (num < 10) singleSum += num;
            else doubleSum += num;
        }
        
        return singleSum > totalSum - singleSum || 
               doubleSum > totalSum - doubleSum;
    }
}
