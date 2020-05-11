package com.design.pattern.study.chainofresponsibilityPattern.realizebylink;

/**
 * @author a small asshole
 * @version 1.0
 * @description TODO
 * @date in 17:25 2020/5/11
 * @since 1.0
 */
public class HandlerChainTest {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new SexyWordsFilterHandler());
        handlerChain.addHandler(new AdsWordFilterHandler());

        //过滤色情关键词
        boolean legal = handlerChain.handle("seqing");
        if (legal){
            System.out.println("内容合法");
        }else{
            System.out.println("内容不合法");
        }
    }
}
