package com.design.pattern.study.flyweightpattern.nopattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 电脑
 * @date in 17:08 2020/3/25
 * @since 1.0
 */
public class Computer {
    /**
     * 电脑编号
     */
    private Integer numberId;
    /**
     * 电脑尺寸
     */
    private Integer size;
    /**
     * 颜色
     */
    private String color;
    /**
     * 电脑放置位置X
     */
    private Integer positionX;
    /**
     * 电脑放置位置Y
     */
    private Integer positionY;

    public Computer() {
    }

    public Computer(Integer numberId, Integer size, String color, Integer positionX, Integer positionY) {
        this.numberId = numberId;
        this.size = size;
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Computer{" +
                "numberId=" + numberId +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
