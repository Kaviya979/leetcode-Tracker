// Last updated: 06/08/2026, 20:54:21
1class Solution {
2    public void flatten(TreeNode root) {
3        if (root == null) {
4            return;
5        }
6
7        flatten(root.left);
8        flatten(root.right);
9
10        TreeNode left = root.left;
11        TreeNode right = root.right;
12
13        root.left = null;
14        root.right = left;
15
16        TreeNode curr = root;
17        while (curr.right != null) {
18            curr = curr.right;
19        }
20
21        curr.right = right;
22    }
23}