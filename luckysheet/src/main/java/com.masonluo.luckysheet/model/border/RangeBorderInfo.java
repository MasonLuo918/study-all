package com.masonluo.luckysheet.model.border;

import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-27 15:09
 */
public class RangeBorderInfo extends BorderInfo {

    private String borderType;

    private LineStyle style;

    private String color;

    private List<Range> range;

    public RangeBorderInfo() {
        super(RangeType.RANGE);
    }

    public interface BorderType {
        String BORDER_ALL = "border-all";

        String BORDER_LEFT = "border-left";
    }

    public String getBorderType() {
        return borderType;
    }

    public void setBorderType(String borderType) {
        this.borderType = borderType;
    }

    public LineStyle getStyle() {
        return style;
    }

    public void setStyle(LineStyle style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Range> getRange() {
        return range;
    }

    public void setRange(List<Range> range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "RangeBorderInfo{" +
                "borderType='" + borderType + '\'' +
                ", style=" + style +
                ", color='" + color + '\'' +
                ", range=" + range +
                '}';
    }
}
