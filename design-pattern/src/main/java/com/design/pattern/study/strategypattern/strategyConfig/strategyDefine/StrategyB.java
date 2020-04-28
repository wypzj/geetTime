package com.design.pattern.study.strategypattern.strategyConfig.strategyDefine;

import com.design.pattern.study.strategypattern.customestrategy.Strategy;

/**
 * @author a small asshole
 * @version 1.0
 * @description 策略B
 * @date in 15:31 2020/4/28
 * @since 1.0
 */
@Strategy(name = "B")
public class StrategyB implements StrategyInter{
    @Override
    public void strategyMethod() {
        System.out.println("策略B");
    }
}
