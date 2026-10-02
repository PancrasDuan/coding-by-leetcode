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

    /**
     * #209 思路骨架（可变滑动窗口）：
     *
     * 1. 因为全是正整数，窗口越大和越大，所以可以用双指针。
     * 2. 用 `left = 0`、`sum = 0`、`ans = 正无穷`。
     * 3. 遍历 `right` 从 0 到 `n-1`：
     *    - 进：`sum += nums[right]`。
     *    - 当 `sum >= target` 时，一直缩：先用 `right - left + 1` 更新 `ans`，再 `sum -= nums[left]`、`left++`。
     * 4. 如果 `ans` 还是正无穷，说明没有符合条件的，返回 0，否则返回 `ans`。
     *
     * 和模板的对应关系：
     * - 窗口状态是 `sum`。
     * - 这里「不合法」要换个角度看，是「已经满足条件，可以尝试缩小」。
     * - 答案在缩的过程中更新，因为每缩一步窗口仍然满足条件。
     *
     * 坑：
     * - 更新答案要放在缩左边之前，不然会漏掉当前最短的窗口。
     * - 缩窗口用 `while`，不是 `if`，因为一次可能能连续缩好几步。
     * - 这个做法依赖「都是正整数」，有负数就不能用了。
     *
     * 复杂度：每个元素最多进出窗口一次，时间 O(n)，空间 O(1)。
     */
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
