package com.design.pattern.study.flyweightpattern.withpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 电脑
 * @date in 17:08 2020/3/25
 * @since 1.0
 */
public class ComputerWithPattern {

    /**
     * 电脑部件
     */
    private ComputerUnit computerUnit;
    /**
     * 电脑放置位置X
     */
    private Integer positionX;
    /**
     * 电脑放置位置Y
     */
    private Integer positionY;

    public ComputerWithPattern() {
    }

    public ComputerWithPattern(ComputerUnit computerUnit,Integer positionX, Integer positionY) {
        this.computerUnit = computerUnit;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return "ComputerWithPattern{" +
                "computerUnit=" + computerUnit +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
