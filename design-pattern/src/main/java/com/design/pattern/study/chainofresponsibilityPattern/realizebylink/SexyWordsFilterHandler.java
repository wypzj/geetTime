package com.design.pattern.study.chainofresponsibilityPattern.realizebylink;

/**
 * @author a small asshole
 * @version 1.0
 * @description 色情关键字处理类
 * @date in 17:00 2020/5/11
 * @since 1.0
 */
public class SexyWordsFilterHandler extends AbstractHandler{
    @Override
    protected boolean doHandle(String content) {
        if (content.contains("seqing")){
            return true;
        }
        return false;
    }
}
