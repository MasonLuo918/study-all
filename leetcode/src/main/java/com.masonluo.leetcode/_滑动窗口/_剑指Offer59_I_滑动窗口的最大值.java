package com.masonluo.leetcode._滑动窗口;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Masonluo
 * @date 2020-09-23 19:35
 */
public class _剑指Offer59_I_滑动窗口的最大值 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.getLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0] = deque.getFirst();
        int j = 1;
        for (int i = k; i < nums.length; i++) {
            if (nums[i - k] == deque.getFirst()) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.getLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[j++] = deque.peekFirst();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
    }
}
