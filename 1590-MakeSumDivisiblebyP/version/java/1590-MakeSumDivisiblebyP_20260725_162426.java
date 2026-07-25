// Last updated: 25/07/2026, 16:24:26
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int minSubarray(int[] nums, int p) {
6
7        long totalSum = 0;
8
9        for (int num : nums) {
10            totalSum += num;
11        }
12
13        int remainder = (int)(totalSum % p);
14
15        if (remainder == 0) {
16            return 0;
17        }
18
19        Map<Integer, Integer> map = new HashMap<>();
20        map.put(0, -1);
21
22        int prefix = 0;
23        int minLength = nums.length;
24
25        for (int i = 0; i < nums.length; i++) {
26
27            prefix = (prefix + nums[i]) % p;
28
29            int target = (prefix - remainder + p) % p;
30
31            if (map.containsKey(target)) {
32                minLength = Math.min(minLength, i - map.get(target));
33            }
34
35            map.put(prefix, i);
36        }
37
38        return minLength == nums.length ? -1 : minLength;
39    }
40}