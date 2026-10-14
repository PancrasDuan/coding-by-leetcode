package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/11
 * @description：搜索旋转排序数组 https://leetcode.cn/problems/search-in-rotated-sorted-array/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode33 {

    private Solution solution = new Solution();

    public int solution(int[] nums, int target) {
        return solution.search(nums, target);
    }

    /**
     * #33 的骨架是二分，每次判断哪一半有序：
     *
     * 1. left = 0，right = n - 1，循环条件是 while (left <= right)。
     * 2. 取 mid = left + (right - left) / 2。如果 nums[mid] == target，直接返回 mid。
     * 3. 如果 nums[left] <= nums[mid]，说明左半 [left, mid] 有序：
     *      target 在 nums[left] <= target < nums[mid] 这个范围里，就去左边找，right = mid - 1。
     *      不在，就去右边找，left = mid + 1。
     * 4. 否则右半 [mid, right] 有序：
     *      target 在 nums[mid] < target <= nums[right] 这个范围里，就去右边找，left = mid + 1。
     *      不在，就去左边找，right = mid - 1。
     * 5. 循环结束还没找到，返回 -1。
     * 坑：
     *
     * 第 3 步要写 <=，不能写 <。left == mid 时（比如只剩两个元素），左半只有一个数，也算有序。
     * 范围判断里一边带等号、一边不带，因为 nums[mid] 在第 2 步已经比过了。
     * 用 left + (right - left) / 2 取中点，避免整数溢出。
     * 复杂度：时间 O(log n)，空间 O(1)。
     *
     * 一句话：切一刀必有一半有序，看 target 在不在有序那半，每次扔掉一半。
     */
    private class Solution {
        public int search(int[] nums, int target) {

            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else {
                    // left is order
                    if (nums[left] <= nums[mid]) {
                        // target 是否在范围里
                        if (nums[left] <= target && nums[mid] > target) {
                            right = mid - 1;
                        } else {
                            left = mid + 1;
                        }

                    }
                    // right is order
                    else {

                        if (nums[mid] < target && nums[right] >= target) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }

                }
            }

            return -1; // 占位返回值，尚未实现。
        }
    }
}
