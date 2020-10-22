package com.masonluo.luckysheet.model.vo;

/**
 * @author Masonluo
 * @date 2020-10-21 14:22
 */
public class SheetOperation {
    private Integer code;

    private Long id;

    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SheetOperation{" +
                "code=" + code +
                ", id=" + id +
                ", data=" + data +
                '}';
    }
}
