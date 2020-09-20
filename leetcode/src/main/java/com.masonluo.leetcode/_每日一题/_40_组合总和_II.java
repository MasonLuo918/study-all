package com.masonluo.leetcode._每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-10 08:20
 */
public class _40_组合总和_II {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        Arrays.sort(candidates);
        combinationSum2(candidates, target, result, tmp, 0);
        return result;
    }

    private static void combinationSum2(int[] candidates, int target, List<List<Integer>> result, LinkedList<Integer> tmp, int begin) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }
            tmp.addLast(candidates[i]);
            combinationSum2(candidates, target - candidates[i], result, tmp, i + 1);
            tmp.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }
}
