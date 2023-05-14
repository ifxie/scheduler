package com.aston.annotation;

import java.lang.annotation.*;

/**
 * JWT请求忽略注解
 * @author zck
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JwtIgnore {
}
