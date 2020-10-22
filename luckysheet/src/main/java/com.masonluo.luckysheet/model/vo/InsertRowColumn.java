package com.masonluo.luckysheet.model.vo;

/**
 * @author Masonluo
 * @date 2020-10-21 14:43
 */
public class InsertRowColumn {

    /**
     * 是否插入的是行
     */
    private boolean row;

    /**
     * 开始新增的行号或者列号
     */
    private Integer index;

    /**
     * 新增的方向
     */
    private Integer direction;

    public boolean isRow() {
        return row;
    }

    public void setRow(boolean row) {
        this.row = row;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }
}
