package com.masonluo.learn.dubbo.spi;

/**
 * @author Masonluo
 * @date 2020-10-13 20:15
 */
public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}
