package com.masonluo.luckysheet.model;

import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-09-25 17:10
 */
public class SheetConfig {
    private Map<RowColPair, MergeCell> merge;

    private Map<String, Integer> rowLen;

    private Map<String, Integer> columnLen;

    private Map<String, Integer> rowHidden;

    private Map<String, Integer> colHidder;

}
