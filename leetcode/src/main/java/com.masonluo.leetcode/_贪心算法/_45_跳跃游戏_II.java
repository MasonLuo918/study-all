package com.masonluo.leetcode._贪心算法;

/**
 * @author Masonluo
 * @date 2020-09-29 11:34
 */
public class _45_跳跃游戏_II {
    public static int jump(int[] nums) {
        int n = nums.length, farest = 0, end = 0, jump = 0;
        for (int i = 0; i < n - 1; i++) {
            farest = Math.max(nums[i] + i, farest);
            if (end == i){
                jump++;
                end = farest;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 1, 4, 1, 2}));
    }
}
