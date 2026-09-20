package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/20
 * @description：盛最多水的容器样例测试
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode11Test {

    private Leetcode11 leetcode11 = new Leetcode11();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();
    }

    private void testExampleOne() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int solution = leetcode11.solution(height);
        System.out.println(solution);
    }

    private void testExampleTwo() {
        int[] height = new int[]{1, 1};
        int solution = leetcode11.solution(height);
        System.out.println(solution);
    }
}
