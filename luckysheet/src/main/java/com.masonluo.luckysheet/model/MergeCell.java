package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Masonluo
 * @date 2020-09-25 16:32
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class MergeCell {

    @JsonProperty("r")
    private Integer row;

    @JsonProperty("c")
    private Integer col;

    @JsonProperty("rs")
    private Integer rowSize;

    @JsonProperty("cs")
    private Integer colSize;

    // 是否是主单元格
    @JsonIgnore
    private boolean master;

    public MergeCell() {
    }

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

    @Override
    public String toString() {
        return "MergeCell{" +
                "row=" + row +
                ", col=" + col +
                ", rowSize=" + rowSize +
                ", colSize=" + colSize +
                ", master=" + master +
                '}';
    }
}
