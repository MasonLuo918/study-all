package com.masonluo.leetcode._每日一题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-20 09:08
 */
public class _78_子集 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        int len = nums.length;
        for (int i = 0; i <= len; i++) {
            subsets(nums, 0, i, result, tmp);
        }
        return result;
    }

    private static void subsets(int[] nums, int startIndex, int len, List<List<Integer>> res, LinkedList<Integer> tmp) {
        if (len == 0) {
            res.add(new ArrayList<>(tmp));
        } else {
            for (int i = startIndex; i < nums.length; i++) {
                tmp.addLast(nums[i]);
                subsets(nums, i + 1, len - 1, res, tmp);
                tmp.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }
}
