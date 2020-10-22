package com.masonluo.leetcode._程序员面试金典;

/**
 * @author Masonluo
 * @date 2020-10-22 11:09
 */
public class _面试题_10_03_搜索旋转数组 {
    public static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // 左边单调递增
            if (arr[mid] > arr[low]) {
                if (target <= arr[mid] && target >= arr[low]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < arr[low]) {
                if (target >= arr[mid] && target <= arr[high]) {
                    low = mid;
                } else {
                    high = mid - 1;
                }
            } else {
                if (arr[low] == target) {
                    return low;
                } else {
                    low++;
                }
            }
        }
        if (low >= arr.length) return -1;
        return arr[low] == target ? low : -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}, 11));
    }
}
