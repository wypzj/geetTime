package com.design.pattern.study.prototypepattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 关键词信息类
 * @date in 11:05 2020/5/26
 * @since 1.0
 */
public class KeyWord {
    private String keyWordName;
    private Long updateTime;
    private Long searchTime;

    public String getKeyWordName() {
        return keyWordName;
    }

    public void setKeyWordName(String keyWordName) {
        this.keyWordName = keyWordName;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(Long searchTime) {
        this.searchTime = searchTime;
    }
}
