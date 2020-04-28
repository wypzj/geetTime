package com.design.pattern.study.templatepattern.callback;

/**
 * @author a small asshole
 * @version 1.0
 * @description 测试类
 * @date in 13:59 2020/4/28
 * @since 1.0
 */
public class CallBackTest {
    public static void main(String[] args) {
        /**
         * 异步回调
         */
        ListenerManager listenerManager = new ListenerManager();
        MainA mainA = new MainA();
        mainA.setListener(listenerManager, new MyCallBackInter() {
            @Override
            public void callBackMethod() {
                System.out.println("回调回调");
            }
        });
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程执行逻辑");
                System.out.println("子线程开始回调");
                listenerManager.doMatchCallBack("我子线程执行完了");
            }
        });
        thread.start();
    }
}
