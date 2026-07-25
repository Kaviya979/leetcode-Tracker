// Last updated: 25/07/2026, 16:03:47
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4
5        for (int num : nums) {
6            result ^= num;
7        }
8
9        return result;
10    }
11}