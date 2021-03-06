class Solution {
    public int strangePrinter(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                dp[i][j] = j - i + 1;
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] - (s.charAt(k) == s.charAt(j) ? 1 : 0));
                }
            }
        }
        return s.isEmpty() ? 0 : dp[0][s.length() - 1];
    }
}
