// Last updated: 25/07/2026, 16:12:31
1import java.util.LinkedList;
2import java.util.Queue;
3
4/**
5 * Definition for a binary tree node.
6 * public class TreeNode {
7 *     int val;
8 *     TreeNode left;
9 *     TreeNode right;
10 *     TreeNode() {}
11 *     TreeNode(int val) { this.val = val; }
12 *     TreeNode(int val, TreeNode left, TreeNode right) {
13 *         this.val = val;
14 *         this.left = left;
15 *         this.right = right;
16 *     }
17 * }
18 */
19
20class Solution {
21    public int deepestLeavesSum(TreeNode root) {
22
23        Queue<TreeNode> queue = new LinkedList<>();
24        queue.offer(root);
25
26        int sum = 0;
27
28        while (!queue.isEmpty()) {
29
30            int size = queue.size();
31            sum = 0;
32
33            for (int i = 0; i < size; i++) {
34
35                TreeNode node = queue.poll();
36                sum += node.val;
37
38                if (node.left != null)
39                    queue.offer(node.left);
40
41                if (node.right != null)
42                    queue.offer(node.right);
43            }
44        }
45
46        return sum;
47    }
48}