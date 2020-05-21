package com.design.pattern.study.statepattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 状态枚举
 * @date in 13:42 2020/5/20
 * @since 1.0
 */
public enum State {
    /**
     * 小型状态
     */
    SMALL(0),
    /**
     * 超级状态
     */
    SUPER(1),
    /**
     * 死亡状态
     */
    DEAD(2);
    private Integer value;

    State(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return this.value;
    }
}
