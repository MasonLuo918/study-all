package com.masonluo.leetcode._链表;

import com.masonluo.leetcode.Base.ListNode;

/**
 * @author Masonluo
 * @date 2020-09-30 13:50
 */
public class _143_重排链表 {

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        newHead = reverse(newHead);
        //链表节点依次连接
        while (newHead != null) {
            ListNode temp = newHead.next;
            newHead.next = head.next;
            head.next = newHead;
            head = newHead.next;
            newHead = temp;
        }
    }

    public static ListNode reverse(ListNode node) {
        if (node.next == null) {
            return node;
        }
        ListNode last = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return last;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        ListNode root = new ListNode(arr[0]);
        ListNode p = root;
        for (int i = 1; i < arr.length; i++) {
            p.next = new ListNode(arr[i]);
            p = p.next;
        }
        reorderList(root);
        traver(root);
    }

    public static void traver(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
