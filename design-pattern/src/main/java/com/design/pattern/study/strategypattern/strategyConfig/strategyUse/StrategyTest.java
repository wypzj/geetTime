package com.design.pattern.study.strategypattern.strategyConfig.strategyUse;

import com.design.pattern.study.strategypattern.strategyConfig.strategyCreate.StrategyCreateFactory;
import com.design.pattern.study.strategypattern.strategyConfig.strategyDefine.StrategyA;
import com.design.pattern.study.strategypattern.strategyConfig.strategyDefine.StrategyInter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author a small asshole
 * @version 1.0
 * @description 策略模式测试类
 * @date in 16:01 2020/4/28
 * @since 1.0
 */
public class StrategyTest {
    public static void main(String[] args) throws IOException {
        /** 运行时动态指定使用哪个策略
         ** 1.通过方法参数，有前端页面传递策略标识符
         **/
        StrategyInter strategyA = chooseStrategy("A");
        /**
         * 2.通过配置文件，设置策略标识符
         */
        Properties props = new Properties();
        props.load(new FileInputStream("./config.properties"));
        String type = props.getProperty("eviction_type");
        StrategyInter strategyA2 = chooseStrategy(type);

        /**
         * 非运行时动态指定使用哪个策略：就是代码new直接写死用哪个策略
         */
    }

    public static StrategyInter chooseStrategy(String type){
        return StrategyCreateFactory.createSingleStrategy(type);
    }
}
