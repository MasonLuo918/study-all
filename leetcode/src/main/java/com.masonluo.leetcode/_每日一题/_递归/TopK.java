package com.masonluo.leetcode._每日一题._递归;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Masonluo
 * @date 2020-10-19 14:37
 */
public class TopK {

    public static List<Integer> topk(int[] array, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(n);
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (queue.size() < n) {
                queue.add(num);
            } else {
                int top = queue.element();
                if (top < num) {
                    queue.remove();
                    queue.add(num);
                }
            }
        }
        Integer[] nums = queue.toArray(new Integer[0]);
        Arrays.sort(nums);
        return new ArrayList<>(Arrays.asList(nums));
    }

    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int tmpSum = nums[low] + nums[high];
            if (tmpSum == target) {
                return new int[]{low, high};
            } else if (tmpSum > target) {
                high--;
            } else {
                low++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
    }
}
