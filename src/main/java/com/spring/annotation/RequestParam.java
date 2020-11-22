package com.spring.annotation;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)   // 元注解
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default "";
}
