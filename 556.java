class Solution {
    public int nextGreaterElement(int n) {
        char[] nums = String.valueOf(n).toCharArray();
        int i, j;
        for (i = nums.length-1; i > 0; i--) {
            if (nums[i-1] < nums[i]) {
                break;
            }
        }
        if (i == 0) {
            return -1;
        }
        int x = nums[i-1], smallest = i;
        for (j = i+1; j < nums.length; j++) {
            if (nums[j] > x && nums[j] <= nums[smallest]) {
                smallest = j;
            }
        }
        char temp = nums[i-1];
        nums[i-1] = nums[smallest];
        nums[smallest] = temp;
        Arrays.sort(nums, i, nums.length);
        long val = Long.parseLong(new String(nums));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
}