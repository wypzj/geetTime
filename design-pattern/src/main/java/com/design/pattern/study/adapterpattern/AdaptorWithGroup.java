package com.design.pattern.study.adapterpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 基于组合的适配模式
 * @date 2020/3/17
 * @since 1.0
 */
public class AdaptorWithGroup implements TargetInter {
    private Adaptee adaptee;

    public AdaptorWithGroup(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        adaptee.fb();
    }
}
