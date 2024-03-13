package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/14
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode55 {
    
    private Solution solution = new Solution();
    
    public boolean solution(int[] nums) {
        return solution.canJump(nums);
    }
    
    
    private class Solution {
        public boolean canJump(int[] nums) {
            if (nums.length == 0) return true;
            
            int maxPath = 0;
            
            for (int i = 0; i < nums.length; i++) {
                if (i <= maxPath) {
                    maxPath = Math.max(maxPath, i + nums[i]);
                    if (maxPath >= nums.length - 1) {
                        return true;
                    }
                }
            }
            
            return false;
        }
    }
    
}
