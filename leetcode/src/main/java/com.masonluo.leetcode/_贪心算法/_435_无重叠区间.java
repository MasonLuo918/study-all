package com.masonluo.leetcode._贪心算法;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Masonluo
 * @date 2020-09-26 08:48
 */
public class _435_无重叠区间 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (Comparator<int[]>) (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            }
            return Integer.compare(o1[1], o2[1]);
        });
        int count = 0, lastEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd) {
                count++;
            } else {
                lastEnd = intervals[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 3}
        }));
    }
}
