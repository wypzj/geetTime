package com.design.pattern.study.strategypattern.customestrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author a small asshole
 * @version 1.0
 * @description 表明这是一个策略类
 * @date in 16:21 2020/4/28
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Strategy {
    /**
     * 策略类的名称标识
     * @return
     */
    String name();
}
