class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];       
        res[n - 1] = 1;
        for (int i = n - 2; i >= 0; --i) {
            res[i] = res[i + 1] * nums[i + 1];
        }       
        for (int i = 0; i < n - 1; ++i) {
            res[i] = res[i] * res[n - 1];
            res[n - 1] = res[n - 1] * nums[i];
        }   
        return res;
    }
}
