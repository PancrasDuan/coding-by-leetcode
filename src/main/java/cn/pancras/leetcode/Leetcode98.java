package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/18
 * @description：验证二叉搜索树 https://leetcode.cn/problems/validate-binary-search-tree/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode98 {

    private Solution solution = new Solution();

    public boolean solution(TreeNode root) {
        return solution.isValidBST(root);
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private class Solution {
        public boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }

            return mth(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean mth(TreeNode node, long min, long max) {
            if (node == null) {
                return true;
            }

            if (node.val <= min || node.val >= max) {
                return false;
            }

            boolean left = mth(node.left, min, node.val);
            boolean right = mth(node.right, node.val, max);

            return left && right;
        }
    }
}
