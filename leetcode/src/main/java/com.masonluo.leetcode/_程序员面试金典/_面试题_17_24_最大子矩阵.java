package com.masonluo.leetcode._程序员面试金典;

/**
 * @author Masonluo
 * @date 2020-10-13 16:12
 */
public class _面试题_17_24_最大子矩阵 {

    public static int[] getMaxMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[]{0, 0, 0};
        }
        int max = Integer.MIN_VALUE, leftRow = -1, leftCol = -1, rightRow = -1, rightCol = -1;
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            int col = matrix[i].length;
            int[] tmp = new int[col];
            for (int j = i; j < len; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    tmp[k] += matrix[j][k];
                }
                TmpResult res = getMaxSubArray(tmp);
                if (res.max > max) {
                    max = res.max;
                    leftRow = i;
                    leftCol = res.start;
                    rightRow = j;
                    rightCol = res.end;
                }
            }
        }
        return new int[]{leftRow, leftCol, rightRow, rightCol};
    }


    public static TmpResult getMaxSubArray(int[] arr) {
        int len = arr.length;
        int[] dp = new int[len];
        dp[0] = arr[0];
        int maxSub = dp[0], startIdx = 0, endIdx = 0;
        int maxStartIdx = 0, maxEndIdx = 0;
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            if (arr[i] > dp[i - 1] + arr[i]) {
                startIdx = i;
                endIdx = i;
            } else {
                endIdx = i;
            }

            if (maxSub < dp[i]) {
                maxSub = dp[i];
                maxStartIdx = startIdx;
                maxEndIdx = endIdx;
            }
        }
        return new TmpResult(maxSub, maxStartIdx, maxEndIdx);
    }

    static class TmpResult {
        int max;

        int start;

        int end;

        public TmpResult() {
        }

        public TmpResult(int max, int start, int end) {
            this.max = max;
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
    }
}
