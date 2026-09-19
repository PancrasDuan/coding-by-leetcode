package cn.pancras.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/18
 * @description：https://leetcode.cn/problems/3sum/description/?envType=study-plan-v2&envId=top-interview-150
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode15 {

    private Solution solution = new Solution();

    public List<List<Integer>> solution(int[] nums) {
        return solution.threeSum(nums);
    }

    private class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            if (nums == null || nums.length < 3) {
                return new ArrayList<>();
            }

            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                // 双指针处理组合数据
                int left = i + 1, right = nums.length - 1;
                while (left < right) {

                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        if (!(left > i + 1 && nums[left] == nums[left - 1] && right < nums.length - 1 && nums[right] == nums[right + 1])) res.add(Arrays.asList(nums[i], nums[left], nums[right]));
//                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;

                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }

            }
            return  res;
        }
    }
}
