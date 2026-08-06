// Last updated: 06/08/2026, 20:49:19
1class Solution {
2    private int preIndex = 0;
3    private Map<Integer, Integer> map = new HashMap<>();
4
5    public TreeNode buildTree(int[] preorder, int[] inorder) {
6
7        for (int i = 0; i < inorder.length; i++) {
8            map.put(inorder[i], i);
9        }
10
11        return build(preorder, 0, inorder.length - 1);
12    }
13
14    private TreeNode build(int[] preorder, int left, int right) {
15
16        if (left > right) {
17            return null;
18        }
19
20        int rootValue = preorder[preIndex++];
21        TreeNode root = new TreeNode(rootValue);
22
23        int index = map.get(rootValue);
24
25        root.left = build(preorder, left, index - 1);
26        root.right = build(preorder, index + 1, right);
27
28        return root;
29    }
30}