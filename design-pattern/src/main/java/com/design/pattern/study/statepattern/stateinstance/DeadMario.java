package com.design.pattern.study.statepattern.stateinstance;

import com.design.pattern.study.statepattern.State;
import com.design.pattern.study.statepattern.StateMachine;

/**
 * @author a small asshole
 * @version 1.0
 * @description 死亡的mario
 * @date in 16:38 2020/5/20
 * @since 1.0
 */
public class DeadMario implements IMario{
    private static final IMario DEAD_MARIO_INSTANCE = new DeadMario();

    private DeadMario(){}

    public static IMario getInstance(){
        return DEAD_MARIO_INSTANCE;
    }

    @Override
    public State getSateName() {
        return State.DEAD;
    }

    @Override
    public void obtainMoGu(StateMachine stateMachine) {
        stateMachine.setScore(0);
        stateMachine.setiMario(SmallMario.getInstance());
    }

    @Override
    public void meetMonster(StateMachine stateMachine) {
        System.out.println("do nothing");
    }
}
