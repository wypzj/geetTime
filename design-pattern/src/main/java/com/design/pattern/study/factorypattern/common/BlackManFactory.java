package com.design.pattern.study.factorypattern.common;

/**
 * @author a small asshole
 * @version 1.0
 * @description 黑人工厂
 * @date in 15:09 2020/2/25
 * @since 1.0
 */
public class BlackManFactory implements ManFactory {
    @Override
    public Man createMan() {
        return new BlackMan();
    }
}
