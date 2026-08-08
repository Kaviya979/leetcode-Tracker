// Last updated: 08/08/2026, 11:22:19
1import java.util.HashMap;
2
3class Solution {
4    public int[] twoSum(int[] nums, int target) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        for (int i = 0; i < nums.length; i++) {
9
10            int complement = target - nums[i];
11
12            if (map.containsKey(complement)) {
13                return new int[]{map.get(complement), i};
14            }
15
16            map.put(nums[i], i);
17        }
18
19        return new int[]{};
20    }
21}