package com.masonluo.leetcode._贪心算法;

/**
 * @author Masonluo
 * @date 2020-09-29 11:19
 */
public class _55_跳跃游戏 {
    public boolean canJump(int[] nums) {
        int maxDistance = 0;
        for (int i = 0; i < nums.length; i++){
            maxDistance = Math.max(maxDistance, i + nums[i]);
            if (maxDistance <= i){
                return false;
            }
        }
        return maxDistance >= nums.length - 1;
    }
}
