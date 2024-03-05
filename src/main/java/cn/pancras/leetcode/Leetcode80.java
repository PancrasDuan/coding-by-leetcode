package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/6
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode80 {
    
    private Solution solution = new Solution();
    
    public int solution(int[] nums) {
        return solution.removeDuplicates(nums);
    }
    
    /**
     * 题目类似26，删除有序数组中的重复项1
     * 对于有序数组来说，数组中相同元素是在一起的
     * 对于出现超过两次的元素，只让其出现两次，也就是说，某一个元素最多出现两次
     * 首先考虑快慢指针，
     * slow ---> 指向需要赋值的位置
     * fast ---> 指向前进的位置
     */
    private class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 2) {
                return nums.length;
            }
            
            int slow = 2;
            
            for (int fast = 2; fast < nums.length; fast++) {
            
                if (nums[slow-2] != nums[fast]) {
                    nums[slow] = nums[fast];
                    slow++;
                }
            
            }
            
            
            return slow;
            
        }
    }
}
