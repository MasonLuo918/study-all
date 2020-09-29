package com.masonluo.luckysheet.model.border;

/**
 * @author Masonluo
 * @date 2020-09-27 15:06
 */

public enum LineStyle {
    THIN(1, "Thin"),
    HAIR(2, "Hair");
    private Integer id;

    private String style;

    LineStyle(Integer id, String style) {
        this.id = id;
        this.style = style;
    }

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
}