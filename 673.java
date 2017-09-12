class Solution {
    public static int findNumberOfLIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        Map<Integer, Integer> resultLengthToCounts = new HashMap<>();
        resultLengthToCounts.put(1, 1);
        int maxResultLength = 1;
        int[] dp = new int[nums.length];
        int[] counts = new int[nums.length];
        dp[0] = 1;
        counts[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxLen = 1;
            int count = 0;
            for (int j = i-1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    if (1 + dp[j] == maxLen) {
                        count += counts[j];
                    }
                    if (1 + dp[j] > maxLen) {
                        count = counts[j];
                        maxLen = 1 + dp[j];
                    }
                }
            }
            counts[i] = (count == 0 ? 1 : count);
            dp[i] = maxLen;
            resultLengthToCounts.put(maxLen, resultLengthToCounts.getOrDefault(maxLen, 0) + counts[i]);
            maxResultLength = maxLen > maxResultLength ? maxLen : maxResultLength;
        }
        return resultLengthToCounts.get(maxResultLength);
    }
}
