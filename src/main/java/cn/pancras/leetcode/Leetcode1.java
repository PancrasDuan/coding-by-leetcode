package cn.pancras.leetcode;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/19
 * @description：https://leetcode.cn/problems/two-sum/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode1 {

    private Solution solution = new Solution();

    public int[] solution(int[] nums, int target) {
        return solution.twoSum(nums, target);
    }

    private class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    res[0] = map.get(target - nums[i]);
                    res[1] = i;
                    break;
                } else {
                    map.put(nums[i], i);
                }
            }

            return res;
        }
    }
}
