package cn.pancras.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/20
 * @description：合并区间样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode56Test {

    private Leetcode56 leetcode56 = new Leetcode56();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();
    }

    private void testExampleOne() {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        // 预期输出：[[1, 6], [8, 10], [15, 18]]
        int[][] solution = leetcode56.solution(intervals);
        System.out.println(Arrays.deepToString(solution));
    }

    private void testExampleTwo() {
        int[][] intervals = new int[][]{{1, 4}, {4, 5}};
        // 预期输出：[[1, 5]]
        int[][] solution = leetcode56.solution(intervals);
        System.out.println(Arrays.deepToString(solution));
    }
}
