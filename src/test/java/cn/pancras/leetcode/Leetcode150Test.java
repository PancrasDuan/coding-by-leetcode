package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/14
 * @description：逆波兰表达式求值样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode150Test {

    private Leetcode150 leetcode150 = new Leetcode150();

    @Test
    public void test() {
        testExampleOne();
        testExampleTwo();
        testExampleThree();
    }

    private void testExampleOne() {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        // 预期输出：9
        int result = leetcode150.solution(tokens);
        System.out.println(result);
    }

    private void testExampleTwo() {
        String[] tokens = new String[]{"4", "13", "5", "/", "+"};
        // 预期输出：6
        int result = leetcode150.solution(tokens);
        System.out.println(result);
    }

    private void testExampleThree() {
        String[] tokens = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        // 预期输出：22
        int result = leetcode150.solution(tokens);
        System.out.println(result);
    }
}
