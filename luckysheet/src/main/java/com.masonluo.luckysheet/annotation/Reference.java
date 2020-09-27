package com.masonluo.luckysheet.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Masonluo
 * @date 2020-09-25 15:29
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface Reference {
    String value() default "";

    String comment() default "";
}
