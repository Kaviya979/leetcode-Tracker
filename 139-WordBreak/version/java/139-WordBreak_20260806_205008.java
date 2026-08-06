// Last updated: 06/08/2026, 20:50:08
1class Solution {
2    private int postIndex;
3    private Map<Integer, Integer> map = new HashMap<>();
4
5    public TreeNode buildTree(int[] inorder, int[] postorder) {
6        postIndex = postorder.length - 1;
7
8        for (int i = 0; i < inorder.length; i++) {
9            map.put(inorder[i], i);
10        }
11
12        return build(inorder, postorder, 0, inorder.length - 1);
13    }
14
15    private TreeNode build(int[] inorder, int[] postorder, int left, int right) {
16        if (left > right) {
17            return null;
18        }
19
20        int rootValue = postorder[postIndex--];
21        TreeNode root = new TreeNode(rootValue);
22
23        int index = map.get(rootValue);
24
25        // Build right subtree first
26        root.right = build(inorder, postorder, index + 1, right);
27        root.left = build(inorder, postorder, left, index - 1);
28
29        return root;
30    }
31}