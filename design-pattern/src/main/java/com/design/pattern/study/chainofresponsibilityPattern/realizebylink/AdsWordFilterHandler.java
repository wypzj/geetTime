package com.design.pattern.study.chainofresponsibilityPattern.realizebylink;

/**
 * @author a small asshole
 * @version 1.0
 * @description 广告信息过滤处理类
 * @date in 17:15 2020/5/11
 * @since 1.0
 */
public class AdsWordFilterHandler extends AbstractHandler {
    @Override
    protected boolean doHandle(String content) {
        if (content.contains("广告")) {
            return true;
        }
        return false;
    }
}
