package com.masonluo.learn.spring._Ioc进阶_模块装配;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Masonluo
 * @date 2020-10-16 09:49
 */
public class Bootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Boss boss = ctx.getBean(Boss.class);
    }
}
