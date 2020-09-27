package com.masonluo.luckysheet.model;

/**
 * @author Masonluo
 * @date 2020-09-25 15:53
 */
public enum CellType {
    AUTO("General", "g"),
    INTEGER("@", "s");

    private String format;

    private String type;

    CellType(String format, String type) {
        this.format = format;
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
