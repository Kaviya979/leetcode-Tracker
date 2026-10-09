// Last updated: 09/10/2026, 20:26:26
1
2class Solution {
3    public int findPeakElement(int[] nums) {
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left < right) {
8            int mid = left + (right - left) / 2;
9
10            if (nums[mid] > nums[mid + 1]) {
11                right = mid;
12            } else {
13                left = mid + 1;
14            }
15        }
16
17        return left;
18    }
19}