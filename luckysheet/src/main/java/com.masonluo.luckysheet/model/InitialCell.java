package com.masonluo.luckysheet.model;

/**
 * @author Masonluo
 * @date 2020-09-25 17:06
 */
public class InitialCell {
    private String row;

    private String col;

    private Cell value;

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public Cell getValue() {
        return value;
    }

    public void setValue(Cell value) {
        this.value = value;
    }

    public InitialCell(String row, String col, Cell value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }
}
