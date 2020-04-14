package com.design.pattern.study.templatepattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 模板方法抽象父类--定义算法（业务处理）骨架
 * @date in 11:44 2020/4/14
 * @since 1.0
 */
public abstract class AbstractTemplateClass {
    public void doLogin(String userName){
        System.out.println("开始登录，效验用户名和相关信息");
        //.....业务处理
        boolean flag = templateMethod1();
        if (flag){
            //...业务处理
            templateMethod2();
        }
    }

    /**
     * 模板方法1
     * @return
     */
    public abstract boolean templateMethod1();

    /**
     * 模板方法2
     */
    public abstract void templateMethod2();
}
