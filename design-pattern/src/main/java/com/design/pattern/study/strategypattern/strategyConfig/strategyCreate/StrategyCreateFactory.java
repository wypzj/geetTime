package com.design.pattern.study.strategypattern.strategyConfig.strategyCreate;

import com.design.pattern.study.strategypattern.strategyConfig.strategyDefine.StrategyA;
import com.design.pattern.study.strategypattern.strategyConfig.strategyDefine.StrategyB;
import com.design.pattern.study.strategypattern.strategyConfig.strategyDefine.StrategyInter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author a small asshole
 * @version 1.0
 * @description 策略创建工厂
 * @date in 15:39 2020/4/28
 * @since 1.0
 */
public class StrategyCreateFactory {
    private static Map<String, StrategyInter> STRATEGY_MAP = new HashMap<>(8);

    //当每个策略类都是无状态时，可以使用静态代码块提前创建所有的策略类实例，避免每次使用策略类时都新建
    static {
        STRATEGY_MAP.put("A", new StrategyA());
        STRATEGY_MAP.put("B", new StrategyB());
    }

    /**
     * 根据{@param strategyType}创建对应的strategy
     *
     * @param strategyType
     * @return
     */
    public static StrategyInter createSingleStrategy(String strategyType) {
        if (strategyType == null || strategyType.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return STRATEGY_MAP.get(strategyType);
    }

    /**
     * 根据{@param strategyType}创建对应的strategy
     *
     * @param strategyType
     * @return
     */
    public static StrategyInter createNewStrategy(String strategyType) {
        if (strategyType == null || strategyType.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        if ("A".equals(strategyType)) {
            return new StrategyA();
        } else if ("B".equals(strategyType)) {
            return new StrategyB();
        }
        //匹配不上应该抛异常
        throw new TypeNotPresentException(strategyType, null);
    }
}
