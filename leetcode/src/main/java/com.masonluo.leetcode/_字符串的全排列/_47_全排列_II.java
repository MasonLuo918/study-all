package com.masonluo.leetcode._字符串的全排列;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-19 21:27
 */
public class _47_全排列_II {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }
//        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        dfs(nums, result, tmp, 0);
        return result;
    }

    private static void dfs(int[] nums, List<List<Integer>> result, LinkedList<Integer> tmp, int startIndex) {
        if (startIndex == nums.length) {
            result.add(new ArrayList<>(tmp));
        } else {
            for (int i = startIndex; i < nums.length; i++) {
                boolean hasOccur = false;
                for (int j = startIndex; j < i; j++) {
                    if (nums[j] == nums[i]) {
                        hasOccur = true;
                        break;
                    }
                }
                if (hasOccur) {
                    continue;
                }
                swap(nums, startIndex, i);
                tmp.add(nums[startIndex]);
                dfs(nums, result, tmp, startIndex + 1);
                swap(nums, startIndex, i);
                tmp.removeLast();
            }
        }
    }

    private static void swap(int[] nums, int startIndex, int i) {
        int temp = nums[startIndex];
        nums[startIndex] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1, 1, 2, 2}));
    }
}
