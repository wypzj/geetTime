package com.design.pattern.study.flyweightpattern.nopattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author a small asshole
 * @version 1.0
 * @description 网吧
 * @date in 17:00 2020/3/25
 * @since 1.0
 */
public class InternetBar {
    private Map<Integer, Computer> computerMap = new HashMap<Integer, Computer>();

    public InternetBar() {
        init();
    }

    private void init() {
        computerMap.put(1, new Computer(1, 15, "red", 0, 1));
        computerMap.put(2, new Computer(2, 14, "black", 0, 1));
        computerMap.put(3, new Computer(3, 13, "white", 1, 2));
    }

    public void show() {
        for (Integer num : computerMap.keySet()) {
            System.out.println(num + "-" + computerMap.get(num));
        }
    }
}
