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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Helper(root, ans, 0);
        return ans;
    }
    
        private void Helper(TreeNode node, List<List<Integer>> list, int depth) {
	if (node == null) {
        return;
    }

	if (depth == list.size()) {
	    list.add(new ArrayList<>());
	}
	list.get(depth).add(node.val);
	Helper(node.left, list, depth + 1);
	Helper(node.right, list, depth + 1);
    }
}