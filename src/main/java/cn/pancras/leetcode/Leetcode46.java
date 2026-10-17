package cn.pancras.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/14
 * @description：全排列 https://leetcode.cn/problems/permutations/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode46 {

    private Solution solution = new Solution();

    public List<List<Integer>> solution(int[] nums) {
        return solution.permute(nums);
    }

    /**
     * #46 用回溯：一个格子一个格子地填数，填满就收集一个答案，再撤回最后一步换别的数试。
     *
     * 1. 准备结果列表 `res`、当前路径 `path`，再开一个 `boolean[] used` 记录哪些数已经用过。
     * 2. 写一个递归函数 `backtrack(nums, path, used, res)`：
     *    - 终止条件：`path.size() == nums.length` 时，把 `new ArrayList<>(path)` 加进 `res`，然后 `return`。
     *    - 否则遍历每个下标 `i`：如果 `used[i]` 为真就跳过。没用过的话，先做选择：`path.add(nums[i])`、`used[i] = true`；再递归 `backtrack(...)`；最后撤销选择：`path.remove(path.size() - 1)`、`used[i] = false`。
     * 3. 主函数里调用一次 `backtrack`，返回 `res`。
     *
     * 回溯的通用模板就三步：
     *
     * ```java
     * void backtrack(路径, 选择列表) {
     *     if (满足结束条件) { 收集结果; return; }
     *     for (选择 : 选择列表) {
     *         做选择;
     *         backtrack(路径, 选择列表);
     *         撤销选择;
     *     }
     * }
     * ```
     *
     * 有两个坑：
     * - 收集结果时一定要 `new ArrayList<>(path)` 复制一份。直接加 `path` 的话，后面撤销会把它清空，最后 `res` 里全是空列表。
     * - 撤销要和选择一一对应，`path` 和 `used` 两个都要恢复。
     *
     * 复杂度：一共有 n! 个排列，每个复制要 O(n)，所以时间是 O(n·n!)，递归深度和 `used` 占 O(n) 空间。
     *
     * 简单说就是：选一个没用过的数，往下递归，回来时撤销，再试下一个。写完提交 `Leetcode46.java`，我来核对。
     */
    private class Solution {
        public List<List<Integer>> permute(int[] nums) {

            List<List<Integer>> res = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            boolean[] used = new boolean[nums.length];

            explore(res, path, used, nums);

            return res;
        }

        private void explore(List<List<Integer>> res, List<Integer> path, boolean[] used ,int[] nums) {

            // return
            if (path.size() == nums.length) {
                res.add(new ArrayList<>(path));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                path.add(nums[i]);
                explore(res, path, used, nums);
                used[i] = false;
                path.removeLast();
            }
        }

    }
}
