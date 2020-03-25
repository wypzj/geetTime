package com.design.pattern.study.flyweightpattern.withpattern;


import java.util.HashMap;
import java.util.Map;

/**
 * @author a small asshole
 * @version 1.0
 * @description 网吧
 * @date in 17:00 2020/3/25
 * @since 1.0
 */
public class InternetBarWithPattern {
    private Map<Integer, ComputerWithPattern> computerMap = new HashMap<>();

    public InternetBarWithPattern() {
        init();
    }

    private void init() {
        computerMap.put(1, new ComputerWithPattern(ComputerUnitFactory.getComputer(1), 0,1));
        computerMap.put(2, new ComputerWithPattern(ComputerUnitFactory.getComputer(2), 0, 1));
        computerMap.put(3, new ComputerWithPattern(ComputerUnitFactory.getComputer(3), 1, 2));
    }

    public void show() {
        for (Integer num : computerMap.keySet()) {
            System.out.println(num + "-" + computerMap.get(num));
        }
    }
}
