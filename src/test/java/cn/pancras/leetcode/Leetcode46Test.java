package cn.pancras.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/14
 * @description：全排列样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode46Test {

    private Leetcode46 leetcode46 = new Leetcode46();

    @Test
    public void test() {
        testExampleOne();
        testExampleTwo();
        testExampleThree();
    }

    // 仅打印结果，方便自行练习；全排列的返回顺序可以不同。
    private void testExampleOne() {
        int[] nums = new int[]{1, 2, 3};
        // 预期输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        List<List<Integer>> result = leetcode46.solution(nums);
        System.out.println(result);
    }

    private void testExampleTwo() {
        int[] nums = new int[]{0, 1};
        // 预期输出：[[0,1],[1,0]]
        List<List<Integer>> result = leetcode46.solution(nums);
        System.out.println(result);
    }

    private void testExampleThree() {
        int[] nums = new int[]{1};
        // 预期输出：[[1]]
        List<List<Integer>> result = leetcode46.solution(nums);
        System.out.println(result);
    }
}
