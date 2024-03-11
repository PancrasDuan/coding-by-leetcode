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
    
    private class Solution {
        public int maxProfit(int[] prices) {
        
        }
    }
}
