class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }
        int[] res = new int[size + 1];
        res[size - 1] = nums[size - 1];
        for (int i = size - 2; i >= 0; --i)
            res[i] = Math.max(nums[i] + res[i + 2], res[i + 1]);
        return res[0];
    }
}