package com.masonluo.luckysheet.model;

import com.masonluo.luckysheet.model.border.BorderInfo;

import java.util.List;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-09-25 17:10
 */
public class SheetConfig {
    private Map<RowColPair, MergeCell> merge;

    private Map<String, Integer> rowLen;

    private Map<String, Integer> columnLen;

    private Map<String, Integer> rowHidden;

    private Map<String, Integer> colHidden;

    private List<BorderInfo> borderInfo;

    public Map<RowColPair, MergeCell> getMerge() {
        return merge;
    }

    public void setMerge(Map<RowColPair, MergeCell> merge) {
        this.merge = merge;
    }

    public Map<String, Integer> getRowLen() {
        return rowLen;
    }

    public void setRowLen(Map<String, Integer> rowLen) {
        this.rowLen = rowLen;
    }

    public Map<String, Integer> getColumnLen() {
        return columnLen;
    }

    public void setColumnLen(Map<String, Integer> columnLen) {
        this.columnLen = columnLen;
    }

    public Map<String, Integer> getRowHidden() {
        return rowHidden;
    }

    public void setRowHidden(Map<String, Integer> rowHidden) {
        this.rowHidden = rowHidden;
    }

    public Map<String, Integer> getColHidden() {
        return colHidden;
    }

    public void setColHidden(Map<String, Integer> colHidden) {
        this.colHidden = colHidden;
    }

    public List<BorderInfo> getBorderInfo() {
        return borderInfo;
    }

    public void setBorderInfo(List<BorderInfo> borderInfo) {
        this.borderInfo = borderInfo;
    }
}
