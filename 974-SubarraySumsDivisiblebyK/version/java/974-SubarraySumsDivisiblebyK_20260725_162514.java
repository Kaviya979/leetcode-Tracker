// Last updated: 25/07/2026, 16:25:14
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int subarraysDivByK(int[] nums, int k) {
6
7        Map<Integer, Integer> map = new HashMap<>();
8        map.put(0, 1);
9
10        int prefixSum = 0;
11        int count = 0;
12
13        for (int num : nums) {
14
15            prefixSum += num;
16
17            int remainder = ((prefixSum % k) + k) % k;
18
19            count += map.getOrDefault(remainder, 0);
20
21            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
22        }
23
24        return count;
25    }
26}