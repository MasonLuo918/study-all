package com.masonluo.luckysheet.model.border;

/**
 * @author Masonluo
 * @date 2020-09-27 15:18
 */
public class CellBorderInfo extends BorderInfo {

    private CellBorder values;

    public CellBorderInfo() {
        super(RangeType.CELL);
    }

    public CellBorder getValues() {
        return values;
    }

    public void setValues(CellBorder values) {
        this.values = values;
    }
}
