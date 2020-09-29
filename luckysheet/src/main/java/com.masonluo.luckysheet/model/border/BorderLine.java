package com.masonluo.luckysheet.model.border;

import com.masonluo.luckysheet.model.Color;

import java.util.Objects;

/**
 * @author Masonluo
 * @date 2020-09-27 15:02
 */
public class BorderLine {
    private LineStyle style;

    private Color color;

    public LineStyle getStyle() {
        return style;
    }

    public void setStyle(LineStyle style) {
        this.style = style;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BorderLine that = (BorderLine) o;
        return style == that.style &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(style, color);
    }

    @Override
    public String toString() {
        return "BorderLine{" +
                "style=" + style +
                ", color=" + color +
                '}';
    }
}
