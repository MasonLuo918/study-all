package com.masonluo.leetcode._滑动窗口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-23 17:50
 */
public class _剑指Offer57_II和为s的连续正数序列 {
    public static int[][] findContinuousSequence(int target) {
        int i = 1, j = 1;
        int sum = 0;
        List<int[]> res = new ArrayList<>();
        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] arr = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        for (int[] i : findContinuousSequence(9)){
            System.out.println(Arrays.toString(i));
        }
    }
}
