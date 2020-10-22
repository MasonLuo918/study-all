package com.masonluo.leetcode._每日一题;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-10-14 09:57
 */
public class _1002_查找常用字符 {
    public static List<String> commonChars(String[] A) {
        int[] minCount = new int[26];
        for (int i = 0; i < minCount.length; i++) {
            minCount[i] = Integer.MAX_VALUE;
        }
        for (String s : A) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < count.length; i++) {
                minCount[i] = Math.min(minCount[i], count[i]);
            }
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (minCount[i] > 0) {
                for (int j = 0; j < minCount[i]; j++) {
                    res.add(String.valueOf((char) (i + 'a')));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"cool", "lock", "cook"}));
    }
}
