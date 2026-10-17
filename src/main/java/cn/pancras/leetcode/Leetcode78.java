package cn.pancras.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/17
 * @description：子集 https://leetcode.cn/problems/subsets/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode78 {

    private Solution solution = new Solution();

    public List<List<Integer>> solution(int[] nums) {
        return solution.subsets(nums);
    }

    private class Solution {
        public List<List<Integer>> subsets(int[] nums) {

            List<List<Integer>> res = new ArrayList<>();
            List<Integer> path = new ArrayList<>();

            explore(res, path, 0, nums);


            // TODO：在这里编写你的解法。
            return res;
        }

        private void explore(List<List<Integer>> res, List<Integer> path, int process, int[] nums) {
            // return
            if (process == nums.length) {
                res.add(new ArrayList<>(path));
                return;
            }

            // not choose
            explore(res, path, process + 1, nums);

            // choose
            path.add(nums[process]);
            explore(res, path, process + 1, nums);
            path.removeLast();
        }
    }
}
