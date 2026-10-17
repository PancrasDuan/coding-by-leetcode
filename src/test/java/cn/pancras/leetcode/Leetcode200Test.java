package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/17
 * @description：岛屿数量样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode200Test {

    private Leetcode200 leetcode200 = new Leetcode200();

    @Test
    public void test() {
        testExampleOne();
        testExampleTwo();
    }

    // 仅打印结果，方便自行练习。
    private void testExampleOne() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        // 预期输出：1
        int result = leetcode200.solution(grid);
        System.out.println(result);
    }

    private void testExampleTwo() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        // 预期输出：3
        int result = leetcode200.solution(grid);
        System.out.println(result);
    }
}
