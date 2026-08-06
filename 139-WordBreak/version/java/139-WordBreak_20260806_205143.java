// Last updated: 06/08/2026, 20:51:43
1class Solution {
2    public List<List<Integer>> levelOrderBottom(TreeNode root) {
3        List<List<Integer>> result = new LinkedList<>();
4
5        if (root == null) {
6            return result;
7        }
8
9        Queue<TreeNode> queue = new LinkedList<>();
10        queue.offer(root);
11
12        while (!queue.isEmpty()) {
13            int size = queue.size();
14            List<Integer> level = new ArrayList<>();
15
16            for (int i = 0; i < size; i++) {
17                TreeNode node = queue.poll();
18                level.add(node.val);
19
20                if (node.left != null)
21                    queue.offer(node.left);
22
23                if (node.right != null)
24                    queue.offer(node.right);
25            }
26
27            // Add each level at the front
28            result.add(0, level);
29        }
30
31        return result;
32    }
33}