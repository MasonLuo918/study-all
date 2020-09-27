package com.masonluo.leetcode._并查集;

/**
 * @author Masonluo
 * @date 2020-09-27 13:48
 */
public class _130_被围绕的区域 {
    public static void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }
        int rows = board.length, cols = board[0].length;
        UF uf = new UF(rows * cols + 1);
        int dummy = rows * cols;
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                uf.union(dummy, i * cols);
            }
            if (board[i][cols - 1] == 'O') {
                uf.union(dummy, i * cols + cols - 1);
            }
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') {
                uf.union(dummy, j);
            }
            if (board[rows - 1][j] == 'O') {
                uf.union(dummy, cols * (rows - 1) + j);
            }
        }
        int[][] d = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (board[i][j] == 'O') {
                    for (int k = 0; k < 4; k++) {
                        int x = i + d[k][0];
                        int y = j + d[k][1];
                        if (board[x][y] == 'O') {
                            uf.union(x * cols + y, i * cols + j);
                        }
                    }
                }
            }
        }

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (board[i][j] == 'O') {
                    if (!uf.connected(i * cols + j, dummy)) {
                        board[i][j] = 'X';
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] map = {
                {'O', 'X', 'O'},
                {'X', 'O', 'X'},
                {'O', 'X', 'O'}
        };
        solve(map);
        System.out.println();
    }
}
