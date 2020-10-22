package com.masonluo.luckysheet.model.border;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Masonluo
 * @date 2020-09-27 15:06
 */

public enum LineStyle {
    THIN(1, "Thin"),
    HAIR(2, "Hair"),
    DOTTED(3, "Dotted"),
    DASHED(4, "Dashed"),
    DASH_DOT(5, "Dash dot"),
    DASH_DOT_DOT(6, "Dash dot dot"),
    DOUBLE(7, "Double"),
    MEDIUM(8, "Medium"),
    MEDIUM_DASHED(9, "Medium Dashed"),
    MEDIUM_DASH_DOT(10, "Medium Dash Dot"),
    MEDIUM_DASH_DOT_DOT(11, "Medium Dash Dot Dot"),
    SLANTED_DASH_DOT(12, "Slanted Dash Dot"),
    THICK(13, "Thick");
    private Integer id;

    private String style;

    LineStyle(Integer id, String style) {
        this.id = id;
        this.style = style;
    }

    @JsonValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public static LineStyle getById(int id) {
        for (LineStyle style : LineStyle.values()) {
            if (style.getId().equals(id)) {
                return style;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "LineStyle{" +
                "id=" + id +
                ", style='" + style + '\'' +
                '}';
    }
}