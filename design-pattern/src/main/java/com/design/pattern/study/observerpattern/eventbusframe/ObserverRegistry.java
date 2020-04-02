package com.design.pattern.study.observerpattern.eventbusframe;

import com.design.pattern.study.observerpattern.eventbusframe.annotations.Subscribe;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
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

    public void registry(Object event){
        // 查找所有的ObserverAction
        Map<Class<?>, Collection<ObserverAction>> allObserverActions = findAllObserverActions(event);
        // 判断registryTable中是否
        for (Map.Entry<Class<?>,Collection<ObserverAction>> entry : allObserverActions.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventValue = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> registryTableValue = registryTable.get(eventType);
            if (registryTableValue == null){
                registryTable.putIfAbsent(eventType,new CopyOnWriteArraySet<>());
                registryTableValue = registryTable.get(eventType);
            }
            registryTableValue.addAll(eventValue);
        }
    }
    private Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer){
        // 获取observer类中被subscribe注解标注的方法，获取方法的参数类型
        Map<Class<?>, Collection<ObserverAction>> observerActions = new HashMap<>(16);
        Class<?> observerTypeClass = observer.getClass();
        for (Method method : getAllAnnotationsMethod(observerTypeClass)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> eventTypeClass = parameterTypes[0];
            if (!observerActions.containsKey(eventTypeClass)){
                observerActions.put(eventTypeClass,new ArrayList<>());
            }
            observerActions.get(eventTypeClass).add(new ObserverAction(observer,method));
        }
        return observerActions;
    }

    private List<Method> getAllAnnotationsMethod(Class<?> observerTypeClass){
        List<Method> methodList = new ArrayList<>();
        for (Method method : observerTypeClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)){
                methodList.add(method);
            }
        }
        return methodList;
    }

    public List<ObserverAction> getMatchedObserverActions(Object event){
        List<ObserverAction> matchedObservers = new ArrayList<>();
        Class<?> eventType = event.getClass();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registryTable.entrySet()) {
            Class<?> eventTypeInTable = entry.getKey();
            CopyOnWriteArraySet<ObserverAction> entryValue = entry.getValue();
            //判断eventType是否是eventTypeInTable的同类型，超类或者超接口
            if (eventType.isAssignableFrom(eventTypeInTable)){
                matchedObservers.addAll(entryValue);
            }
        }
        return matchedObservers;
    }

}
