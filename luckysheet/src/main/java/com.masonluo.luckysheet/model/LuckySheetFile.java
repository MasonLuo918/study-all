package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.masonluo.luckysheet.annotation.ServerDoesNotNeed;
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
    @JsonProperty("name")
    private String name;

    /**
     * luckysheet 颜色
     */
    @JsonProperty("color")
    private Color color;

    /**
     * 工作表的索引
     */
    @JsonProperty("index")
    private Integer index;

    /**
     * 工作表的顺序
     */
    @JsonProperty("order")
    private Integer order;

    /**
     * 是否隐藏，1为隐藏，0为不隐藏
     */
    @JsonProperty("hide")
    private Integer hide;

    /**
     * 行数
     */
    @JsonProperty("row")
    private Integer row;

    /**
     * 列数
     */
    @JsonProperty("column")
    private Integer column;

    /**
     * 初始化单元格使用的数据
     */
    @JsonProperty("celldata")
    private List<InitialCell> cellData;

    /**
     * 工作表整体配置
     */
    @JsonProperty("config")
    private SheetConfig config;

    /**
     * 左右滚动条位置
     */
    @JsonProperty("scrollLeft")
    private Integer scrollLeft;

    /**
     * 上下滚动条位置
     */
    @JsonProperty("scrollTop")
    private Integer scrollTop;

    /**
     * 公式，不要被chain误导，表明一个单元格的公式等
     */
    @JsonProperty("calcChain")
    private List<Func> calcChain;

    /**
     * 所有行的位置信息
     */
    @JsonProperty("visibledatarow")
    private List<Integer> visibleDataRow;

    /**
     * 所有列的未知信息
     */
    @JsonProperty("visibledatacolumn")
    private List<Integer> visibleDataColumn;

    /**
     * 工作表宽度
     */
    @JsonProperty("ch_width")
    private Integer sheetWidth;

    /**
     * 工作表高度
     */
    @JsonProperty("rh_height")
    private Integer sheetHeight;

    /**
     * 是否被加载了
     */
    @JsonProperty("load")
    private Integer load;

    /**
     * 实际上的数据
     */
    @JsonProperty("data")
    private Cell[][] data;

    /**
     * 选中框的位置
     */
    @JsonProperty("luckysheet_select_save")
    @ServerDoesNotNeed
    private List<Range> luckysheetSelectSave;

    /**
     * TODO 未知属性
     */
    @JsonProperty("pivotTable")
    private boolean pivotTable;

    /**
     * TODO 未知属性
     */
    @JsonProperty("pivot_table_config")
    private Object pivotTableConfig;

    /**
     * TODO 未知属性
     */
    @JsonProperty("filter_select")
    private Range filterSelect;

    /**
     * TODO 未知属性
     */
    @JsonProperty("filter")
    private Object filter;

    /**
     * TODO 未知属性
     */
    @JsonProperty("luckysheet_alternateformat_save")
    private Object luckysheetAlternateFormatSave;

    /**
     * TODO 未知属性
     */
    @JsonProperty("luckysheet_alternateformat_save_modelCustom")
    private Object luckysheetAlternateFormatSaveModelCustom;

    /**
     * TODO 未知属性
     */
    @JsonProperty("luckysheet_conditionformat_save")
    private Object luckysheetConditionFormatSave;

    /**
     * TODO 未知属性
     */
    @JsonProperty("frozen")
    private Object frozen;

    /**
     * TODO 未知属性
     */
    @JsonProperty("chart")
    private Object chart;

    /**
     * TODO 未知属性
     */
    @JsonProperty("image")
    private Object image;

    /**
     * 是否允许编辑
     */
    @JsonProperty("allowEdit")
    private boolean allowEdit;

    /**
     * 缩放比例
     */
    @JsonProperty("zoomRatio")
    private double zoomRatio;

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
