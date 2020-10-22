package com.masonluo.learn.spring._Ioc进阶_模块装配;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Masonluo
 * @date 2020-10-16 09:47
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class})
public @interface EnableTavern {
}
