package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/5
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode26 {
    
    private Solution solution = new Solution();
    
    public int solution(int[] nums) {
        return solution.removeDuplicates(nums);
    }
    
    /**
     * 快慢指针
     * 通过前后数据是否相等判断是否重复，
     * 如果数据重复则 慢指针停留，快指针遍历
     * 如果数据不重复则 快指针的值赋给慢指针，慢指针+1
     */
    private class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 1) {
                return nums.length;
            }
            
            int left = 1;
            
            for (int right = 1; right<nums.length; right++) {
                if (nums[right-1] != nums[right]) {
                    nums[left] = nums[right];
                    left++;
                }
            }
            
            
            
            return left;
        }
    }
}
