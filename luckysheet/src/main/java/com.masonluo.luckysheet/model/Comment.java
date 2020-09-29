package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 批注
 *
 * @author Masonluo
 * @date 2020-09-25 16:44
 */
public class Comment {

    /**
     * 批注左边框距离工作表边缘的位置
     */
    private Integer left;

    /**
     * 批注上边框距离工作表边缘的位置
     */
    private Integer top;

    /**
     * 批注边框宽度
     */
    private Integer width;

    /**
     * 批注边框高度
     */
    private Integer height;

    private String value;

    /**
     * 是否显示
     */
    @JsonProperty("isshow")
    private boolean show;

    public Comment(Integer left, Integer top, Integer width, Integer height, String value, boolean show) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
        this.value = value;
        this.show = show;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
