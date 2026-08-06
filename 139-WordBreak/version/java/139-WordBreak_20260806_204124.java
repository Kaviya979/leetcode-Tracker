// Last updated: 06/08/2026, 20:41:24
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(candidates, target, 0, new ArrayList<>(), result);
5        return result;
6    }
7
8    private void backtrack(int[] candidates, int target, int start,
9                           List<Integer> current,
10                           List<List<Integer>> result) {
11
12        if (target == 0) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16
17        if (target < 0) {
18            return;
19        }
20
21        for (int i = start; i < candidates.length; i++) {
22            current.add(candidates[i]);
23
24            // Use the same index because the number can be chosen again
25            backtrack(candidates, target - candidates[i], i, current, result);
26
27            current.remove(current.size() - 1);
28        }
29    }
30}