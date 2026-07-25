// Last updated: 25/07/2026, 16:04:42
1class Solution {
2    public int missingNumber(int[] nums) {
3        int xor = nums.length;
4
5        for (int i = 0; i < nums.length; i++) {
6            xor ^= i;
7            xor ^= nums[i];
8        }
9
10        return xor;
11    }
12}