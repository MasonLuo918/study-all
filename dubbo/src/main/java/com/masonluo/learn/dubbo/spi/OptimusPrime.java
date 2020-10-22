package com.masonluo.learn.dubbo.spi;

/**
 * @author Masonluo
 * @date 2020-10-13 20:14
 */
public class OptimusPrime implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
