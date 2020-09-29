package com.masonluo.leetcode._双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-29 11:49
 */
public class _56_合并区间 {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, (interval1, interval2) -> interval1[0] - interval2[0]);

        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int l = intervals[i][0], r = intervals[i][1];
            if (res.size() == 0 || res.get(res.size() - 1)[1] < l) {
                res.add(new int[]{l, r});
            } else {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], r);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] param = {
                {1, 4},
                {4, 5},
        };
        int[][] res = merge(param);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
