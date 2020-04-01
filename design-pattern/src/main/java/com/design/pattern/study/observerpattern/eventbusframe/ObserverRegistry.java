package com.design.pattern.study.observerpattern.eventbusframe;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author a small asshole
 * @version 1.0
 * @description Observer注册表
 * @date in 17:51 2020/4/1
 * @since 1.0
 */
public class ObserverRegistry {
    private ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registryTable = new ConcurrentHashMap<>(16);

    public void registry(Object observer){
        //TODO 根据observer的类类型，查找所有的ObserverAction

        //TODO 判断registryTable中是否

    }
    public Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer){
        return null;
    }

}
