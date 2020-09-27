package com.masonluo.leetcode._双指针;

import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-09-26 09:48
 */
public class _26_删除排序数组中的重复项 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                swap(nums, fast, slow);
            }
            fast++;
        }
        return slow + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
