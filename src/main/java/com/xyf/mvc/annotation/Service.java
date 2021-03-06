package com.xyf.mvc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //作用在字段上面
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {
	String value() default "";

}
