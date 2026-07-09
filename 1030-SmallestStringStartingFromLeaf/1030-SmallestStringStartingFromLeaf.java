// Last updated: 09/07/2026, 15:07:11
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    String ans = "~"; // أكبر من أي 

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }

    private void dfs(TreeNode node, StringBuilder path) {
        if (node == null) return;

        path.insert(0, (char)('a' + node.val));

        if (node.left == null && node.right == null) {
            String s = path.toString();
            if (s.compareTo(ans) < 0) {
                ans = s;
            }
        }

        dfs(node.left, path);
        dfs(node.right, path);

        path.deleteCharAt(0); 
    }
}