package com.design.pattern.study.adapterpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 基于继承的适配模式
 * @date 2020/3/17
 * @since 1.0
 */
public class AdaptorWithExtend extends Adaptee implements TargetInter {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        super.fb();
    }
}
