package com.design.pattern.study.factorypattern;

import com.design.pattern.study.factorypattern.common.BlackMan;
import com.design.pattern.study.factorypattern.common.Man;
import com.design.pattern.study.factorypattern.common.WhiteMan;

/**
 * @author a small asshole
 * @version 1.0
 * @description 简单工厂模式
 * @date in 21:33 2020/2/24
 * @since 1.0
 */
public class SimpleFactory {
    public static Man loadMan(String character) {
        Man man = null;
        if ("black".equalsIgnoreCase(character)) {
            man = new BlackMan();
        } else if ("white".equalsIgnoreCase(character)) {
            man = new WhiteMan();
        }
        return man;
    }
}
