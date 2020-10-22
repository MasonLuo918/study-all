package com.masonluo.luckysheet.model.border;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Masonluo
 * @date 2020-09-27 15:16
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class CellBorder {
    @JsonProperty("row_index")
    private Integer rowIndex;

    @JsonProperty("col_index")
    private Integer colIndex;

    @JsonProperty("l")
    private BorderLine left;

    @JsonProperty("r")
    private BorderLine right;

    @JsonProperty("t")
    private BorderLine top;

    @JsonProperty("b")
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

    @Override
    public String toString() {
        return "CellBorder{" +
                "rowIndex=" + rowIndex +
                ", colIndex=" + colIndex +
                ", left=" + left +
                ", right=" + right +
                ", top=" + top +
                ", bottom=" + bottom +
                '}';
    }
}
