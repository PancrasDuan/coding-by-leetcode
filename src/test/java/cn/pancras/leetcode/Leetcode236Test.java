package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/18
 * @description：二叉树的最近公共祖先样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode236Test {

    private Leetcode236 leetcode236 = new Leetcode236();

    @Test
    public void test() {
        testExampleOne();
        testExampleTwo();
        testExampleThree();
    }

    // 仅打印结果，方便自行练习；请对照预期输出检查。
    private void testExampleOne() {
        // 输入：root = [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4], p = 5, q = 1
        Leetcode236.TreeNode root = buildExampleTree();
        // p、q 使用树中的节点引用。
        Leetcode236.TreeNode p = root.left;
        Leetcode236.TreeNode q = root.right;
        // 预期输出：3
        printNode(leetcode236.solution(root, p, q));
    }

    private void testExampleTwo() {
        // 输入：root = [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4], p = 5, q = 4
        Leetcode236.TreeNode root = buildExampleTree();
        Leetcode236.TreeNode p = root.left;
        Leetcode236.TreeNode q = root.left.right.right;
        // 预期输出：5
        printNode(leetcode236.solution(root, p, q));
    }

    private void testExampleThree() {
        // 输入：root = [1, 2], p = 1, q = 2
        Leetcode236.TreeNode root = new Leetcode236.TreeNode(1,
                new Leetcode236.TreeNode(2), null);
        Leetcode236.TreeNode p = root;
        Leetcode236.TreeNode q = root.left;
        // 预期输出：1
        printNode(leetcode236.solution(root, p, q));
    }

    private Leetcode236.TreeNode buildExampleTree() {
        return new Leetcode236.TreeNode(3,
                new Leetcode236.TreeNode(5,
                        new Leetcode236.TreeNode(6),
                        new Leetcode236.TreeNode(2,
                                new Leetcode236.TreeNode(7),
                                new Leetcode236.TreeNode(4))),
                new Leetcode236.TreeNode(1,
                        new Leetcode236.TreeNode(0),
                        new Leetcode236.TreeNode(8)));
    }

    private void printNode(Leetcode236.TreeNode node) {
        System.out.println(node == null ? "null" : node.val);
    }
}
