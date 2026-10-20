package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/18
 * @description：二叉树的最近公共祖先 https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode236 {

    private Solution solution = new Solution();

    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        return solution.lowestCommonAncestor(root, p, q);
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

    /**
     * 思路骨架（后序 DFS）：
     *
     * 1. 递归左右子树：空返回 null；当前结点是 `p` 或 `q` 就直接返回自己。
     * 2. 左右都非空 → 当前结点就是 LCA（`p`、`q` 分居两侧）。
     * 3. 只有一边非空 → 答案在那一边（另一边没找到）。
     * 4. 两边都空 → 返回 null。例子 2 里 `q` 在 `p` 子树里时，碰到 `p` 就提前返回，自然覆盖「结点可以是自己的祖先」。
     *
     * 先按这个写，做完丢 `Leetcode236.java` 或说「做完了」。
     */
    private class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) {
                return root;
            }

            return mth(root, p, q);
        }

        private TreeNode mth(TreeNode node, TreeNode p, TreeNode q) {
            if (node == null) {
                return null;
            }
            if (node.val == p.val || node.val == q.val) {
                return node;
            }

            // left
            TreeNode left = mth(node.left, p, q);
            // right
            TreeNode right = mth(node.right, p, q);

            if (left != null && right != null) {
                return node;
            } else if (left != null) {
                return left;
            } else if (right != null) {
                return right;
            }

            return null;

        }
    }
}
