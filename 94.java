/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode next = root;
        while (true) {
            while (next != null) {
                stack.push(next);
                next = next.left;
            }
            if (stack.size() == 0) {
                return res;
            }
            next = stack.pop();
            res.add(next.val);
            next = next.right;
        }
    }
}