package com.design.pattern.study.templatepattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 模板方法测试类
 * @date in 11:50 2020/4/14
 * @since 1.0
 */
public class TemplateMethodTestClass {
    public static void main(String[] args) {
        System.out.println("----模板方法测试");
        ConcreteTemplateSubClass concreteTemplateSubClass = new ConcreteTemplateSubClass();
        concreteTemplateSubClass.doLogin("卫云鹏");
    }
}
