// Last updated: 06/08/2026, 20:31:16
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> result = new ArrayList<>();
4        backtrack(result, "", 0, 0, n);
5        return result;
6    }
7
8    private void backtrack(List<String> result, String current, int open, int close, int n) {
9        if (current.length() == 2 * n) {
10            result.add(current);
11            return;
12        }
13
14        if (open < n) {
15            backtrack(result, current + "(", open + 1, close, n);
16        }
17
18        if (close < open) {
19            backtrack(result, current + ")", open, close + 1, n);
20        }
21    }
22}