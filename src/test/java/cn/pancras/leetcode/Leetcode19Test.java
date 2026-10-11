package cn.pancras.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/7
 * @description：删除链表的倒数第 N 个结点样例
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode19Test {

    private Leetcode19 leetcode19 = new Leetcode19();

    @Test
    public void test() {
        testExampleOne();
        testExampleTwo();
        testExampleThree();
    }

    private void testExampleOne() {
        Leetcode19.ListNode head = buildList(1, 2, 3, 4, 5);
        int n = 2;
        // 预期输出：[1, 2, 3, 5]。
        printList(leetcode19.solution(head, n));
    }

    private void testExampleTwo() {
        Leetcode19.ListNode head = buildList(1);
        int n = 1;
        // 预期输出：[]。
        printList(leetcode19.solution(head, n));
    }

    private void testExampleThree() {
        Leetcode19.ListNode head = buildList(1, 2);
        int n = 1;
        // 预期输出：[1]。
        printList(leetcode19.solution(head, n));
    }

    private Leetcode19.ListNode buildList(int... values) {
        Leetcode19.ListNode head = null;
        Leetcode19.ListNode tail = null;
        for (int value : values) {
            Leetcode19.ListNode node = new Leetcode19.ListNode(value);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }
        return head;
    }

    private void printList(Leetcode19.ListNode head) {
        List<Integer> values = new ArrayList<>();
        for (Leetcode19.ListNode node = head; node != null; node = node.next) {
            values.add(node.val);
        }
        System.out.println(values);
    }
}
