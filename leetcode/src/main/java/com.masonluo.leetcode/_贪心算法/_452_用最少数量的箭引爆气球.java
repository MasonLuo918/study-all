package com.masonluo.leetcode._贪心算法;

import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-09-26 09:10
 */
public class _452_用最少数量的箭引爆气球 {
    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            }
            return Integer.compare(o1[1], o2[1]);
        });
        int count = 1, lastEnd = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > lastEnd) {
                count++;
                lastEnd = points[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findMinArrowShots(new int[][]{
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        }));
    }
}
