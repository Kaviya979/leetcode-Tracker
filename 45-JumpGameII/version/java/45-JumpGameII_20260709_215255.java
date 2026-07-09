// Last updated: 09/07/2026, 21:52:55
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> subsets(int[] nums) {
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        backtrack(nums, 0, new ArrayList<>(), result);
9
10        return result;
11    }
12
13    private void backtrack(int[] nums, int index, 
14                           List<Integer> current,
15                           List<List<Integer>> result) {
16
17        // Add current subset
18        result.add(new ArrayList<>(current));
19
20        // Generate remaining subsets
21        for (int i = index; i < nums.length; i++) {
22
23            // Include nums[i]
24            current.add(nums[i]);
25
26            // Move to next element
27            backtrack(nums, i + 1, current, result);
28
29            // Backtrack (remove last element)
30            current.remove(current.size() - 1);
31        }
32    }
33}