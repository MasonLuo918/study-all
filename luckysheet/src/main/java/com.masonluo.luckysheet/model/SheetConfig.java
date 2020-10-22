package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.masonluo.luckysheet.Conveter.RowColPairDeserializer;
import com.masonluo.luckysheet.model.border.BorderInfo;

import java.util.List;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-09-25 17:10
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class SheetConfig {

    @JsonProperty("merge")
    @JsonDeserialize(keyUsing = RowColPairDeserializer.class)
    private Map<RowColPair, MergeCell> merge;

    @JsonProperty("rowlen")
    private Map<String, Integer> rowLen;

    @JsonProperty("columnlen")
    private Map<String, Integer> columnLen;

    @JsonProperty("rowhidden")
    private Map<String, Integer> rowHidden;

    @JsonProperty("colhidden")
    private Map<String, Integer> colHidden;

    @JsonProperty("borderInfo")
    private List<BorderInfo> borderInfo;

    @JsonProperty("customHeight")
    private Map<Integer, Integer> customHeight;

    @JsonProperty("customWidth")
    private Map<Integer, Integer> customWidth;

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

    public Map<Integer, Integer> getCustomHeight() {
        return customHeight;
    }

    public void setCustomHeight(Map<Integer, Integer> customHeight) {
        this.customHeight = customHeight;
    }

    public Map<Integer, Integer> getCustomWidth() {
        return customWidth;
    }

    public void setCustomWidth(Map<Integer, Integer> customWidth) {
        this.customWidth = customWidth;
    }

    @Override
    public String toString() {
        return "SheetConfig{" +
                "merge=" + merge +
                ", rowLen=" + rowLen +
                ", columnLen=" + columnLen +
                ", rowHidden=" + rowHidden +
                ", colHidden=" + colHidden +
                ", borderInfo=" + borderInfo +
                ", customHeight=" + customHeight +
                ", customWidth=" + customWidth +
                '}';
    }
}
