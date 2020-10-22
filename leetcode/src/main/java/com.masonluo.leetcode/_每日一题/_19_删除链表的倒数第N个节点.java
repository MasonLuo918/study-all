package com.masonluo.leetcode._每日一题;

import com.masonluo.leetcode.Base.ListNode;

/**
 * @author Masonluo
 * @date 2020-10-18 21:23
 */
public class _19_删除链表的倒数第N个节点 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = getListLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < len - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }

    private static int getListLength(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        System.out.println(removeNthFromEnd(root, 2));
    }
}
