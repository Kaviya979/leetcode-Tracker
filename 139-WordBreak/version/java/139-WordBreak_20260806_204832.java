// Last updated: 06/08/2026, 20:48:32
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5
6        backtrack(nums, 0, new ArrayList<>(), result);
7
8        return result;
9    }
10
11    private void backtrack(int[] nums, int start,
12                           List<Integer> current,
13                           List<List<Integer>> result) {
14
15        result.add(new ArrayList<>(current));
16
17        for (int i = start; i < nums.length; i++) {
18
19            // Skip duplicates
20            if (i > start && nums[i] == nums[i - 1]) {
21                continue;
22            }
23
24            current.add(nums[i]);
25            backtrack(nums, i + 1, current, result);
26            current.remove(current.size() - 1);
27        }
28    }
29}