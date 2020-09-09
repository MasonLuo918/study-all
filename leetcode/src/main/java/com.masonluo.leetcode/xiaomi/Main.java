package com.masonluo.leetcode.xiaomi;

import java.util.Scanner;

/**
 * @author Masonluo
 * @date 2020-09-08 18:10
 */
public class Main {
    public boolean exist(char[][] map, String word) {
        int rows = map.length;
        int cols = map[0].length;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                boolean[][] visited = new boolean[rows][cols];
                if (exist(map, word, 0, i, j, rows, cols, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] map, String word, int nowIndex, int row, int col, int rows, int cols, boolean[][] visited) {
        if (nowIndex == word.length()) {
            return true;
        } else if (!save(row, col, rows, cols)) {
            return false;
        } else if (word.charAt(nowIndex) != map[row][col] || visited[row][col]) {
            return false;
        } else {
            visited[row][col] = true;
            boolean result = exist(map, word, nowIndex + 1, row, col + 1, rows, cols, visited)
                    | exist(map, word, nowIndex + 1, row + 1, col, rows, cols, visited)
                    | exist(map, word, nowIndex + 1, row, col - 1, rows, cols, visited)
                    | exist(map, word, nowIndex + 1, row - 1, col, rows, cols, visited);
            visited[row][col] = false;
            return result;
        }
    }

    private boolean save(int i, int j, int rows, int cols) {
        return i >= 0 && i < rows && j >= 0 && j < cols;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        char[][] map = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        String str = scanner.next();
        System.out.println(main.exist(map, str.toUpperCase()));
    }
}
