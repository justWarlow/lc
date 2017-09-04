class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int low = 0, high = nums.length;
        return sortedArrayToBST(nums, low, high);
    }
    
    public TreeNode sortedArrayToBST(int[] nums, int low, int high) {
        TreeNode treeHead = null;
        if(low < high) {
            int mid = low + (high-low)/2;
            treeHead = new TreeNode(nums[mid]);
            treeHead.left = sortedArrayToBST(nums, low, mid);
            treeHead.right = sortedArrayToBST(nums, mid+1, high);
        } 
        return treeHead;
    }
}

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length ==0 || nums.length == 1){
            return false;
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
