class Solution {
    int count = 0;
    
    public int findTargetSumWays(int[] nums, int S) {
        Helper(nums, S, 0);
        return count;
    }
    
    public void Helper(int[] nums, int S, int start) {
        if(start == nums.length) {
            if(S == 0) {
                count ++;
            }
            return;
        }
        Helper(nums, S - nums[start], start + 1);
        Helper(nums, S + nums[start], start + 1);
    }
}