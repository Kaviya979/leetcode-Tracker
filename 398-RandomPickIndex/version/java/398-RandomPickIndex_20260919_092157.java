// Last updated: 19/09/2026, 09:21:57
1import java.util.*;
2
3class Solution {
4
5    private int[] nums;
6    private Random random;
7
8    public Solution(int[] nums) {
9        this.nums = nums;
10        this.random = new Random();
11    }
12
13    public int pick(int target) {
14
15        // Store all indexes where nums[i] == target
16        ArrayList<Integer> indexes = new ArrayList<>();
17
18        for (int i = 0; i < nums.length; i++) {
19            if (nums[i] == target) {
20                indexes.add(i);
21            }
22        }
23
24        // Pick one index randomly
25        int randomIndex = random.nextInt(indexes.size());
26
27        return indexes.get(randomIndex);
28    }
29}