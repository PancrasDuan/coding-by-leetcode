package cn.pancras.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/14
 * @description：二叉树的层序遍历样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode102Test {

    private Leetcode102 leetcode102 = new Leetcode102();

    @Test
    public void test() {
        testExampleOne();
        testExampleTwo();
        testExampleThree();
    }

    private void testExampleOne() {
        // 输入：root = [3, 9, 20, null, null, 15, 7]
        Leetcode102.TreeNode root = new Leetcode102.TreeNode(3,
                new Leetcode102.TreeNode(9),
                new Leetcode102.TreeNode(20,
                        new Leetcode102.TreeNode(15),
                        new Leetcode102.TreeNode(7)));
        // 预期输出：[[3], [9, 20], [15, 7]]
        List<List<Integer>> result = leetcode102.solution(root);
        System.out.println(result);
    }

    private void testExampleTwo() {
        Leetcode102.TreeNode root = new Leetcode102.TreeNode(1);
        // 预期输出：[[1]]
        List<List<Integer>> result = leetcode102.solution(root);
        System.out.println(result);
    }

    private void testExampleThree() {
        Leetcode102.TreeNode root = null;
        // 预期输出：[]
        List<List<Integer>> result = leetcode102.solution(root);
        System.out.println(result);
    }
}
