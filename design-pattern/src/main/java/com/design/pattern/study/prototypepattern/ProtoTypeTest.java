package com.design.pattern.study.prototypepattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 原型模式测试类
 * @date in 14:14 2020/5/26
 * @since 1.0
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        KeyWordsManager keyWordsManager = new KeyWordsManager();
        //浅拷贝
        keyWordsManager.refreshMapShallow();
        //深拷贝
        keyWordsManager.refreshMapDeep();
    }
}
