package com.masonluo.leetcode._字符串的全排列;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-19 21:01
 */
public class _46_全排列 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        dfs(nums, result, tmp, 0);
        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result, LinkedList<Integer> tmp, int startIndex) {
        if (startIndex == nums.length) {
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            swap(nums, startIndex, i);
            tmp.add(nums[startIndex]);
            dfs(nums, result, tmp, startIndex + 1);
            swap(nums, startIndex, i);
            tmp.removeLast();
        }
    }

    private void swap(int[] nums, int startIndex, int i) {
        int temp = nums[startIndex];
        nums[startIndex] = nums[i];
        nums[i] = temp;
    }
}
