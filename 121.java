class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) {
            return 0;
        }
        int[] minTo = new int[prices.length];
        int[] maxFrom = new int[prices.length];
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = min < prices[i] ? min : prices[i];
            minTo[i] = min;
        }
        for (int i = prices.length - 1; i >= 0; i--) {
            max = max > prices[i] ? max : prices[i];
            maxFrom[i] = max;
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int profit = maxFrom[i + 1] - minTo[i];
            maxProfit = maxProfit > profit ? maxProfit : profit;
        }
        return maxProfit;
    }
}