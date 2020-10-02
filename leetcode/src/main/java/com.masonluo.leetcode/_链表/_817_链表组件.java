package com.masonluo.leetcode._链表;

import com.masonluo.leetcode.Base.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Masonluo
 * @date 2020-09-30 11:18
 */
public class _817_链表组件 {
    public static int numComponents(ListNode head, int[] G) {
        Set<Integer> needs = new HashSet<>();
        for (int i : G) {
            needs.add(i);
        }
        int ans = 0;
        ListNode p = head;
        while (p != null) {
            if (needs.contains(p.val) &&
                    (p.next == null || !needs.contains(p.next.val))){
                ans++;
            }
            p = p.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        root.next = new ListNode(4);
        root.next.next = new ListNode(0);
        root.next.next.next = new ListNode(2);
        root.next.next.next.next = new ListNode(1);
    }
}
