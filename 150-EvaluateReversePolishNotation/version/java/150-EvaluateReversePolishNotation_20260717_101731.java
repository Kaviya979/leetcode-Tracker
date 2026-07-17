// Last updated: 17/07/2026, 10:17:31
1class Solution {
2    public List<List<Integer>> levelOrder(TreeNode root) {
3
4        List<List<Integer>> result = new ArrayList<>();
5
6        if (root == null)
7            return result;
8
9        Queue<TreeNode> queue = new LinkedList<>();
10        queue.offer(root);
11
12        while (!queue.isEmpty()) {
13
14            int size = queue.size();
15            List<Integer> level = new ArrayList<>();
16
17            for (int i = 0; i < size; i++) {
18
19                TreeNode node = queue.poll();
20                level.add(node.val);
21
22                if (node.left != null)
23                    queue.offer(node.left);
24
25                if (node.right != null)
26                    queue.offer(node.right);
27            }
28
29            result.add(level);
30        }
31
32        return result;
33    }
34}