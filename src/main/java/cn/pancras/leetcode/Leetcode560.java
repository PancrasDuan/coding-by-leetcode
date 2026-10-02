package cn.pancras.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/30
 * @description：和为 K 的子数组 https://leetcode.cn/problems/subarray-sum-equals-k/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode560 {

    private Solution solution = new Solution();

    public int solution(int[] nums, int k) {
        return solution.subarraySum(nums, k);
    }

    private class Solution {
        public int subarraySum(int[] nums, int k) {

            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int res = 0;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (map.containsKey(sum - k)) {
                    res += map.get(sum - k);
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return res;
        }
    }
}
