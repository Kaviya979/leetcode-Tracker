// Last updated: 09/07/2026, 15:06:05
class Solution {
    public int differenceOfSum(int[] nums) {
    int ele = 0; 
    int digit = 0;
    for(int x:nums){
        ele+=x;
        while(x!=0){
            digit+=x%10;
            x/=10;
        } 
    }
        return Math.abs(ele-digit);
    }  
 }
