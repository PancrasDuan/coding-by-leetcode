package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/20
 * @description：盛最多水的容器 https://leetcode.cn/problems/container-with-most-water/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode11 {

    private Solution solution = new Solution();

    public int solution(int[] height) {
        return solution.maxArea(height);
    }

    private class Solution {
        public int maxArea(int[] height) {

            int res = 0;
            int left = 0, right = height.length - 1;
            while (left < right) {
                res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return res;
        }
    }
}
