package com.design.pattern.study.statepattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 状态模式测试类
 * @date in 11:41 2020/5/21
 * @since 1.0
 */
public class StatePatternTest {
    public static void main(String[] args) {
        StateMachine machine = new StateMachine();
        System.out.println("mario吃到大蘑菇");
        machine.obtainMoGu();
        System.out.println(machine.getStateName()+","+machine.getScore());
        System.out.println("mario遇到怪物");
        machine.meetMonster();
        System.out.println(machine.getStateName()+","+machine.getScore());
    }
}
