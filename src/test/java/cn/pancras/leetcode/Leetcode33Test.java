package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/11
 * @description：搜索旋转排序数组样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode33Test {

    private Leetcode33 leetcode33 = new Leetcode33();

    @Test
    public void test() {
        testExampleOne();
        testExampleTwo();
        testExampleThree();
    }

    private void testExampleOne() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        // 预期输出：4
        int result = leetcode33.solution(nums, target);
        System.out.println(result);
    }

    private void testExampleTwo() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        // 预期输出：-1
        int result = leetcode33.solution(nums, target);
        System.out.println(result);
    }

    private void testExampleThree() {
        int[] nums = new int[]{1};
        int target = 0;
        // 预期输出：-1
        int result = leetcode33.solution(nums, target);
        System.out.println(result);
    }
}
