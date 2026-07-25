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
    private int minDiff = Integer.MAX_VALUE;
    private Integer prev = null;

    public int minDiffInBST(TreeNode root) {
        check(root);
        return minDiff;
    }

    private void check(TreeNode node) {
        if (node == null) return;

        check(node.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }

        prev = node.val;
        check(node.right);
    }
}
