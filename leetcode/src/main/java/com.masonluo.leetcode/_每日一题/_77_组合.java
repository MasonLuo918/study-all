package com.masonluo.leetcode._每日一题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-08 08:29
 */
public class _77_组合 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        combine(n, k, 0, result, temp);
        return result;
    }

    private static void combine(int n, int k, int start, List<List<Integer>> result, LinkedList<Integer> temp) {
        if (k == 0) {
            result.add(new ArrayList<>(temp));
        } else {
            for (int i = start + 1; i <= n; i++) {
                temp.add(i);
                combine(n, k - 1, i, result, temp);
                temp.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> result = combine(4, 2);
        System.out.println(result);
    }
}
