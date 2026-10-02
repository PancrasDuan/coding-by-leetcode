package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/2
 * @description：长度最小的子数组样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode209Test {

    private Leetcode209 leetcode209 = new Leetcode209();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();

        testExampleThree();
    }

    private void testExampleOne() {
        int target = 7;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        // 预期输出：2
        int result = leetcode209.solution(target, nums);
        System.out.println(result);
    }

    private void testExampleTwo() {
        int target = 4;
        int[] nums = new int[]{1, 4, 4};
        // 预期输出：1
        int result = leetcode209.solution(target, nums);
        System.out.println(result);
    }

    private void testExampleThree() {
        int target = 11;
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        // 预期输出：0
        int result = leetcode209.solution(target, nums);
        System.out.println(result);
    }
}
