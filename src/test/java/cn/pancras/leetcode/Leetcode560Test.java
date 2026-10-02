package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/30
 * @description：和为 K 的子数组样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode560Test {

    private Leetcode560 leetcode560 = new Leetcode560();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();
    }

    private void testExampleOne() {
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        // 预期输出：2
        int result = leetcode560.solution(nums, k);
        System.out.println(result);
    }

    private void testExampleTwo() {
        int[] nums = new int[]{1, 2, 3};
        int k = 3;
        // 预期输出：2
        int result = leetcode560.solution(nums, k);
        System.out.println(result);
    }
}
