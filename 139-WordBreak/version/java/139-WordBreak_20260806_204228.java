// Last updated: 06/08/2026, 20:42:28
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(candidates);
5
6        backtrack(candidates, target, 0, new ArrayList<>(), result);
7
8        return result;
9    }
10
11    private void backtrack(int[] candidates, int target, int start,
12                           List<Integer> current,
13                           List<List<Integer>> result) {
14
15        if (target == 0) {
16            result.add(new ArrayList<>(current));
17            return;
18        }
19
20        for (int i = start; i < candidates.length; i++) {
21
22            // Skip duplicates
23            if (i > start && candidates[i] == candidates[i - 1]) {
24                continue;
25            }
26
27            if (candidates[i] > target) {
28                break;
29            }
30
31            current.add(candidates[i]);
32
33            // i + 1 because each number can be used only once
34            backtrack(candidates, target - candidates[i], i + 1, current, result);
35
36            current.remove(current.size() - 1);
37        }
38    }
39}