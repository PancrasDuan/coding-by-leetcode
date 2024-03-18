package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/18
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode45 {
    
    
    private Solution solution = new Solution();
    
    
    public int solution(int[] nums) {
        return solution.jump(nums);
    }
    
    
    private class Solution {
        public int jump(int[] nums) {
            if (nums.length == 0) return 0;
            
            int jumpCount = 0;
            int maxJump = 0;
            int end = 0;
            
            for (int i = 0; i < nums.length - 1; i++) {
                maxJump = Math.max(maxJump, i + nums[i]);
                if (i == end) {
                    end = maxJump;
                    jumpCount++;
                }
            }
            
            
            return jumpCount;
            
        }
    }
}
