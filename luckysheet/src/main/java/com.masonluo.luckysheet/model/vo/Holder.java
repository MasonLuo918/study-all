package com.masonluo.luckysheet.model.vo;

/**
 * @author Masonluo
 * @date 2020-10-21 14:49
 */
public class Holder<T> {
    T data;

    public Holder() {
    }

    public Holder(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
