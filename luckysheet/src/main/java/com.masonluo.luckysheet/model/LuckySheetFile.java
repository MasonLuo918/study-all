package com.masonluo.luckysheet.model;

import com.masonluo.luckysheet.model.border.Range;

import java.util.Arrays;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-25 17:09
 */
public class LuckySheetFile {
    /**
     * luckeysheet 名字
     */
    private String name;

    /**
     * luckysheet 颜色
     */
    private Color color;

    private Integer index;

    private Integer order;

    private Integer hide;

    private Integer row;

    private Integer column;

    private List<InitialCell> cellData;

    private SheetConfig config;

    private Integer scrollLeft;

    private Integer scrollTop;

    private List<Range> luckysheetSelectSave;

    private List<Func> calcChain;

    private boolean pivotTable;

    // TODO 未知处理
    private Object pivotTableConfig;

    private Range filterSelect;

    // TODO 未知
    private Object filter;

    // TODO 未知
    private Object luckysheetAlternateFormatSave;

    // TODO 未知
    private Object luckysheetAlternateFormatSaveModelCustom;

    // TODO 未知
    private Object luckysheetConditionFormatSave;

    // TODO 未知
    private Object frozen;

    // TODO 未知
    private Object chart;

    private boolean allowEdit;

    private double zoomRatio;

    // TODO 未知
    private Object image;

    private List<Integer> visibleDataRow;

    private List<Integer> visibleDataColumn;

    private Integer sheetWidth;

    private Integer sheetHeight;

    private Integer load;

    private Cell[][] data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getHide() {
        return hide;
    }

    public void setHide(Integer hide) {
        this.hide = hide;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public List<InitialCell> getCellData() {
        return cellData;
    }

    public void setCellData(List<InitialCell> cellData) {
        this.cellData = cellData;
    }

    public SheetConfig getConfig() {
        return config;
    }

    public void setConfig(SheetConfig config) {
        this.config = config;
    }

    public Integer getScrollLeft() {
        return scrollLeft;
    }

    public void setScrollLeft(Integer scrollLeft) {
        this.scrollLeft = scrollLeft;
    }

    public Integer getScrollTop() {
        return scrollTop;
    }

    public void setScrollTop(Integer scrollTop) {
        this.scrollTop = scrollTop;
    }

    public List<Range> getLuckysheetSelectSave() {
        return luckysheetSelectSave;
    }

    public void setLuckysheetSelectSave(List<Range> luckysheetSelectSave) {
        this.luckysheetSelectSave = luckysheetSelectSave;
    }

    public List<Func> getCalcChain() {
        return calcChain;
    }

    public void setCalcChain(List<Func> calcChain) {
        this.calcChain = calcChain;
    }

    public boolean isPivotTable() {
        return pivotTable;
    }

    public void setPivotTable(boolean pivotTable) {
        this.pivotTable = pivotTable;
    }

    public Object getPivotTableConfig() {
        return pivotTableConfig;
    }

    public void setPivotTableConfig(Object pivotTableConfig) {
        this.pivotTableConfig = pivotTableConfig;
    }

    public Range getFilterSelect() {
        return filterSelect;
    }

    public void setFilterSelect(Range filterSelect) {
        this.filterSelect = filterSelect;
    }

    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    public Object getLuckysheetAlternateFormatSave() {
        return luckysheetAlternateFormatSave;
    }

    public void setLuckysheetAlternateFormatSave(Object luckysheetAlternateFormatSave) {
        this.luckysheetAlternateFormatSave = luckysheetAlternateFormatSave;
    }

    public Object getLuckysheetAlternateFormatSaveModelCustom() {
        return luckysheetAlternateFormatSaveModelCustom;
    }

    public void setLuckysheetAlternateFormatSaveModelCustom(Object luckysheetAlternateFormatSaveModelCustom) {
        this.luckysheetAlternateFormatSaveModelCustom = luckysheetAlternateFormatSaveModelCustom;
    }

    public Object getLuckysheetConditionFormatSave() {
        return luckysheetConditionFormatSave;
    }

    public void setLuckysheetConditionFormatSave(Object luckysheetConditionFormatSave) {
        this.luckysheetConditionFormatSave = luckysheetConditionFormatSave;
    }

    public Object getFrozen() {
        return frozen;
    }

    public void setFrozen(Object frozen) {
        this.frozen = frozen;
    }

    public Object getChart() {
        return chart;
    }

    public void setChart(Object chart) {
        this.chart = chart;
    }

    public boolean isAllowEdit() {
        return allowEdit;
    }

    public void setAllowEdit(boolean allowEdit) {
        this.allowEdit = allowEdit;
    }

    public double getZoomRatio() {
        return zoomRatio;
    }

    public void setZoomRatio(double zoomRatio) {
        this.zoomRatio = zoomRatio;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public List<Integer> getVisibleDataRow() {
        return visibleDataRow;
    }

    public void setVisibleDataRow(List<Integer> visibleDataRow) {
        this.visibleDataRow = visibleDataRow;
    }

    public List<Integer> getVisibleDataColumn() {
        return visibleDataColumn;
    }

    public void setVisibleDataColumn(List<Integer> visibleDataColumn) {
        this.visibleDataColumn = visibleDataColumn;
    }

    public Integer getSheetWidth() {
        return sheetWidth;
    }

    public void setSheetWidth(Integer sheetWidth) {
        this.sheetWidth = sheetWidth;
    }

    public Integer getSheetHeight() {
        return sheetHeight;
    }

    public void setSheetHeight(Integer sheetHeight) {
        this.sheetHeight = sheetHeight;
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    public Cell[][] getData() {
        return data;
    }

    public void setData(Cell[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LuckySheetFile{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", index=" + index +
                ", order=" + order +
                ", hide=" + hide +
                ", row=" + row +
                ", column=" + column +
                ", cellData=" + cellData +
                ", config=" + config +
                ", scrollLeft=" + scrollLeft +
                ", scrollTop=" + scrollTop +
                ", luckysheetSelectSave=" + luckysheetSelectSave +
                ", calcChain=" + calcChain +
                ", pivotTable=" + pivotTable +
                ", pivotTableConfig=" + pivotTableConfig +
                ", filterSelect=" + filterSelect +
                ", filter=" + filter +
                ", luckysheetAlternateFormatSave=" + luckysheetAlternateFormatSave +
                ", luckysheetAlternateFormatSaveModelCustom=" + luckysheetAlternateFormatSaveModelCustom +
                ", luckysheetConditionFormatSave=" + luckysheetConditionFormatSave +
                ", frozen=" + frozen +
                ", chart=" + chart +
                ", allowEdit=" + allowEdit +
                ", zoomRatio=" + zoomRatio +
                ", image=" + image +
                ", visibleDataRow=" + visibleDataRow +
                ", visibleDataColumn=" + visibleDataColumn +
                ", sheetWidth=" + sheetWidth +
                ", sheetHeight=" + sheetHeight +
                ", load=" + load +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
