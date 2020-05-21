package com.design.pattern.study.statepattern.stateinstance;

import com.design.pattern.study.statepattern.State;
import com.design.pattern.study.statepattern.StateMachine;

/**
 * @author a small asshole
 * @version 1.0
 * @description 状态接口
 * @date in 11:40 2020/5/20
 * @since 1.0
 */
public interface IMario {

    /**
     * 获取当前状态name
     * @return
     */
    State getSateName();

    /**
     * 得到蘑菇
     * @param stateMachine
     */
    void obtainMoGu(StateMachine stateMachine);

    /**
     * 遇见怪物
     * @param stateMachine
     */
    void meetMonster(StateMachine stateMachine);
}
