package com.masonluo.luckysheet.model.border;

/**
 * @author Masonluo
 * @date 2020-09-25 17:18
 */
public abstract class BorderInfo {

    private RangeType rangeType;

    public BorderInfo(RangeType rangeType) {
        this.rangeType = rangeType;
    }

    public enum RangeType {
        CELL("cell"),
        RANGE("range");

        private String type;

        RangeType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
