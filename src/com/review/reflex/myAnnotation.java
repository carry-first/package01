package com.review.reflex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 20:49
 */
@Target({ElementType.MODULE, ElementType.FIELD, ElementType.TYPE})
public @interface myAnnotation {
    String value();

    String name();

    String ClassName();

    String methodk();
}
