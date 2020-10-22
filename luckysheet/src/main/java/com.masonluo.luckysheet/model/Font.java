package com.masonluo.luckysheet.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Masonluo
 * @date 2020-09-25 16:12
 */
public enum Font {
    TIMES_NEW_ROMAN(0, "Times New Roman"),
    ARIAL(1, "Arial"),
    TAHOMA(2, "Verdana"),
    VERDANA(3, "Verdana"),
    MICROSOFT_YAHEI(4, "Microsoft yahei"),
    SONG(5, "Song"),
    ST_HEITI(6, "St Heiti"),
    ST_KAITI(7, "St Kaiti"),
    ST_FANGSONG(8, "St FangSong"),
    ST_SONG(9, "St SONG"),
    CHINESE_NEW_WEI(10, "华文新魏"),
    CHINESE_BLOCK_LETTERS(11, "华文行楷"),
    CHINESE_LI(12, "华文隶书");
    private int id;

    private String font;

    Font(int id, String font) {
        this.id = id;
        this.font = font;
    }

    @JsonValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    @Override
    public String toString() {
        return "Font{" +
                "id=" + id +
                ", font='" + font + '\'' +
                '}';
    }
}
