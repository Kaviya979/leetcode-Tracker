// Last updated: 25/07/2026, 16:08:12
1import java.util.Stack;
2
3/**
4 * Definition for a binary tree node.
5 * public class TreeNode {
6 *     int val;
7 *     TreeNode left;
8 *     TreeNode right;
9 *     TreeNode() {}
10 *     TreeNode(int val) { this.val = val; }
11 *     TreeNode(int val, TreeNode left, TreeNode right) {
12 *         this.val = val;
13 *         this.left = left;
14 *         this.right = right;
15 *     }
16 * }
17 */
18
19class BSTIterator {
20
21    private Stack<TreeNode> stack = new Stack<>();
22
23    public BSTIterator(TreeNode root) {
24        pushLeft(root);
25    }
26
27    private void pushLeft(TreeNode node) {
28        while (node != null) {
29            stack.push(node);
30            node = node.left;
31        }
32    }
33
34    public int next() {
35        TreeNode node = stack.pop();
36
37        if (node.right != null) {
38            pushLeft(node.right);
39        }
40
41        return node.val;
42    }
43
44    public boolean hasNext() {
45        return !stack.isEmpty();
46    }
47}