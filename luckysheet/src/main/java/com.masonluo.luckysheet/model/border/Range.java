package com.masonluo.luckysheet.model.border;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-27 15:21
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Range {
    private List<Integer> row;

    private List<Integer> column;

    public List<Integer> getRow() {
        return row;
    }

    public void setRow(List<Integer> row) {
        this.row = row;
    }

    public List<Integer> getColumn() {
        return column;
    }

    public void setColumn(List<Integer> column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Range{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
