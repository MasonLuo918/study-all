package com.masonluo.leetcode._剑指offer;

import java.util.PriorityQueue;

/**
 * @author Masonluo
 * @date 2020-09-19 23:39
 */
public class _剑指Offer41_数据流中的中位数 {

    PriorityQueue<Integer> small = new PriorityQueue<>();

    PriorityQueue<Integer> large = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

    /**
     * initialize your data structure here.
     */
    public _剑指Offer41_数据流中的中位数() {

    }

    public void addNum(int num) {
        if (small.size() >= large.size()) {
            small.offer(num);
            large.offer(small.remove());
        } else {
            large.offer(num);
            small.offer(large.remove());
        }
    }

    public double findMedian() {
        // 如果元素不一样多，多的那个堆的堆顶元素就是中位数
        if (large.size() < small.size()) {
            return small.peek();
        } else if (large.size() > small.size()) {
            return large.peek();
        }
        // 如果元素一样多，两个堆堆顶元素的平均数是中位数
        return (large.peek() + small.peek()) / 2.0;
    }
}
