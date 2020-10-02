package com.masonluo.leetcode._双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-30 09:38
 */
public class _986_区间列表的交集 {
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        int aIdx = 0, bIdx = 0;
        List<int[]> res = new ArrayList<>();
        while (aIdx < A.length && bIdx < B.length) {
            int a0 = A[aIdx][0], a1 = A[aIdx][1];
            int b0 = B[bIdx][0], b1 = B[bIdx][1];
            if (interval(A[aIdx], B[bIdx])) {
                res.add(new int[]{Math.max(a0, b0), Math.min(a1, b1)});
            }
            if (b1 < a1) {
                bIdx++;
            } else {
                aIdx++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static boolean interval(int[] a, int[] b) {
        return !(a[1] < b[0] || b[1] < a[0]);
    }

    public static void main(String[] args) {
        int[][] A = {
                {0, 2}, {5, 10}, {13, 23}, {24, 25}
        };

        int[][] B = {
                {1, 5}, {8, 12}, {15, 24}, {25, 26}
        };
        int[][] res = intervalIntersection(A, B);
        for (int[] i : res){
            System.out.println(Arrays.toString(i));
        }
    }
}
