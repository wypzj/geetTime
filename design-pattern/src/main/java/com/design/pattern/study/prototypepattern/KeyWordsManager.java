package com.design.pattern.study.prototypepattern;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StopWatch;

import java.util.HashMap;
import java.util.List;

/**
 * @author a small asshole
 * @version 1.0
 * @description 关键词管理类----原型模式
 * @date in 11:07 2020/5/26
 * @since 1.0
 */
public class KeyWordsManager {
    /**
     * 关键词hash
     */
    private HashMap<String, KeyWord> concurrentMap = new HashMap<>();
    /**
     * 上次更新时间
     */
    private Long lastUpdateTime = -1L;

    /**
     * 浅拷贝
     */
    public void refreshMapShallow() {
        List<KeyWord> keyWordsInDataBase = getKeyWordsInDataBase(lastUpdateTime);
        if (!CollectionUtils.isEmpty(keyWordsInDataBase)) {
            int initialCapacity = (int) ((keyWordsInDataBase.size() + concurrentMap.size()) / .75) + 1;
            HashMap<String, KeyWord> newHashMap = new HashMap<>(initialCapacity);
            //1.使用HashMap中的clone方法
            //newHashMap = (HashMap<String, KeyWord>)concurrentMap.clone();
            //2. 使用putAll方法，效果都一样
            newHashMap.putAll(concurrentMap);
            Long newMaxUpdateTime = lastUpdateTime;
            for (KeyWord keyWord : keyWordsInDataBase) {
                if (keyWord.getUpdateTime() > newMaxUpdateTime) {
                    newMaxUpdateTime = keyWord.getUpdateTime();
                }
                String keyWordName = keyWord.getKeyWordName();
                KeyWord oldKeyWord = newHashMap.get(keyWordName);
                if (oldKeyWord != null){
                    oldKeyWord.setKeyWordName(keyWord.getKeyWordName());
                    oldKeyWord.setSearchTime(keyWord.getSearchTime());
                    oldKeyWord.setUpdateTime(keyWord.getUpdateTime());
                }else {
                    newHashMap.put(keyWordName, keyWord);
                }
                concurrentMap = newHashMap;
            }
        }
    }

    /**
     * 深拷贝
     */
    public void refreshMapDeep() {
        List<KeyWord> keyWordsInDataBase = getKeyWordsInDataBase(lastUpdateTime);
        if (!CollectionUtils.isEmpty(keyWordsInDataBase)) {
            int initialCapacity = (int) ((keyWordsInDataBase.size() + concurrentMap.size()) / .75) + 1;
            HashMap<String, KeyWord> newHashMap = new HashMap<>(initialCapacity);
            //1.使用HashMap中的clone方法
            //newHashMap = (HashMap<String, KeyWord>)concurrentMap.clone();
            //2. 使用putAll方法，效果都一样
            newHashMap.putAll(concurrentMap);
            Long newMaxUpdateTime = lastUpdateTime;
            for (KeyWord keyWord : keyWordsInDataBase) {
                if (keyWord.getUpdateTime() > newMaxUpdateTime) {
                    newMaxUpdateTime = keyWord.getUpdateTime();
                }
                String keyWordName = keyWord.getKeyWordName();
                //remove方法如果对应的key不存在，remove返回null，不会报错
                newHashMap.remove(keyWordName);
                newHashMap.put(keyWordName,keyWord);
                concurrentMap = newHashMap;
            }
        }
    }

    /**
     * 查询数据库获取大于{@code time}的关键词信息
     *
     * @param time
     * @return
     */
    private List<KeyWord> getKeyWordsInDataBase(Long time) {
        //TODO 查询数据库，这里就不实现了
        return null;
    }
}
