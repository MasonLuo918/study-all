package com.masonluo.leetcode._剑指offer;

/**
 * @author Masonluo
 * @date 2020-09-20 09:30
 */
public class _剑指Offer42_连续子数组的最大和 {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int[] dp = new int[len];
        int max = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            if (dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
