package com.masonluo.leetcode._剑指offer;

import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-09-23 09:57
 */
public class _剑指_Offer_51_数组中的逆序对 {

    static int num = 0;

    public static int reversePairs(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        mergeSort(nums, 0, nums.length - 1);
        return num;
    }

    private static void mergeSort(int[] nums, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        mergeSort(nums, startIndex, mid);
        mergeSort(nums, mid + 1, endIndex);
        merge(nums, startIndex, mid, endIndex);
    }

    private static void merge(int[] nums, int startIndex, int mid, int endIndex) {
        int[] tmp = new int[endIndex - startIndex + 1];
        int p = tmp.length - 1;
        int temp = mid + 1;
        while (mid >= startIndex && endIndex >= temp) {
            num = nums[mid] > nums[endIndex] ? num + endIndex - temp + 1 : num;
            tmp[p--] = nums[mid] > nums[endIndex] ? nums[mid--] : nums[endIndex--];
        }
        while (mid >= startIndex) tmp[p--] = nums[mid--];
        while (endIndex >= temp) tmp[p--] = nums[endIndex--];
        for (int i = 0; i < tmp.length; i++) nums[startIndex + i] = tmp[i];
    }

    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 4, 2, 243, 11, 214, 14, 134, 215, 15, 1, 51, 51, 2, 35, 1, 2341, 341, 341, 41, 1414, 32, 53, 1, 5, 1351};
        reversePairs(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(num);
    }
}
