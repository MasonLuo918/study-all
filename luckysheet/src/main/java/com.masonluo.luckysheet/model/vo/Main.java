package com.masonluo.luckysheet.model.vo;

/**
 * @author Masonluo
 * @date 2020-10-21 14:50
 */
public class Main {
    public static void main(String[] args) {
        Holder<InsertRowColumn> holder = new Holder<>(new InsertRowColumn());
        Holder h = holder;
        InsertRowColumn s = (InsertRowColumn) h.getData();
    }
}
