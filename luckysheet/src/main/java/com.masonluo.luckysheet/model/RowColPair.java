package com.masonluo.luckysheet.model;

/**
 * 合并的主单元格row、col键
 *
 * @author Masonluo
 * @date 2020-09-25 17:14
 */
public class RowColPair {
    private int row;

    private int col;

    public RowColPair(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public String toString() {
        return "" + row + "_" + col;
    }
}
