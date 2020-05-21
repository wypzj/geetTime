package com.design.pattern.study.statepattern.stateinstance;

import com.design.pattern.study.statepattern.State;
import com.design.pattern.study.statepattern.StateMachine;

/**
 * @author a small asshole
 * @version 1.0
 * @description 超级big mario
 * @date in 16:37 2020/5/20
 * @since 1.0
 */
public class SuperMario implements IMario {
    private static final IMario SUPER_MARIO_INSTANCE = new SuperMario();

    private SuperMario() {
    }

    public static IMario getInstance() {
        return SUPER_MARIO_INSTANCE;
    }

    @Override
    public State getSateName() {
        return State.SUPER;
    }

    @Override
    public void obtainMoGu(StateMachine stateMachine) {
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void meetMonster(StateMachine stateMachine) {
        stateMachine.setiMario(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 200);
    }
}
