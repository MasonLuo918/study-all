package com.masonluo.leetcode._程序员面试金典;

/**
 * @author Masonluo
 * @date 2020-10-09 17:25
 */
public class _面试题_17_16_按摩师 {
    public static int massage(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len + 2];
        dp[len + 1] = 0;
        dp[len] = 0;
        for (int i = len - 1; i >= 0; i--) {
            dp[i] = Math.max(nums[i] + dp[i + 2], dp[i + 1]);
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(massage(nums));
    }
}
