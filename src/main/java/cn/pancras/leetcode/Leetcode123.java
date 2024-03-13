package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/13
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode123 {
    
    private Solution solution = new Solution();
    
    public int solution(int[] prices) {
        return solution.maxProfit(prices);
    }
    
    
    /**
     * dp[i][status]
     * status主要记录状态
     * status流转的操作为分支条件
     *
     * dp[i][0] 表示第i天不操作, init status
     *
     *
     * dp[i][1] 表示第i天第一次持有股票
     * 1. 第i-1天持有股票 dp[i-1][1]
     * 2. 第i天买入股票   dp[i-1][0] - prices[i]
     *
     * dp[i][2] 表示第i天第一次不持有股票
     * 1. 第i-1天不持有股票  dp[i-1][2]
     * 2. 第i天卖出股票   dp[i-1][1] + prices[i]
     *
     * dp[i][3] 表示第i天第二次持有股票
     * 1. 第i-1天持有股票   dp[i-1][3]
     * 2. 第i天买入      dp[i-1][2] - prices[i]
     *
     * dp[i][4] 表示第i天第二次不持有股票
     * 1. 第i-1天不持有股票  dp[i-1][4]
     * 2. 第i天卖出股票   dp[i-1][3] + prices[i]
     */
    private class Solution {
        public int maxProfit(int[] prices) {
        
            if (prices.length == 0) {
                return 0;
            }
            int[][] dp = new int[prices.length][5];
            dp[0][0] = 0;
            dp[0][1] = 0 - prices[0];
            dp[0][2] = 0;
            dp[0][3] = 0 - prices[0];
            dp[0][4] = 0;
            
            for (int i = 1; i < prices.length; i++) {
                dp[i][0] = 0;
                dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
                dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1] + prices[i]);
                dp[i][3] = Math.max(dp[i-1][3], dp[i-1][2] - prices[i]);
                dp[i][4] = Math.max(dp[i-1][4], dp[i-1][3] + prices[i]);
            }
            
            return dp[prices.length-1][4];
        }
    }
}
