package com.masonluo.java.advance.course.prepare.jvm;

/**
 * @author Masonluo
 * @date 2020-09-20 16:25
 */
public class ForLoopTest {
    private static int[] numbers = {1, 6, 8};

    public static void main(String[] args) {
        MovingAverage ma = new MovingAverage();
        for (int number : numbers) {
            ma.submit(number);
        }
        double avg = ma.getAvg();
    }
}
