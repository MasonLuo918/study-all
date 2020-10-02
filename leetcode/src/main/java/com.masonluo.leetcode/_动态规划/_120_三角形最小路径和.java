package com.masonluo.leetcode._动态规划;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-10-02 15:15
 */
public class _120_三角形最小路径和 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0){
            return 0;
        }
        int rows = triangle.size();
        int cols = triangle.get(rows - 1).size();
        int[][] dp = new int[rows][cols];
        List<Integer> last = triangle.get(rows - 1);
        for (int i = 0; i < last.size(); i++) {
            dp[rows - 1][i] = last.get(i);
        }
        for (int i = rows - 2; i >= 0; i--) {
            last = triangle.get(i);
            for (int j = 0; j < last.size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + last.get(j);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] param = {
                {2}
        };
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < param.length; i++){
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < param[i].length; j++){
                tmp.add(param[i][j]);
            }
            list.add(tmp);
        }
        System.out.println(minimumTotal(list));
    }
}
