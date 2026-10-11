package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/7
 * @description：删除链表的倒数第 N 个结点 https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode19 {

    private Solution solution = new Solution();

    public ListNode solution(ListNode head, int n) {
        return solution.removeNthFromEnd(head, n);
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * #19 思路骨架（虚拟头结点加快慢指针，一趟扫完）：
     *
     * 建一个虚拟头结点 dummy，让 dummy.next = head。这样删掉真正的头结点时不用特殊处理。
     * 快慢指针都从 dummy 出发。
     * 先让 fast 往前走 n + 1 步。
     * 然后 fast 和 slow 一起走，直到 fast == null。这时 slow 正好停在要删的结点的前一个。
     * 删除：slow.next = slow.next.next。
     * 返回 dummy.next。
     * 为什么是 n + 1 步：两个指针保持 n + 1 的间距，fast 走到末尾的 null 时，slow 离末尾还差 n + 1，也就是倒数第 n 个结点的前一个。删结点需要的就是这个前驱。
     *
     * 坑：
     *
     * 不用 dummy 的话，head = [1], n = 1 这种删头结点的情况会出错。
     * 返回 dummy.next，别返回 head，因为 head 可能已经被删了。
     * 题目保证 n 合法，不用判断越界。
     * 复杂度：时间 O(L)，L 是链表长度，空间 O(1)。
     *
     * 一句话：快指针先走 n+1 步，再一起走，慢指针就停在要删结点的前一个。写完提交 Leetcode19.java，我来核对。
     */
    private class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode slow = dummy, fast = dummy;

            int count = 0;
            while (fast.next != null) {
                fast = fast.next;
                count++;

                if (count < n + 1) {
                    continue;
                }

                slow = slow.next;
            }

            ListNode tmp = slow.next;
            slow.next = tmp.next;
            tmp.next = null;

            return dummy.next;
        }
    }
}
