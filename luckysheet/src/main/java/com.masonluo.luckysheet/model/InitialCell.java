package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Masonluo
 * @date 2020-09-25 17:06
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class InitialCell {
    @JsonProperty("r")
    private String row;

    @JsonProperty("c")
    private String col;

    @JsonProperty("v")
    private Cell value;


    public InitialCell() {
    }

    public InitialCell(String row, String col, Cell value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }


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

    @Override
    public String toString() {
        return "InitialCell{" +
                "row='" + row + '\'' +
                ", col='" + col + '\'' +
                ", value=" + value +
                '}';
    }
}
