package com.design.pattern.study.flyweightpattern;

import com.design.pattern.study.flyweightpattern.nopattern.InternetBar;
import com.design.pattern.study.flyweightpattern.withpattern.InternetBarWithPattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 测试类
 * @date in 17:30 2020/3/25
 * @since 1.0
 */
public class FlyWeightTestCode {
    public static void main(String[] args) {
        //不使用设计模式
        InternetBar internetBar = new InternetBar();
        internetBar.show();

        //使用享元模式
        InternetBarWithPattern internetBarWithPattern = new InternetBarWithPattern();
        internetBarWithPattern.show();
    }
}
