class Solution {
    public int minSteps(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                dp[i] = 2 + dp[i / 2];
            } else {
                int steps = Integer.MAX_VALUE;
                for (int j = 1; j <= i / 2; j++) {
                    if ((i - j) % j == 0) {
                        steps = Math.min(steps, dp[j] + 1 + (i - j) / j);
                    }
                }
                dp[i] = steps;
            }
        }
        return dp[n];
    }
}