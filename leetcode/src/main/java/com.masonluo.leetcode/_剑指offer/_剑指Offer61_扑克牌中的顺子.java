package com.masonluo.leetcode._剑指offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Masonluo
 * @date 2020-09-24 10:01
 */
public class _剑指Offer61_扑克牌中的顺子 {
    public static boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (set.contains(nums[i])) {
                    return false;
                }
                set.add(nums[i]);
                if (min > nums[i]) {
                    min = nums[i];
                }
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
        }
        return max - min < 5;
    }

    public static void main(String[] args) {
        System.out.println(isStraight(new int[]{0, 0,1,1,5}));
    }
}
