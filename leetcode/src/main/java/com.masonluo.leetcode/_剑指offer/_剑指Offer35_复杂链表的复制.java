package com.masonluo.leetcode._剑指offer;


import com.masonluo.leetcode.Base.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-09-04 15:48
 */
public class _剑指Offer35_复杂链表的复制 {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        Map<Node, Node> visited = new HashMap<>();
        Node cHead = new Node(head.val), cur = cHead;
        visited.put(head, cHead);
        while(head != null) {
            if(head.next != null) {
                if(visited.get(head.next) == null) {
                    cur.next = new Node(head.next.val);
                    visited.put(head.next, cur.next);
                } else {
                    cur.next = visited.get(head.next);
                }
            }
            if(head.random != null) {
                if(visited.get(head.random) == null) {
                    cur.random = new Node(head.random.val);
                    visited.put(head.random, cur.random);
                } else {
                    cur.random = visited.get(head.random);
                }
            }
            cur = cur.next;
            head = head.next;
        }
        return cHead;
    }

}
