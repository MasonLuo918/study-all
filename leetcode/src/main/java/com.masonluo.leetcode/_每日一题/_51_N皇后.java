package com.masonluo.leetcode._每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-03 08:22
 */
public class _51_N皇后 {
    public static List<List<String>> solveNQueens(int n) {
        boolean[][] map = new boolean[n][n];
        List<List<String>> list = new ArrayList<>();
        solveNQueens(list, map, 0, n);
        return list;
    }

    private static void solveNQueens(List<List<String>> result, boolean[][] map, int row, int n) {
        if (row == n) {
            List<String> solve = resolveToList(map, n);
            result.add(solve);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (canPlace(map, row, j, n)) {
                map[row][j] = true;
                solveNQueens(result, map, row + 1, n);
                map[row][j] = false;
            }
        }
    }

    private static boolean canPlace(boolean[][] map, int row, int col, int n) {
        for (int i = row - 1; i >= 0; i--) {
            int k = row - i;
            if ((col - k >= 0 && map[i][col - k]) || (col + k < n && map[i][col + k]) || map[i][col]) {
                return false;
            }
        }
        return true;
    }

    private static List<String> resolveToList(boolean[][] map, int n) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j] ? "Q" : ".");
            }
            strings.add(sb.toString());
        }
        return strings;
    }

    public static void main(String[] args) {
        List<List<String>> list = solveNQueens(4);
        for (List<String> l : list) {
            for (String s : l){
                System.out.println(s);
            }

            System.out.println();
        }
    }
}
