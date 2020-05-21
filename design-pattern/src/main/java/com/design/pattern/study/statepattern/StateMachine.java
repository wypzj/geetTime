package com.design.pattern.study.statepattern;

import com.design.pattern.study.statepattern.stateinstance.IMario;
import com.design.pattern.study.statepattern.stateinstance.SmallMario;

/**
 * @author a small asshole
 * @version 1.0
 * @description 状态机管理类
 * @date in 11:04 2020/5/20
 * @since 1.0
 */
public class StateMachine {
    private IMario iMario;
    private Integer score;

    public StateMachine(){
        this.iMario = SmallMario.getInstance();
        this.score = 0;
    }

    /**
     * 得到蘑菇
     */
    public void obtainMoGu(){
        this.iMario.obtainMoGu(this);
    }

    /**
     * 遇见怪物
     */
    public void meetMonster(){
        this.iMario.meetMonster(this);
    }

    public State getStateName(){
        return this.iMario.getSateName();
    }

    public IMario getiMario() {
        return iMario;
    }

    public void setiMario(IMario iMario) {
        this.iMario = iMario;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
