package com.design.pattern.study.chainofresponsibilityPattern.realizebylink;

/**
 * @author a small asshole
 * @version 1.0
 * @description 责任链类
 * @date in 17:17 2020/5/11
 * @since 1.0
 */
public class HandlerChain {
    /**
     * 链表头
     */
    public AbstractHandler headHandler;
    /**
     * 链表尾
     */
    public AbstractHandler tailHandler;

    public void addHandler(AbstractHandler handler){
        handler.setNextHandler(null);
        if (headHandler == null){
            this.headHandler = handler;
            this.tailHandler = handler;
        }
        //当前tailHandler的下一个handler设置成当前方法参数handler，再将当前方法参数handler添加到链表尾部
        tailHandler.setNextHandler(handler);
        tailHandler = handler;
    }

    public boolean handle(String content){
        //返回当前内容是否合法 合法：true，不合法：false
        return this.headHandler.handle(content);
    }
}
