package com.masonluo.learn.spring._Ioc进阶_模块装配;

/**
 * @author Masonluo
 * @date 2020-10-16 09:49
 */
public class Bartender {
    private String name;

    public Bartender() {
    }

    public Bartender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
