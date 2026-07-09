// Last updated: 09/07/2026, 21:55:04
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        int k = 0;
5
6        for (int num : nums) {
7            if (k < 2 || num != nums[k - 2]) {
8                nums[k] = num;
9                k++;
10            }
11        }
12
13        return k;
14    }
15}