package com.masonluo.leetcode._双指针;

/**
 * @author Masonluo
 * @date 2020-09-29 08:24
 */
public class _42_接雨水 {
    public static int trap(int[] height) {
        if (height.length == 0){
            return 0;
        }
        int len = height.length;
        int left = 0, high = len - 1;
        int leftMax = height[left], rightMax = height[high];
        int res = 0;
        while (left <= high) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[high], rightMax);
            if (leftMax > rightMax) {
                res += rightMax - height[high];
                high--;
            } else {
                res += leftMax - height[left];
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
