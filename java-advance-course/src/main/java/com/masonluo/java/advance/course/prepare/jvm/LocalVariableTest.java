package com.masonluo.java.advance.course.prepare.jvm;

/**
 * @author Masonluo
 * @date 2020-09-20 16:19
 */
public class LocalVariableTest {
    public static void main(String[] args) {
        MovingAverage ma = new MovingAverage();
        int num1 = 1;
        int num2 = 2;
        ma.submit(num1);
        ma.submit(num2);
        double avg = ma.getAvg();
    }
}
