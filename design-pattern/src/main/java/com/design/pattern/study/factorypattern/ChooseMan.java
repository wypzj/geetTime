package com.design.pattern.study.factorypattern;

import com.design.pattern.study.factorypattern.common.*;

/**
 * @author a small asshole
 * @version 1.0
 * @description 选择人类
 * 根据不同的人种选择对应的创造器
 * @date in 13:06 2020/2/25
 * @since 1.0
 */
public class ChooseMan {
    public static void main(String[] args) {
        //不用设计模式
        Man man = null;
        String character = getCharacter();
        if ("black".equalsIgnoreCase(character)) {
            man = new BlackMan();
        } else if ("white".equalsIgnoreCase(character)) {
            man = new WhiteMan();
        }
        assert man != null;
        man.talk();
        System.out.println("-------------");
        //简单工厂模式
        SimpleFactory.loadMan(character).talk();
        System.out.println("---------");
        //工厂方法模式:缺点判断逻辑又回到了调用方中
        ManFactory manFactory = null;
        if ("black".equalsIgnoreCase(character)) {
            manFactory = new BlackManFactory();
        } else if ("white".equalsIgnoreCase(character)) {
            manFactory = new WhiteManFactory();
        }
        assert manFactory != null;
        manFactory.createMan().talk();
    }

    private static String getCharacter() {
        return "black";
    }
}
