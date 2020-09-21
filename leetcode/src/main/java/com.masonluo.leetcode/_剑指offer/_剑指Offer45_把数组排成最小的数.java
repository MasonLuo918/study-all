package com.masonluo.leetcode._剑指offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Masonluo
 * @date 2020-09-20 10:21
 */
public class _剑指Offer45_把数组排成最小的数 {
    public static String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
