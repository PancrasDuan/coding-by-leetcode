package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/2
 * @description：长度最小的子数组 https://leetcode.cn/problems/minimum-size-subarray-sum/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode209 {

    private Solution solution = new Solution();

    public int solution(int target, int[] nums) {
        return solution.minSubArrayLen(target, nums);
    }

    private class Solution {
        public int minSubArrayLen(int target, int[] nums) {

            int res = Integer.MAX_VALUE;
            int left = 0, right = 0;
            int sum = 0;
            while (right < nums.length) {
                sum += nums[right];

                // sum 大，满足条件，但不一定最优
                while (sum >= target) {
                    res = Math.min(res, right - left + 1);
                    sum -= nums[left];
                    left++;
                }

                right++;
            }


            return res == Integer.MAX_VALUE ? 0 : res;
        }
    }
}
