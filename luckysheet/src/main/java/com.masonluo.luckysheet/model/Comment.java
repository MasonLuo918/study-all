package com.masonluo.luckysheet.model;

/**
 * 批注
 *
 * @author Masonluo
 * @date 2020-09-25 16:44
 */
public class Comment {
    private Integer left;

    private Integer top;

    private Integer width;

    private Integer height;

    private String value;

    private boolean isShow;

    public Comment(Integer left, Integer top, Integer width, Integer height, String value, boolean isShow) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
        this.value = value;
        this.isShow = isShow;
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
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }
}
