package com.design.pattern.study.chainofresponsibilityPattern.realizebylink;

/**
 * @author a small asshole
 * @version 1.0
 * @description 抽象处理类
 * @date in 16:39 2020/5/11
 * @since 1.0
 */
public abstract class AbstractHandler {
    /**
     * 下一个handler
     */
    protected AbstractHandler nextHandler;

    /**
     * handler执行抽象方法
     * @param content 文本
     * @return 包含返回true，不包含返回false
     */
    protected abstract boolean doHandle(String content);

    /**
     * 判断是否在链路上继续向下传播
     */
    public final boolean handle(String content){
        boolean flag = doHandle(content);
        //如果下一个handler不等于空，就继续在链路上向下传播
        if (!flag && nextHandler != null){
            flag = nextHandler.handle(content);
        }
        return !flag;
    }

    protected void setNextHandler(AbstractHandler handler){
        this.nextHandler = nextHandler;
    }
}
