package cn.pancras.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/14
 * @description：二叉树的层序遍历 https://leetcode.cn/problems/binary-tree-level-order-traversal/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode102 {

    private Solution solution = new Solution();

    public List<List<Integer>> solution(TreeNode root) {
        return solution.levelOrder(root);
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
     * #102 的整体思路是用队列做广度优先遍历，按每层的节点数来分层：
     *
     * 1. 如果 `root == null`，直接返回空列表。
     * 2. 建好队列 `Queue<TreeNode> queue = new ArrayDeque<>();`，把 `root` 放进去，再准备结果列表 `res`。
     * 3. 只要队列不空就继续循环：
     *    - 先记下 `int size = queue.size();`，这就是当前这一层的节点数。
     *    - 新建一个 `level` 列表，循环 `size` 次。每次 `poll` 出一个节点，把它的 `val` 加进 `level`，左右孩子不为空就 `offer` 进队列。
     *    - 这一层处理完，把 `level` 加进 `res`。
     * 4. 最后返回 `res`。
     *
     * 有两个坑要注意：
     * - `size` 必须在内层循环开始前存好，不能写成 `i < queue.size()`，因为循环里一直有孩子入队，队列长度会变。
     * - 孩子是 `null` 的时候不要入队。
     *
     * 复杂度方面，每个节点进出队列各一次，时间是 O(n)。队列里最多同时放一层的节点，空间是 O(n)。
     *
     * 简单说就是：每层开始时先数一下队列里有几个节点，弹出这么多个就是一层。写完提交 `Leetcode102.java`，我来核对。
     */
    private class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) {
                return new ArrayList<>();
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            List<List<Integer>> res = new ArrayList<>();
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    list.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
                res.add(list);
            }

            return res;
        }
    }
}
