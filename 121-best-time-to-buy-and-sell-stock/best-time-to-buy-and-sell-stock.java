class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minValue = Integer.MAX_VALUE, profit = 0;
        for(int i = 0;i < n;i ++){
            minValue = Math.min(minValue, prices[i]);
            profit = Math.max(profit, prices[i] - minValue);
        }
        return profit;
    }
}