package com.design.pattern.study.observerpattern.eventbusframe.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author a small asshole
 * @version 1.0
 * @description 标注当前方法可以接受bus传递的消息
 * @date in 17:24 2020/4/1
 * @since 1.0
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Subscribe {
}
