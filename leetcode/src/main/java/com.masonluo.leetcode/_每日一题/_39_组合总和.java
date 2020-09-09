package com.masonluo.leetcode._每日一题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-09 08:16
 */
public class _39_组合总和 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        dfs(candidates, target, 0, result, tmp);
        return result;
    }

    private static void dfs(int[] candidates, int target, int begin, List<List<Integer>> result, LinkedList<Integer> tmp) {
        if (target == 0) {
            result.add(new ArrayList<>(tmp));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            tmp.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], i, result, tmp);
            tmp.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 5}, 8));
    }
}
