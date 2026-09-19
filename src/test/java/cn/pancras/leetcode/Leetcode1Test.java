package cn.pancras.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/19
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode1Test {

    private Leetcode1 leetcode1 = new Leetcode1();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();

        testExampleThree();
    }

    private void testExampleOne() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] solution = leetcode1.solution(nums, target);
        System.out.println(Arrays.toString(solution));
    }

    private void testExampleTwo() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] solution = leetcode1.solution(nums, target);
        System.out.println(Arrays.toString(solution));
    }

    private void testExampleThree() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] solution = leetcode1.solution(nums, target);
        System.out.println(Arrays.toString(solution));
    }
}
