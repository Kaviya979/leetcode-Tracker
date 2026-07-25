// Last updated: 25/07/2026, 16:23:25
1class Solution {
2    public int returnToBoundaryCount(int[] nums) {
3
4        int position = 0;
5        int count = 0;
6
7        for (int num : nums) {
8            position += num;
9
10            if (position == 0) {
11                count++;
12            }
13        }
14
15        return count;
16    }
17}