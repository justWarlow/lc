/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int left = helper(root.left);
        if (left == k-1) {
            return root.val;
        }
        if (left < k - 1) {
            return kthSmallest(root.right, k - left - 1);
        }else {
            return kthSmallest(root.left, k);
        }
    }

    private int helper(TreeNode root){
        if (root == null) {
            return 0;
        }
        return 1 + helper(root.left) + helper(root.right);
    }
}