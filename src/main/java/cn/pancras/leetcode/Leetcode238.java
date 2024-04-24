package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2024/4/24
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode238 {

    private Solution solution = new Solution();
    private Solution1 solution1 = new Solution1();

    public int[] solution(int[] nums) {
        return solution1.productExceptSelf(nums);
    }


    /**
     * solution 1
     * 使用左右列表存储i位置左边元素的乘积和右边元素的乘积
     * 左列表：第i个元素表示，i左边所有元素的乘积
     * 右列表：第i个元素表示，i右边所有元素的乘积
     * 边界条件：左列表第一个元素和右列表最后一个元素为1
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] left = new int[nums.length];
            int[] right = new int[nums.length];
            int[] res = new int[nums.length];
            left[0] = 1;
            right[nums.length - 1] = 1;

            for (int i = 1; i < nums.length; i++) {
                left[i] = left[i-1] * nums[i-1];
            }

            for (int i = nums.length - 2; i >= 0; i--) {
                right[i] = right[i+1] * nums[i+1];
            }

            for (int i = 0; i < nums.length; i++) {
                res[i] = left[i] * right[i];
            }

            return res;
        }
    }

    /**
     * 空间复杂度O(1)的解决方案
     * 空间复杂度O1成立的条件建立在输出数组不计入复杂度的情况下
     */
    static class Solution1 {
        public int[] productExceptSelf(int[] nums) {
            int[] res = new int[nums.length];
            res[0] = 1;

            for (int i = 1; i < nums.length; i++) {
                res[i] = res[i-1] * nums[i-1];
            }

            int right = 1;
            for (int i = nums.length-1; i >= 0; i--) {
                res[i] = res[i] * right;
                right = right*nums[i];
            }

            return res;
        }
    }
}
