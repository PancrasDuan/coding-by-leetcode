package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/18
 * @description：验证二叉搜索树样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode98Test {

    private Leetcode98 leetcode98 = new Leetcode98();

    @Test
    public void test() {
        testExampleOne();
        testExampleTwo();
    }

    // 仅打印结果，方便自行练习；请对照预期输出检查。
    private void testExampleOne() {
        // 输入：root = [2, 1, 3]
        Leetcode98.TreeNode root = new Leetcode98.TreeNode(2,
                new Leetcode98.TreeNode(1),
                new Leetcode98.TreeNode(3));
        // 预期输出：true
        boolean result = leetcode98.solution(root);
        System.out.println(result);
    }

    private void testExampleTwo() {
        // 输入：root = [5, 1, 4, null, null, 3, 6]
        Leetcode98.TreeNode root = new Leetcode98.TreeNode(5,
                new Leetcode98.TreeNode(1),
                new Leetcode98.TreeNode(4,
                        new Leetcode98.TreeNode(3),
                        new Leetcode98.TreeNode(6)));
        // 预期输出：false
        boolean result = leetcode98.solution(root);
        System.out.println(result);
    }
}
