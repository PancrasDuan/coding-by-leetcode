package cn.pancras.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/30
 * @description：最长连续序列 https://leetcode.cn/problems/longest-consecutive-sequence/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode128 {

    private Solution solution = new Solution();

    public int solution(int[] nums) {
        return solution.longestConsecutive(nums);
    }

    private class Solution {
        public int longestConsecutive(int[] nums) {

            // 去重
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }

            int res = 0;

            for (Integer curr : set) {
                // 找数组头，即 当前值 - 1 不在 set 中，表示当前值为序列头
                if (!set.contains(curr - 1)) {

                    int len = 1;
                    int x = curr;
                    while (set.contains(x + 1)) {
                        len++;
                        x++;
                    }

                    res = Math.max(res, len);

                }
            }

            return res;
        }
    }
}
