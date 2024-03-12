package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/11
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode122 {
    
    private Solution solution = new Solution();
    
    public int solution(int[] prices) {
        int totalProfit = 0;
        if (prices.length == 0) {
            return totalProfit;
        }
        
        for (int i = 1; i < prices.length; i++) {
            totalProfit += Math.max(prices[i]-prices[i-1],0);
        }
        
        return totalProfit;
    }
    
    /**
     * dp 思路
     * dp[i][0] 第i天持有股票的最大利润
     * 1. 第i-1天持有股票的最大利润    dp[i-1][0]
     * 2. 第i天买入股票的最大利润      dp[i-1][1] - prices[i]
     * final : max(dp[i-1][0], dp[i-1][1] - prices[i])
     *
     * dp[i][1] 第i天不持有股票的最大利润
     * 1. 第i-1天不持有股票最大利润    dp[i-1][1]
     * 2. 第i天卖出股票的最大利润      dp[i-1][0] + prices[i]
     * final : max(dp[i-1][1], dp[i-1][0] + prices[i])
     */
    private class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 0) {
                return 0;
            }
            
            int[][] dp = new int[prices.length][2];
            dp[0][0] = 0 - prices[0];
            dp[0][1] = 0;
            for (int i = 1; i < prices.length; i++) {
                dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] - prices[i]);
                dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i]);
            }
            
            return dp[prices.length-1][1];
        }
    }
}
