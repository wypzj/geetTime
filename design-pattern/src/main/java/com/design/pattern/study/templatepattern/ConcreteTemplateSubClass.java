package com.design.pattern.study.templatepattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 模板方法具体实现子类
 * @date in 11:49 2020/4/14
 * @since 1.0
 */
public class ConcreteTemplateSubClass extends AbstractTemplateClass {
    @Override
    public boolean templateMethod1() {
        System.out.println("子类实现templateMethod1");
        return true;
    }

    @Override
    public void templateMethod2() {
        System.out.println("子类实现templateMethod2");
    }
}
