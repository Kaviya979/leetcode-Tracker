// Last updated: 06/08/2026, 21:01:20
1class Solution {
2    public int sumNumbers(TreeNode root) {
3        return dfs(root, 0);
4    }
5
6    private int dfs(TreeNode node, int current) {
7        if (node == null)
8            return 0;
9
10        current = current * 10 + node.val;
11
12        // Leaf node
13        if (node.left == null && node.right == null)
14            return current;
15
16        return dfs(node.left, current) + dfs(node.right, current);
17    }
18}