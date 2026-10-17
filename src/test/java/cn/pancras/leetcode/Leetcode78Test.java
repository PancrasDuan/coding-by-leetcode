package cn.pancras.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/17
 * @description：子集样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode78Test {

    private Leetcode78 leetcode78 = new Leetcode78();

    @Test
    public void test() {
        testExampleOne();
        testExampleTwo();
    }

    // 仅打印结果，方便自行练习；子集的返回顺序可以不同。
    private void testExampleOne() {
        int[] nums = new int[]{1, 2, 3};
        // 预期输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        List<List<Integer>> result = leetcode78.solution(nums);
        System.out.println(result);
    }

    private void testExampleTwo() {
        int[] nums = new int[]{0};
        // 预期输出：[[],[0]]
        List<List<Integer>> result = leetcode78.solution(nums);
        System.out.println(result);
    }
}
