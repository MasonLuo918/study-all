package com.masonluo.luckysheet.model.border;

/**
 * @author Masonluo
 * @date 2020-09-27 15:16
 */
public class CellBorder {
    private Integer rowIndex;

    private Integer colIndex;

    private BorderLine left;

    private BorderLine right;

    private BorderLine top;

    private BorderLine bottom;

    public Integer getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    public Integer getColIndex() {
        return colIndex;
    }

    public void setColIndex(Integer colIndex) {
        this.colIndex = colIndex;
    }

    public BorderLine getLeft() {
        return left;
    }

    public void setLeft(BorderLine left) {
        this.left = left;
    }

    public BorderLine getRight() {
        return right;
    }

    public void setRight(BorderLine right) {
        this.right = right;
    }

    public BorderLine getTop() {
        return top;
    }

    public void setTop(BorderLine top) {
        this.top = top;
    }

    public BorderLine getBottom() {
        return bottom;
    }

    public void setBottom(BorderLine bottom) {
        this.bottom = bottom;
    }
}
