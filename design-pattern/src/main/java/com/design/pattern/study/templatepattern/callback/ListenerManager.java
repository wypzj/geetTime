package com.design.pattern.study.templatepattern.callback;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author a small asshole
 * @version 1.0
 * @description 观察者管理
 * @date in 14:20 2020/4/28
 * @since 1.0
 */
public class ListenerManager {
    private List<MyCallBackInter> list = new ArrayList<>(10);


    public void registe(MyCallBackInter callBackInter) {
        list.add(callBackInter);
    }

    public void doMatchCallBack(String message){
        for (MyCallBackInter callBack : list) {
            callBack.callBackMethod();
        }
    }
}
