class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<String>();
        DFS(root, "", res);
        return res;
    }

    public void DFS(TreeNode root, String solution, ArrayList<String> res) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            res.add(solution + root.val);
        }
        DFS(root.left, solution + root.val + "->", res);
        DFS(root.right, solution + root.val + "->", res);
    }
}