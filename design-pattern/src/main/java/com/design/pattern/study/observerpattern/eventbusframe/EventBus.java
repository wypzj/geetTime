package com.design.pattern.study.observerpattern.eventbusframe;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author a small asshole
 * @version 1.0
 * @description 同步事件总线
 * @date in 11:25 2020/4/2
 * @since 1.0
 */
public class EventBus {
    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();

    public EventBus(){
        this(MoreExecutors.directExecutor());
    }
    protected EventBus(Executor executor){
        this.executor = executor;
    }

    public void register(Object object) { registry.registry(object); }

    public void post(Object event){
        List<ObserverAction> matchedObserverActions = registry.getMatchedObserverActions(event);
        for (ObserverAction observerAction :
                matchedObserverActions) {
            executor.execute(() -> {
                observerAction.execute(event);
            });
        }
    }
}
