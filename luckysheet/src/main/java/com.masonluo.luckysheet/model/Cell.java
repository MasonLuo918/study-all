package com.masonluo.luckysheet.model;

/**
 * 一个单元格
 *
 * @author Masonluo
 * @date 2020-09-25 15:28
 */
public class Cell {

    private CellType cellType;

    private String background;

    private Font fontFamily;

    private Color fontColor;

    private Integer bold;

    private Integer italic;

    private Integer fontSize;

    private Integer cancelLine;

    private Integer verticalType;

    private Integer horizontalType;

    private MergeCell mergeCell;

    /**
     * 文字旋转类型，0为不旋转，1为左下->右上，2为左上->右下，3为垂直
     */
    private Integer textRotate;

    /**
     * 文字旋转角度，介于0-180之间(包含0-180)
     */
    private Integer rotateText;

    /**
     * 文本换行，0为截断，1为溢出，2为自动换行
     */
    private Integer textBeak;

    /**
     * 原始值
     */
    private String value;

    /**
     * 显示值
     */
    private String monitor;

    /**
     * 公式
     */
    private String function;

    private Comment comment;

    /**
     * 是否允许编辑
     */
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
}
