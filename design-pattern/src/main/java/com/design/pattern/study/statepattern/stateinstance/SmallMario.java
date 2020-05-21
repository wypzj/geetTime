package com.design.pattern.study.statepattern.stateinstance;

import com.design.pattern.study.statepattern.State;
import com.design.pattern.study.statepattern.StateMachine;

/**
 * @author a small asshole
 * @version 1.0
 * @description 小mario状态类
 * @date in 11:42 2020/5/20
 * @since 1.0
 */
public class SmallMario implements IMario{
    private static final IMario SMALL_MARIO_INSTANCE = new SmallMario();

    private SmallMario(){}

    public static IMario getInstance(){
        return SMALL_MARIO_INSTANCE;
    }
    @Override
    public State getSateName() {
        return State.SMALL;
    }

    @Override
    public void obtainMoGu(StateMachine stateMachine) {
        stateMachine.setiMario(SuperMario.getInstance());
        stateMachine.setScore(stateMachine.getScore()+200);
    }

    @Override
    public void meetMonster(StateMachine stateMachine) {
        stateMachine.setiMario(DeadMario.getInstance());
        stateMachine.setScore(0);
    }
}
