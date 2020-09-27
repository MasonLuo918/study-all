package com.masonluo.luckysheet.model;

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
    SONG(5, "song");
    private int id;

    private String font;

    Font(int id, String font) {
        this.id = id;
        this.font = font;
    }

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
}
