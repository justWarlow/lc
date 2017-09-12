class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 1;
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                count++;
            }
            else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);    
    }   
}
