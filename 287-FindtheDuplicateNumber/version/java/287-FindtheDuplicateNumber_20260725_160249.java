// Last updated: 25/07/2026, 16:02:49
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = nums[0];
4        int fast = nums[0];
5
6        // Step 1: Find the meeting point
7        do {
8            slow = nums[slow];
9            fast = nums[nums[fast]];
10        } while (slow != fast);
11
12        // Step 2: Find the entrance to the cycle
13        slow = nums[0];
14        while (slow != fast) {
15            slow = nums[slow];
16            fast = nums[fast];
17        }
18
19        return slow;
20    }
21}