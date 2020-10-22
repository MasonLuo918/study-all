package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * (r,g,b) 三原色
 *
 * @author Masonluo
 * @date 2020-09-25 16:04
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Color {
    private int r;

    private int g;

    private int b;

    public Color() {
    }

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @JsonValue
    @Override
    public String toString() {
        return "rgb(" + r + "," + g + "," + b + ")";
    }
}
