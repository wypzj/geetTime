package com.design.pattern.study.flyweightpattern.withpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author a small asshole
 * @version 1.0
 * @description 电脑部件工厂类
 * @date in 17:34 2020/3/25
 * @since 1.0
 */
public class ComputerUnitFactory {
    private static final Map<Integer,ComputerUnit> COMPUTER_UNIT_MAP = new HashMap<>();

    static {
        COMPUTER_UNIT_MAP.put(1,new ComputerUnit(1,15,"red"));
        COMPUTER_UNIT_MAP.put(2,new ComputerUnit(2, 14, "black"));
        COMPUTER_UNIT_MAP.put(3,new ComputerUnit(3, 13, "white"));
    }

    public static ComputerUnit getComputer(int id){
        return COMPUTER_UNIT_MAP.get(id);
    }
}
