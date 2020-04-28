package com.design.pattern.study.strategypattern.customestrategy;

import com.design.pattern.study.strategypattern.strategyConfig.strategyDefine.StrategyInter;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author a small asshole
 * @version 1.0
 * @description 注解扫描测试类
 * @date in 16:49 2020/4/28
 * @since 1.0
 */
public class AnnotationStrategyTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Map<String, StrategyInter> map = new HashMap<>(8);
        File file = new File("target/classes/com/design/pattern/study/strategypattern/strategyConfig/strategyDefine");
        for (File childFile : file.listFiles()) {
            String className = childFile.getName().replace(".class", "");
            Class<?> strategyClass = Class.forName("com.design.pattern.study.strategypattern.strategyConfig.strategyDefine."+className);
            boolean flag = strategyClass.isAnnotationPresent(Strategy.class);
            if (flag) {
                map.put(strategyClass.getAnnotation(Strategy.class).name(),(StrategyInter)strategyClass.newInstance());
            }
        }
        for (StrategyInter strategy : map.values()) {
            strategy.strategyMethod();
        }
    }
}
