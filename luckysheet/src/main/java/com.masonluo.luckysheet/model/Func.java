package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Masonluo
 * @date 2020-09-27 15:26
 */
public class Func {

    /**
     * 行号
     */
    @JsonProperty("r")
    private int row;

    /**
     * 列号
     */
    @JsonProperty("c")
    private int col;

    /**
     * 工作表id
     */
    @JsonProperty("index")
    private int index;

    /**
     * Object数组，第0个元素为boolean，第1个元素为计算出来的值，第2个元素为公式的字符串值
     */
    @JsonProperty("func")
    private Object[] func;

    /**
     * 采用什么算法，"w"为深度优先搜索，"b"为普通计算
     */
    @JsonProperty("color")
    private String alogrithm;

    /**
     * TODO 未知属性
     */
    @JsonProperty("parent")
    private Object parent;

    /**
     * TODO 未知属性
     */
    @JsonProperty("children")
    private Object children;

    @JsonProperty("times")
    private int times;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object[] getFunc() {
        return func;
    }

    public void setFunc(Object[] func) {
        this.func = func;
    }

    public String getAlogrithm() {
        return alogrithm;
    }

    public void setAlogrithm(String alogrithm) {
        this.alogrithm = alogrithm;
    }

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public Object getChildren() {
        return children;
    }

    public void setChildren(Object children) {
        this.children = children;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
}
