package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/21
 * @description：无重复字符的最长子串样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode3Test {

    private Leetcode3 leetcode3 = new Leetcode3();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();

        testExampleThree();
    }

    private void testExampleOne() {
        String s = "abcabcbb";
        // 预期输出：3
        int solution = leetcode3.solution(s);
        System.out.println(solution);
    }

    private void testExampleTwo() {
        String s = "bbbbb";
        // 预期输出：1
        int solution = leetcode3.solution(s);
        System.out.println(solution);
    }

    private void testExampleThree() {
        String s = "pwwkew";
        // 预期输出：3
        int solution = leetcode3.solution(s);
        System.out.println(solution);
    }
}
