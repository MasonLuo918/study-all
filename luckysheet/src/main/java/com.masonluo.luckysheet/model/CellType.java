package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 单元格值格式
 *
 * @author Masonluo
 * @date 2020-09-25 15:53
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class CellType {
    @JsonProperty("fa")
    private String format;

    @JsonProperty("t")
    private String type;

    public CellType() {
    }

    public CellType(String format, String type) {
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

    @Override
    public String toString() {
        return "CellType{" +
                "format='" + format + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
