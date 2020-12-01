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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int L=low;
        int R=high;
        
        return root == null ? 0 : rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R) + (root.val >= L && root.val <= R ? root.val : 0);
    }
}