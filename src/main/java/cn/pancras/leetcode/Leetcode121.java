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
    
    public int solution(int[] prices) {
        return solution.maxProfit(prices);
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

}
