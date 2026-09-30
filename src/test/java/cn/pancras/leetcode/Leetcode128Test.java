package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/30
 * @description：最长连续序列样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode128Test {

    private Leetcode128 leetcode128 = new Leetcode128();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();

        testExampleThree();
    }

    private void testExampleOne() {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        // 预期输出：4
        int result = leetcode128.solution(nums);
        System.out.println(result);
    }

    private void testExampleTwo() {
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        // 预期输出：9
        int result = leetcode128.solution(nums);
        System.out.println(result);
    }

    private void testExampleThree() {
        int[] nums = new int[]{1, 0, 1, 2};
        // 预期输出：3
        int result = leetcode128.solution(nums);
        System.out.println(result);
    }
}
