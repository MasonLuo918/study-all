package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.masonluo.luckysheet.Conveter.ColorDeserializer;
import com.masonluo.luckysheet.Conveter.ColorSerializer;

/**
 * 一个单元格
 *
 * @author Masonluo
 * @date 2020-09-25 15:28
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Cell {

    /**
     * 单元格的值格式，根据某种格式化格式来对单元格里面的文字进行格式化
     */
    @JsonProperty("ct")
    private CellType cellType;

    /**
     * 背景颜色，格式为#fff000
     */
    @JsonProperty("bg")
    private String background;

    /**
     * 字体
     */
    @JsonProperty("ff")
    private Font fontFamily;

    /**
     * 字体颜色
     */
    @JsonProperty("fc")
    @JsonSerialize(using = ColorSerializer.class)
    @JsonDeserialize(using = ColorDeserializer.class)
    private Color fontColor;

    /**
     * 字体大小
     */
    @JsonProperty("fs")
    private Integer fontSize;

    /**
     * 是否加粗，0为常规，1为加粗
     */
    @JsonProperty("bl")
    private Integer bold;

    /**
     * 是否为斜体，0为常规，1为斜体
     */
    @JsonProperty("it")
    private Integer italic;

    /**
     * 是否有删除线，0为常规，1为删除线
     */
    @JsonProperty("cl")
    private Integer cancelLine;

    /**
     * 垂直对齐类型，0为中间，1为上对齐，2为下对齐
     */
    @JsonProperty("vt")
    private Integer verticalType;

    /**
     * 水平对齐类型，0为居中，1为左对齐，2为右对齐
     */
    @JsonProperty("ht")
    private Integer horizontalType;

    /**
     * 合并的单元格
     */
    @JsonProperty("mc")
    private MergeCell mergeCell;

    /**
     * 文字旋转类型，0为不旋转，1为左下->右上，2为左上->右下，3为垂直
     */
    @JsonProperty("tr")
    private Integer textRotate;

    /**
     * 文字旋转角度，介于0-180之间(包含0-180)
     */
    @JsonProperty("rt")
    private Integer rotateText;

    /**
     * 文本换行，0为截断，1为溢出，2为自动换行
     */
    @JsonProperty("tb")
    private Integer textBeak;

    /**
     * 原始值
     */
    @JsonProperty("v")
    private String value;

    /**
     * 显示值
     */
    @JsonProperty("m")
    private String monitor;

    /**
     * 公式
     */
    @JsonProperty("f")
    private String function;

    /**
     * 批注
     */
    @JsonProperty("ps")
    private Comment comment;

    /**
     * 是否允许编辑
     */
    @JsonProperty("ae")
    private Boolean allowEdit;

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Font getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(Font fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Color getFontColor() {
        return fontColor;
    }

    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }

    public Integer getBold() {
        return bold;
    }

    public void setBold(Integer bold) {
        this.bold = bold;
    }

    public Integer getItalic() {
        return italic;
    }

    public void setItalic(Integer italic) {
        this.italic = italic;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public Integer getCancelLine() {
        return cancelLine;
    }

    public void setCancelLine(Integer cancelLine) {
        this.cancelLine = cancelLine;
    }

    public Integer getVerticalType() {
        return verticalType;
    }

    public void setVerticalType(Integer verticalType) {
        this.verticalType = verticalType;
    }

    public Integer getHorizontalType() {
        return horizontalType;
    }

    public void setHorizontalType(Integer horizontalType) {
        this.horizontalType = horizontalType;
    }

    public MergeCell getMergeCell() {
        return mergeCell;
    }

    public void setMergeCell(MergeCell mergeCell) {
        this.mergeCell = mergeCell;
    }

    public Integer getTextRotate() {
        return textRotate;
    }

    public void setTextRotate(Integer textRotate) {
        this.textRotate = textRotate;
    }

    public Integer getRotateText() {
        return rotateText;
    }

    public void setRotateText(Integer rotateText) {
        this.rotateText = rotateText;
    }

    public Integer getTextBeak() {
        return textBeak;
    }

    public void setTextBeak(Integer textBeak) {
        this.textBeak = textBeak;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Boolean getAllowEdit() {
        return allowEdit;
    }

    public void setAllowEdit(Boolean allowEdit) {
        this.allowEdit = allowEdit;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "cellType=" + cellType +
                ", background='" + background + '\'' +
                ", fontFamily=" + fontFamily +
                ", fontColor=" + fontColor +
                ", fontSize=" + fontSize +
                ", bold=" + bold +
                ", italic=" + italic +
                ", cancelLine=" + cancelLine +
                ", verticalType=" + verticalType +
                ", horizontalType=" + horizontalType +
                ", mergeCell=" + mergeCell +
                ", textRotate=" + textRotate +
                ", rotateText=" + rotateText +
                ", textBeak=" + textBeak +
                ", value='" + value + '\'' +
                ", monitor='" + monitor + '\'' +
                ", function='" + function + '\'' +
                ", comment=" + comment +
                ", allowEdit=" + allowEdit +
                '}';
    }
}
