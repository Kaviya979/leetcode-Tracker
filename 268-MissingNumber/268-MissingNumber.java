// Last updated: 09/07/2026, 15:08:29
class Solution {
    public int missingNumber(int[] nums) {
        int xOr= 0;
    for(int i=0;i<=nums.length;i++){
       xOr=xOr^i;
    }
    for(int x:nums){
        xOr=xOr^x;
    }
    return xOr;
 }
}