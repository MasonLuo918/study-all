package com.masonluo.luckysheet.model;

/**
 * @author Masonluo
 * @date 2020-09-25 16:32
 */
public class MergeCell {
    private Integer row;

    private Integer col;

    private Integer rowSize;

    private Integer colSize;

    // 是否是主单元格
    private boolean master;

    public MergeCell(Integer row, Integer col) {
        this.row = row;
        this.col = col;
    }

    public MergeCell(Integer row, Integer col, Integer rowSize, Integer colSize) {
        this.row = row;
        this.col = col;
        this.rowSize = rowSize;
        this.colSize = colSize;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public Integer getRowSize() {
        return rowSize;
    }

    public void setRowSize(Integer rowSize) {
        this.rowSize = rowSize;
    }

    public Integer getColSize() {
        return colSize;
    }

    public void setColSize(Integer colSize) {
        this.colSize = colSize;
    }

    public boolean isMaster() {
        return master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }
}
