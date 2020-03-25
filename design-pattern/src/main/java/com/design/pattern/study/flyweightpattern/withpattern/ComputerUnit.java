package com.design.pattern.study.flyweightpattern.withpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 电脑部件
 * @date in 17:35 2020/3/25
 * @since 1.0
 */
public class ComputerUnit {
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

    public ComputerUnit() {
    }

    public ComputerUnit(Integer numberId, Integer size, String color) {
        this.numberId = numberId;
        this.size = size;
        this.color = color;
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

    @Override
    public String toString() {
        return "ComputerUnit{" +
                "numberId=" + numberId +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
