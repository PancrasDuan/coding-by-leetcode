package cn.pancras.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/18
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode15Test {

    private Leetcode15 leetcode15 = new Leetcode15();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();

        testExampleThree();

        testDuplicatePair();
    }

    private void testExampleOne() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> solution = leetcode15.solution(nums);
        System.out.println(solution);
    }

    private void testExampleTwo() {
        int[] nums = new int[]{0, 1, 1};
        List<List<Integer>> solution = leetcode15.solution(nums);
        System.out.println(solution);
    }

    private void testExampleThree() {
        int[] nums = new int[]{0, 0, 0};
        List<List<Integer>> solution = leetcode15.solution(nums);
        System.out.println(solution);
    }

    private void testDuplicatePair() {
        int[] nums = new int[]{-2, 0, 0, 2, 2};
        List<List<Integer>> solution = leetcode15.solution(nums);
        System.out.println(solution);
    }
}
