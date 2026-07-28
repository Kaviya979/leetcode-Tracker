// Last updated: 28/07/2026, 22:09:18
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3
4        int[] tails = new int[nums.length];
5        int size = 0;
6
7        for(int num : nums) {
8
9            int left = 0;
10            int right = size;
11
12            while(left < right) {
13
14                int mid = left + (right - left) / 2;
15
16                if(tails[mid] < num)
17                    left = mid + 1;
18                else
19                    right = mid;
20            }
21
22            tails[left] = num;
23
24            if(left == size)
25                size++;
26        }
27
28        return size;
29    }
30}