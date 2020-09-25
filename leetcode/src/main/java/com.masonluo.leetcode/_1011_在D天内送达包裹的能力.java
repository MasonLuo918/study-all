package com.masonluo.leetcode;

/**
 * @author Masonluo
 * @date 2020-09-25 09:30
 */
public class _1011_在D天内送达包裹的能力 {
    public static int shipWithinDays(int[] weights, int D) {
        if (weights.length == 0) {
            return 0;
        }
        int[] sum = new int[weights.length];
        int max = sum[0] = weights[0];
        for (int i = 1; i < weights.length; i++) {
            sum[i] = weights[i] + sum[i - 1];
            if (max < weights[i]) {
                max = weights[i];
            }
        }
        int len = weights.length;
        int low = max, high = sum[len - 1];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(sum, D, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean canShip(int[] sum, int D, int canWeight) {
        int lastIdx = -1;
        int count = 0;
        for (int i = 0; i < sum.length; i++) {
            int tmp = lastIdx == -1 ? sum[i] : sum[i] - sum[lastIdx];
            if (canWeight < tmp) {
                count++;
                lastIdx = i - 1;
                i--;
            } else if (i == sum.length - 1) {
                count++;
                lastIdx = i;
            }
        }
        return count <= D;
    }

    public static void main(String[] args) {
//        int[] sum = {1, 3, 6, 10, 15, 21, 28, 36, 45, 55};
//        System.out.println(canShip(sum, 5, 15));
        int[] sum = {1, 2, 3, 1, 1};
        System.out.println(shipWithinDays(sum, 4));
    }
}
