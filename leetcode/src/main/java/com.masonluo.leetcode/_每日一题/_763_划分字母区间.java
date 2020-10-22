package com.masonluo.leetcode._每日一题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-10-22 08:57
 */
public class _763_划分字母区间 {
    public static List<Integer> partitionLabels(String s) {
        if (s == null || s.length() == 0) {
            return Collections.emptyList();
        }
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int nowIdx = 0;
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c - 'a'] > right) {
                right = last[c - 'a'];
            }
            if (i == right) {
                res.add(right - left + 1);
                left = right + 1;
                right = left;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
}
