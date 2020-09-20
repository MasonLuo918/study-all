package com.masonluo.leetcode._每日一题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-11 08:08
 */
public class _216_组合总和_III {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        dfs(k, n, 0, 1, result, tmp, 0);
        return result;
    }

    private static void dfs(int k, int n, int num, int start, List<List<Integer>> result, LinkedList<Integer> tmp, int sum) {
        if (num == k && sum == n) {
            result.add(new ArrayList<>(tmp));
            return;
        }
        if (num == k || sum == n) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            tmp.add(i);
            dfs(k, n, num + 1, i + 1, result, tmp, sum + i);
            tmp.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 15));
    }
}
