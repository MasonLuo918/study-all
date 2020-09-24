package com.masonluo.leetcode._剑指offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Masonluo
 * @date 2020-09-24 09:03
 */
public class _剑指Offer59_II_队列的最大值 {

    private Queue<Integer> queue = new LinkedList<>();

    private Deque<Integer> deque = new LinkedList<>();

    public _剑指Offer59_II_队列的最大值() {

    }

    public int max_value() {
        if (this.queue.size() <= 0) {
            return -1;
        }
        return deque.peekFirst();
    }

    public void push_back(int value) {
        while (!deque.isEmpty() && deque.peekLast() < value) {
            deque.removeLast();
        }
        deque.addLast(value);
        queue.add(value);
    }

    public int pop_front() {
        if (this.queue.size() <= 0) {
            return -1;
        }
        int num = queue.remove();
        if (deque.size() != 0 && deque.getFirst().equals(num)) {
            deque.removeFirst();
        }
        return num;
    }

    public static void main(String[] args) {
        _剑指Offer59_II_队列的最大值 mx = new _剑指Offer59_II_队列的最大值();
        mx.push_back(15);
        mx.push_back(9);
        System.out.println(mx.max_value());
    }
}
