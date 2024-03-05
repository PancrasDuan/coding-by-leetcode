package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/4
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode27 {
    
    private Solution solution = new Solution();
    
    public int solution(int[] nums, int val) {
        return solution.removeElement(nums, val);
    }
    
    /**
     * 前后双指针：
     * 不能使用for，需要保证head ！= val 才能移动至下一位置
     */
    private class Solution {
        public int removeElement(int[] nums, int val) {
            int head = 0,tail = nums.length;
            
            while (head < tail) {
                if (nums[head] == val) {
                    nums[head] = nums[--tail];
                } else {
                    head++;
                }
            }
            
            
            return head;
        }
    }

}
