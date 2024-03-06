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
public class Leetcode169 {
    
    private Solution solution = new Solution();
    
    
    public int solution(int[] nums) {
        return solution.majorityElement(nums);
    }
    
    /**
     * 分治：
     * 求全局众数分化成求局部众数
     */
    private class Solution {
        public int majorityElement(int[] nums) {
            return majorityElementRec(nums, 0, nums.length - 1);
        }
        
        public int majorityElementRec(int[] nums, int lo, int hi) {
            // base case
            // only one element
            if (lo == hi) {
                return nums[lo];
            }
            
            // mid 只用于递归调用的坐标调整
            int mid = (hi - lo) / 2 + lo;
            int left = majorityElementRec(nums, lo, mid);
            int right = majorityElementRec(nums, mid + 1, hi);
            
            
            if (left == right) {
                return left;
            }
            
            // lo hi 为局部左右坐标
            int leftCount = countElement(nums, lo, hi, left);
            int rightCount = countElement(nums, lo, hi, right);
            
            return leftCount > rightCount ? left : right;
            
        }
        
        private int countElement(int[] nums, int begin, int end, int target) {
            
            int num = 0;
            
            for (int i = begin; i <= end; i++) {
                if (nums[i] == target) {
                    num++;
                }
            }
            
            return num;
            
            
        }
    }
    
    
    /**
     * Boyer-Moore 投票算法
     * 思路就是用其他元素抵消众数，最后剩下的永远都是众数
     */
    private class Solution1 {
        public int majorityElement(int[] nums) {
            if (nums.length <= 1) {
                return nums[nums.length - 1];
            }
            
            int candidate = nums[0];
            int count = 1;
            
            for (int i = 1; i < nums.length; i++) {
                if (count == 0) {
                    candidate = nums[i];
                }
                
                if (nums[i] == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
            
            return candidate;
        
        }
    }
}
