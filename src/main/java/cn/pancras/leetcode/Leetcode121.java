package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/8
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode121 {

    private Solution solution = new Solution();
    
    private SolutionByDP solutionByDP = new SolutionByDP();
    
    public int solution(int[] prices) {
        return solution.maxProfit(prices);
    }
    
    public int solutionV2(int[] prices) {
        return solutionByDP.maxProfit(prices);
    }
    
    
    /**
     * 解决思路
     * maxProfile = max - min
     * 因为max必须在min后面，所以需要动态计算最优maxProfile值
     */
    private class Solution {
        public int maxProfit(int[] prices) {
            int minValue = Integer.MAX_VALUE;
            int maxProfile = 0;
            
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minValue) {
                    minValue = prices[i];
                } else if (prices[i] - minValue > maxProfile) {
                    maxProfile = prices[i] - minValue;
                }
            }
            
            return maxProfile;
        }
    }
    
    
    
    /**
     * 解决思路
     * dp[i][0] 第i天持有股票的利润
     * 1. 第i-1天持有股票 ， 即 dp[i][0] = dp[i-1][0]
     * 2. 第i天购入股票,      即 dp[i][0] = -prices[i]
     * final : dp[i][0] = max(dp[i-1][0], -prices[i])
     *
     * dp[i][1] 第i天不持有股票的利润
     * 1. 第i-1天不持有股票， 即 dp[i][1] = dp[i-1][1]
     * 2. 第i天卖出股票，第i-1天持有股票+今天价格      即 dp[i][1] = prices[i] + dp[i-1][0]
     * final : dp[i][1] = max(dp[i-1][1], prices[i] + dp[i-1][0])
     */
    private class SolutionByDP {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) return 0;
            
            int[][] dp = new int[prices.length][2];
            dp[0][0] = -prices[0];
            dp[0][1] = 0;
            for (int i = 1; i < prices.length; i++) {
                dp[i][0] = Math.max(dp[i-1][0], -prices[i]);
                dp[i][1] = Math.max(dp[i-1][0] + prices[i], dp[i-1][1]);
            }
            
            return dp[prices.length-1][1];
        
        
        
        }
    }

}
