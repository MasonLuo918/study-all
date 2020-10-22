package com.masonluo.luckysheet.model.border;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.masonluo.luckysheet.Conveter.RangeTypeDeserializer;
import com.masonluo.luckysheet.Conveter.RangeTypeSerializer;

import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-25 17:18
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BorderInfo {

    @JsonProperty("rangeType")
    @JsonSerialize(using = RangeTypeSerializer.class)
    @JsonDeserialize(using = RangeTypeDeserializer.class)
    private RangeType rangeType;

    @JsonProperty("value")
    private CellBorder values;

    @JsonProperty("borderType")
    private String borderType;

    @JsonProperty("style")
    private String style;

    @JsonProperty("color")
    private String color;

    @JsonProperty("range")
    private List<Range> range;

    public BorderInfo() {
    }

    public BorderInfo(RangeType rangeType) {
        this.rangeType = rangeType;
    }

    public enum RangeType {
        CELL("cell"),
        RANGE("range");

        private final String type;

        RangeType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public static RangeType getByType(String type) {
            for (RangeType rangeType : RangeType.values()) {
                if (rangeType.getType().equals(type)) {
                    return rangeType;
                }
            }
            return null;
        }
    }

    public RangeType getRangeType() {
        return rangeType;
    }

    public void setRangeType(RangeType rangeType) {
        this.rangeType = rangeType;
    }

    public CellBorder getValues() {
        return values;
    }

    public void setValues(CellBorder values) {
        this.values = values;
    }

    public String getBorderType() {
        return borderType;
    }

    public void setBorderType(String borderType) {
        this.borderType = borderType;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
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
        return "BorderInfo{" +
                "rangeType=" + rangeType +
                ", values=" + values +
                ", borderType='" + borderType + '\'' +
                ", style='" + style + '\'' +
                ", color='" + color + '\'' +
                ", range=" + range +
                '}';
    }
}
