package com.masonluo.learn.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Masonluo
 * @date 2020-10-16 09:39
 */
public class QuickstartListenerApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.masonluo.learn.spring.event");
        context.close();
    }
}
