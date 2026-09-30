package cn.pancras.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/28
 * @description：字母异位词分组样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode49Test {

    private Leetcode49 leetcode49 = new Leetcode49();

    @Test
    public void test() {
        testExampleOne();

        testExampleTwo();

        testExampleThree();
    }

    private void testExampleOne() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        // 预期输出：[ ["bat"], ["nat", "tan"], ["ate", "eat", "tea"] ]，组及组内顺序不限。
        List<List<String>> result = leetcode49.solution(strs);
        System.out.println(result);
    }

    private void testExampleTwo() {
        String[] strs = new String[]{""};
        // 预期输出：[[""]]
        List<List<String>> result = leetcode49.solution(strs);
        System.out.println(result);
    }

    private void testExampleThree() {
        String[] strs = new String[]{"a"};
        // 预期输出：[["a"]]
        List<List<String>> result = leetcode49.solution(strs);
        System.out.println(result);
    }
}
