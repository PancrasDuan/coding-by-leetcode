package cn.pancras.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/2
 * @description：找到字符串中所有字母异位词样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode438Test {

    private Leetcode438 leetcode438 = new Leetcode438();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();
    }

    private void testExampleOne() {
        String s = "cbaebabacd";
        String p = "abc";
        // 预期输出：[0, 6]，顺序不限。
        List<Integer> result = leetcode438.solution(s, p);
        System.out.println(result);
    }

    private void testExampleTwo() {
        String s = "abab";
        String p = "ab";
        // 预期输出：[0, 1, 2]，顺序不限。
        List<Integer> result = leetcode438.solution(s, p);
        System.out.println(result);
    }
}
