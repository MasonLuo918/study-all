package com.masonluo.leetcode;

import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-09-30 10:51
 */
public class _645_错误的集合 {
    public static int[] findErrorNums(int[] nums) {
        int dup = 0, loss = 0;
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0) {
                dup = Math.abs(idx + 1);
            } else {
                nums[idx] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                loss = nums[i] + 1;
                break;
            }
        }
        return new int[]{dup, loss};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
    }
}
