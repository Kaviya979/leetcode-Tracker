// Last updated: 09/07/2026, 21:48:36
1class Solution {
2    public int jump(int[] nums) {
3        int jumps = 0;
4        int currentEnd = 0;
5        int farthest = 0;
6
7        for (int i = 0; i < nums.length - 1; i++) {
8            // Find the farthest position we can reach
9            farthest = Math.max(farthest, i + nums[i]);
10
11            // If we reached the end of current jump range
12            if (i == currentEnd) {
13                jumps++;
14                currentEnd = farthest;
15            }
16        }
17
18        return jumps;
19    }
20}